package com.小游戏.fightgame.domain;

public class EnemyCharacter extends Character {

    public String skill; //技能只有一个
    public boolean defending; //当前人物是否有防御状态的编写

    public EnemyCharacter() {
        super();
    }

    public EnemyCharacter(String name, int HP, int maxHP, int attack, int defense, String skill, boolean defending) {
        super(name, HP, maxHP, attack, defense);
        this.skill = skill;
        this.defending = defending;
    }

    @Override
    public void takeDamage(int damage) {
        // 如果处于防御状态，伤害减半
        if (defending) {
            damage = damage / 2 > 1 ? damage / 2 : 1;
            //防御状态只能持续一个回合
            defending = false;
        }
        //调用父类的方法，扣除血量
        super.takeDamage(damage);
    }

}
