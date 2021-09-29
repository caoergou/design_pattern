package eric.learn.StrategyPattern;

public class Queen extends Character {
    public Queen(){
        weapon = new BowAndArrowBehavior();
    }

    public void fight(){
        System.out.println("女王开始战斗了！");
        super.fight();
    }
}
