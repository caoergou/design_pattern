package eric.learn.StrategyPattern;

public abstract class Character {
    WeaponBehavior weapon;
    
    void fight(){
        weapon.useWeapon();
    };

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public WeaponBehavior getWeapon() {
        return weapon;
    }
}
