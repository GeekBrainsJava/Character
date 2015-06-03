package Character;

/**
 * Created by User on 03.06.2015.
 */
public class Human extends Character implements INeedBreath, INeedFood{
    private boolean canBreath;
    private int satiety; //сытость
    public Human(int id) {
        super(id, "Петрович");
        setDefault();
    }

    private void setDefault(){
        satiety = 100;
    }

    public boolean isCanBreath() {
        return canBreath;
    }

    public void setCanBreath(boolean canBreath) {
        this.canBreath = canBreath;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int changeSatiety) {
        this.satiety += changeSatiety;
    }

    @Override
    public void decreaseHealthDueToLackOfOxygen() {
        if (canBreath == false){
            setHitPoint(-30);
        }
    }

    @Override
    public void decreaseSatiety() {
        // Если еда на корабле = 0 - сытость понижается на 10
    }

    @Override
    public void decreaseHealthOutOfHungry() {
        if (satiety == 0){
            setHitPoint(-5);
        }
    }
}
