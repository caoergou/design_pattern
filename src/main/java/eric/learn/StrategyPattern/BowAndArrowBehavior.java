package eric.learn.StrategyPattern;

public class BowAndArrowBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("使用弓箭射击！听说你喜欢月亮？我给你射一个下来！");
    }
    
}
