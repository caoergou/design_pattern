package eric.learn.StrategyPattern;

public class Knight extends Character{
    public Knight(){
        weapon = new AxeBehavior();
    }
    
    public void fight(){
        System.out.println("国王开始战斗了！");
        super.fight();
    }
}
