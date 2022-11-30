package wooj.study.designpattern.strategy.game_example;

import wooj.study.designpattern.strategy.game_example.character.GameCharacter;
import wooj.study.designpattern.strategy.game_example.weapon.Axe;
import wooj.study.designpattern.strategy.game_example.weapon.Bow;
import wooj.study.designpattern.strategy.game_example.weapon.Sword;

public class Main {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();

        gameCharacter.attack();

        gameCharacter.setWeapon(new Bow());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Sword());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Axe());
        gameCharacter.attack();


    }
}
