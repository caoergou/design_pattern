package eric.learn.StrategyPattern;

public class KnifeBehavior implements WeaponBehavior{

    @Override
    public void useWeapon() {
        System.out.println("使用匕首进行刺杀！十步杀一人，千里不留名！");
    }
    
}
