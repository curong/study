package wooj.study.designpattern.strategy.game_example.character;

import wooj.study.designpattern.strategy.game_example.controller.Weapon;

public class GameCharacter {

    // 접근점
    private Weapon weapon;

    // 교환
    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }

    // 엮어서 사용
    public void attack()
    {

        if (weapon == null)
        {
            System.out.println("무기를 장착해 주세요!");
        } else {
            weapon.attack();
        }

    }

}
