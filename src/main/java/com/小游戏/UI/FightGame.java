package com.小游戏.UI;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.小游戏.domain.EnemyCharacter;
import com.小游戏.domain.HeroCharacter;

public class FightGame {

    //启动游戏
    public void gameStart(String username) {
        // 1.显示游戏的标题
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║                                          ║");
        System.out.println("║      ██     ██                           ║");
        System.out.println("║      ██     ██                           ║");
        System.out.println("║      █████████   欢迎来到                 ║");
        System.out.println("║      ██     ██   文字格斗游戏             ║");
        System.out.println("║      ██     ██                           ║");
        System.out.println("║                                          ║");
        System.out.println("║    ╔══════════════════════════╗          ║");
        System.out.println("║    ║  1. 登录                 ║          ║");
        System.out.println("║    ║  2. 注册                 ║          ║");
        System.out.println("║    ║  3. 退出                 ║          ║");
        System.out.println("║    ╚══════════════════════════╝          ║");
        System.out.println("║                                          ║");
        System.out.println("╚══════════════════════════════════════════╝");

        //2.创建玩家角色(名字+属性分配)
        HeroCharacter player = createPlayerCharacter(username);

        //3.显示创建角色的信息和技能列表
        System.out.println("角色创建成功！");
        System.out.println("⭐ 初始属性为：" + player.show());
        System.out.println("⭐ 拥有的技能" + player.showSkill());

        //4.创建多个敌人列表
        ArrayList<EnemyCharacter> enemyList = new ArrayList<>();
        enemyList.add(new EnemyCharacter("初级战士", 80, 80, 15, 10, "猛击", false));
        enemyList.add(new EnemyCharacter("敏捷刺客", 60, 60, 20, 5, "快速攻击", false));
        enemyList.add(new EnemyCharacter("重装坦克", 120, 120, 10, 20, "防御姿态", false));
        enemyList.add(new EnemyCharacter("初级战士", 70, 70, 25, 8, "火球术", false));

        //5.准备战斗(依次跟多个敌人战斗)
        int count = 1; //记录当前我是跟第几个敌人进行战斗
        int wins = 0; //记录了胜利了机场
        while (player.isAlive()) {
            //进入循环，开始准备战斗
            //5.1 重置敌人的属性，敌人属性每场HP+10,ATK+3,DEF+2(第二场开始增加)
            if (wins != 0) {
                //获取到每一个敌人的信息，进行属性点的增加
                for (int i = 0; i < enemyList.size(); i++) {
                    EnemyCharacter c = enemyList.get(i);
                    // maxHP+10
                    c.maxHP = c.maxHP + 10;
                    c.HP = c.maxHP;
                    // ATK+3
                    c.attack = c.attack + 3;
                    //DEF+2
                    c.defense = c.defense + 2;
                    //每场战斗之前，如果有减伤buff，需要清空
                    c.defending = false;
                }
            }

            //5.2随机抽取敌人
            Random r = new Random();
            int index = r.nextInt(enemyList.size());
            EnemyCharacter enemy = enemyList.get(index);
            System.out.println(enemy.show());

            //5.3 开始跟抽取到敌人进行战斗
            System.out.println("==============================================");
            System.out.println("⚔️ 第" + count + "场战斗开始！,对手是" + enemy.name);
            //    回合制(你打我一下我打你一下)
            //    内循环：跟单个敌人进行多轮战斗,知道有一方的血量为0才会结束
            int round = 1;
            while (player.isAlive()) {
                //显示双方的状态(生命值)
                System.out.println("=========================================");
                System.out.println("⚔️ 第" + round + "回合开始！");
                System.out.println(getHealthBar(player.name, player.HP, player.maxHP));
                System.out.println(getHealthBar(enemy.name, enemy.HP, enemy.maxHP));

                //5.4玩家回合，选择行动(1 普通攻击 / 2 强力一击 / 3 生命汲取)
                playerTurn(player, enemy);

                //5.5 判断敌人是否被击败
                //判断敌人的血量是否为0(结束内循环)
                if(!enemy.isAlive()){
                    System.out.println("🎆 恭喜你,你击败了"+enemy.name);
                    // 我方胜利了，连胜计数器++
                    wins++;
                    break;
                }
                //敌人打我一下
                //判断我的血量是否为0,如果为0,结束整个游戏
                //如果我的血量不为0,继续执行内循环,开始下一个回合 round++
            }
            //5.4 跟单个敌人结束战斗(结算，回血，3场增加我方人物的属性点，询问y/n)
        }

    }

