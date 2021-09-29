package eric.learn.StrategyPattern;

public class Troll extends Character{
    public Troll(){
        weapon = new KnifeBehavior();
    }

    public void fight(){
        System.out.println("刺客开始战斗了！");
        super.fight();
    }
}
