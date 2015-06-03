package Character;

/**
 * Created by User on 03.06.2015.
 */
public abstract class Character {
    private int id;
    private boolean isAlive;
    private String name;
    private int hitPoint;
    private final int maxHitPoint = 100;
    private int repairSkill;
    private final int maxRepairSkill = 100;
    private int shootSkill;
    private final int maxShootSkill = 100;
    private int shipSkill;
    private final int maxShipSkill = 100;
    private int fightSkill;
    private final int maxFightSkill = 100;
    private String location;

    public Character(int id, String name) {
        this.setDefault();
        this.id = id;
        this.name = name;
        this.hitPoint = maxHitPoint;
        //this.location = "CommandRoom?";??
    }

    private void setDefault() {
        this.hitPoint = maxHitPoint;
        this.repairSkill = 5;
        this.shootSkill = 5;
        this.shipSkill = 5;
        this.fightSkill = 5;
        this.isAlive = true;
    }

    public void setHitPoint (int changeHitPoint){
        hitPoint += changeHitPoint;
        if (hitPoint > maxHitPoint){
            hitPoint = maxHitPoint;
        }
        if (hitPoint <= 0){
            hitPoint = 0;
            isAlive = false;
        }
    }

    public int getHitPoint (){
        return hitPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHitPoint() {
        return maxHitPoint;
    }


    public int getRepairSkill() {
        return repairSkill;
    }

    public void setRepairSkill(int changeRepairSkill) {
        this.repairSkill += changeRepairSkill;
        if (repairSkill > maxRepairSkill){
            repairSkill = maxRepairSkill;
        }
    }

    public int getMaxRepairSkill() {
        return maxRepairSkill;
    }

    public int getShootSkill() {
        return shootSkill;
    }

    public void setShootSkill(int changeShootSkill) {
        this.shootSkill += changeShootSkill;
        if (shootSkill > maxShootSkill){
            shootSkill = maxShootSkill;
        }
    }

    public int getMaxShootSkill() {
        return maxShootSkill;
    }

    public int getShipSkill() {
        return shipSkill;
    }

    public void setShipSkill(int changeShipSkill) {
        this.shipSkill += changeShipSkill;
        if (shipSkill > maxShipSkill){
            shipSkill = maxShipSkill;
        }
    }

    public int getMaxShipSkill() {
        return maxShipSkill;
    }

    public int getFightSkill() {
        return fightSkill;
    }

    public void setFightSkill(int changeFightSkill) {
        this.fightSkill += changeFightSkill;
        if (fightSkill > maxFightSkill){
            fightSkill = maxFightSkill;
        }
    }

    public int getMaxFightSkill() {
        return maxFightSkill;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
