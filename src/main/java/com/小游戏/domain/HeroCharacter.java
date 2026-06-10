package com.小游戏.domain;

import java.util.ArrayList;

//我方的角色名称
public class HeroCharacter extends Character {

    public ArrayList<String> skillList; //技能列表

    //把集合对象也创建了
    //外界要给我方角色添加技能的时候，无需考虑集合，直接add就行了
    public HeroCharacter() {
        super();
        skillList = new ArrayList<>();
    }

    public HeroCharacter(String name, int HP, int maxHP, int attack, int defense, ArrayList<String> skillList) {
        super(name, HP, maxHP, attack, defense);
        skillList = new ArrayList<>();
    }

}
