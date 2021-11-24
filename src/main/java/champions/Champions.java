package champions;

public abstract class Champions implements IChampions {

    private String name;
    private int life;
    private int force;
    private int defense;
    private boolean soin;
    private boolean protection;

    public Champions(String name, int force, int defense, boolean soin, boolean protection) {
        this.name = name;
        this.life = 100;
        this.force = force;
        this.defense = defense;
        this.soin = soin;
        this.protection = protection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public boolean isSoin() {
        return soin;
    }

    public void setSoin(boolean soin) {
        this.soin = soin;
    }

    public boolean isProtection() {
        return protection;
    }

    public void setProtection(boolean protection) {
        this.protection = protection;
    }

    @Override
    public String toString() {
        return "Champions{" +
                "name='" + name + '\'' +
                ", life=" + life +
                ", force=" + force +
                ", defense=" + defense +
                ", soin=" + soin +
                ", protection=" + protection +
                '}';
    }
}
