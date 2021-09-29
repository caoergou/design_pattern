package eric.learn.StrategyPattern;

public class King extends Character {
    public King(){
        weapon = new SwordBehavior();
    }

    public void fight(){
        System.out.println("骑士开始战斗了！");
        super.fight();
    }
}
