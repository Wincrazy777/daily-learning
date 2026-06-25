package com.小游戏.fightgame.domain;

public class Character {

    public String name; //名字
    public int HP; //当前生命
    public int maxHP; //最大生命
    public int attack; //攻击力
    public int defense; //防御力

    public Character() {
    }

    public Character(String name, int HP, int maxHP, int attack, int defense) {
        this.name = name;
        this.HP = HP;
        this.maxHP = HP;
        this.attack = attack;
        this.defense = defense;
    }

    //1.判断是否存活
    public boolean isAlive() {
        return HP > 0;
    }

    //2.恢复血量
    public void heal(int amount) {
        HP += amount;
        if (HP > maxHP) {
            HP = maxHP;
        }
    }

    //3.受到伤害
    //受到了N点伤害之后，还有多少点血
    //作用：具体收到了多少点伤害
    public void takeDamage(int damage) {
        HP = HP - damage;
        if (HP < 0) {
            HP = 0;
        }
    }

    //4.展示一下人物的属性
    public String show() {
        return name + "[当前生命" + HP + ",攻击" + attack + ",防御" + defense + "]";
    }

}