    //用来创建一个玩家的角色
    //参数名：用户名
    public HeroCharacter createPlayerCharacter(String username) {
        System.out.println("创建您的角色：");
        System.out.println("您的角色名为：" + username);

        //属性分配
        int points = 20;

        //提示
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("请分配属性点(共20点)");
            System.out.println("1.生命值(每点 + 10HP)");
            System.out.println("2.攻击力(每点 + 2ATK)");
            System.out.println("3.防御力(每点 + 1DEF)");

            //定义数组把要提示的语句存起来
            String[] attributes = {"生命值", "攻击力", "防御力"};
            //定义数组记录一个三个属性分配的属性点
            int[] value = new int[3];

            //定义一个循环分配属性点
            for (int i = 0; i < attributes.length; i++) {
                System.out.println("分配点数到" + attributes[i] + "(剩余点数" + points + "):");
                //input表示当前用户键盘录入的数据(要分配的属性点)
                int input = sc.nextInt();

                // 如果说要分配的属性点为负数
                if (input < 0) {
                    System.out.println("无效输入!默认分配为0点");
                    input = 0;
                }

                // 如果分配点数超出剩余点数
                if (input > points) {
                    System.out.println("属性点不足！剩余属性点全部分配到：" + attributes[i]);
                    input = points;
                }

                //计算一下剩余还有多少个属性点
                points = points - input;

                //记录分配属性点
                value[i] = input;
            }
            //创建玩家角色的对象
            HeroCharacter player = new HeroCharacter(
                    username, //角色名
                    100 + value[0] * 10, //当前生命值
                    100 + value[0] * 10, //最大生命值（初始满血）
                    10 + value[1] * 2, //攻击力
                    0 + value[2] * 1 //防御力
            );
            //添加玩家的技能
            player.skillList.add("普通攻击");
            player.skillList.add("强力一击");
            player.skillList.add("生命回复");

            //展示创建的角色属性
            System.out.println(player.show());

            //把玩家的对象返回
            return player;
        }
    }

    //定义一个方法打印敌我双方的血条
    public String getHealthBar(String name, int HP, int maxHP) {
        int barLength = 20;
        int filled = (int) ((HP * 1.0 / maxHP) * barLength);
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(":[");
        for (int i = 0; i < barLength; i++) {
            if (i < filled) {
                sb.append("█");
            } else {
                sb.append(" ");
            }
        }
        sb.append("]").append(HP).append("/").append(maxHP).append(" HP");
        return sb.toString();
    }

    // 玩家回合：选择行动(1 普通攻击 2 强力一击 3 生命汲取)
    public void playerTurn(HeroCharacter player, EnemyCharacter enemy) {
        System.out.println("==== 你的回合 ===");
        System.out.println("1.普通攻击");
        System.out.println("2.强力一击");
        System.out.println("3.生命汲取");
        System.out.println("选择行动(1-3)");
        try (Scanner sc = new Scanner(System.in)) {
            String choose = sc.next();
            switch (choose) {
                default:
                    System.out.println("没有这个操作,默认使用普通攻击");
                case "1":
                    // 我方的攻击力 - 对方的防御力 = 伤害值
                    int damage1 = calculateDamage(player.attack, enemy.defense);
                    System.out.println("⚔️ 你对" + enemy.name + "造成了" + damage1 + "点伤害");
                    //敌人扣血
                    enemy.takeDamage(damage1);
                    break;
                case "2":
                    // 消耗10HP 造成180%攻击力的伤害
                    if (player.HP > 10) {
                        player.takeDamage(10);
                        int damage2 = calculateDamage((int) (player.attack * 1.8), enemy.defense);
                        System.out.println("💥 消耗10HP,你对" + enemy.name + "造成了" + damage2 + "点伤害");
                        enemy.takeDamage(damage2);
                    } else {
                        System.out.println("体力不足,攻击失败");
                    }
                    break;
                case "3":
                    // 扣除10点生命值,恢复0-20点生命值
                    if (player.HP > 10) {
                        player.takeDamage(10);
                        //恢复血量
                        Random r = new Random();
                        int healHP = r.nextInt(21);
                        player.heal(healHP);
                        System.out.println("❤️ 你使用了生命汲取,回复了" + healHP + "点生命值");
                    } else {
                        System.out.println("生命值不足,恢复生命失败");
                    }
                    break;
            }
        }
    }

    //用来计算双方战斗的时候，造成的伤害
    //普通攻击的调用方式：calculateDamage（我方攻击力，对方的防御力）
    ////技能攻击的调用方式：calculateDamage（我方攻击力*百分比，对方的防御力）
    public int calculateDamage(int attack, int defense) {
        int damage = attack - defense;
        if (damage < 1) {
            return 1;
        }
        return damage;
    }
}
