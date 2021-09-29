package eric.learn.StrategyPattern;

public class CharacterTest {
    public static void main(String[] args) {
        Character currentCharacter = new Queen();
        currentCharacter.fight();
        
        // 策略模式不同于接口，而是将行为抽象成对象，使得其能够相互替换
        WeaponBehavior anotherWeapon = new SwordBehavior();
        currentCharacter.setWeapon(anotherWeapon);

        currentCharacter.fight();
    }
    
}
