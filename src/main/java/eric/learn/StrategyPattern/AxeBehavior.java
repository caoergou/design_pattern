package eric.learn.StrategyPattern;

public class AxeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("使用斧头劈砍！买瓜吗？我给你劈！");
    }
    
}
