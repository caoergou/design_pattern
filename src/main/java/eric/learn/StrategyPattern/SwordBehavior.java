package eric.learn.StrategyPattern;

public class SwordBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("使用宝剑挥舞！深藏若拙，临机取决！");
    }
    
}
