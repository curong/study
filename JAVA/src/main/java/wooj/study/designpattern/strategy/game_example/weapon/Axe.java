package wooj.study.designpattern.strategy.game_example.weapon;

import wooj.study.designpattern.strategy.game_example.controller.Weapon;

public class Axe implements Weapon {
    @Override
    public void attack() {
        System.out.println("도끼 공격");
    }
}
