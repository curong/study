package wooj.study.designpattern.strategy.game_example.weapon;

import wooj.study.designpattern.strategy.game_example.controller.Weapon;

public class Sword implements Weapon {

    @Override
    public void attack() {
        System.out.println("검 공격");
    }
    
}
