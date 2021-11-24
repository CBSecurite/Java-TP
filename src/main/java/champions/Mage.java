package champions;

public class Mage extends Champions {

    public Mage(String name, int force, int defense, boolean soin, boolean protection) {
        super(name, force, defense, soin, protection);
    }

    public void attaque(Champions champions) {
        if(this != champions) {
            if(champions.isProtection()) {
                champions.setProtection(false);
                System.out.println(champions.getName() + " n'a subit aucun degat grace a sa protection");
            }
            else {
                int degatSubit = this.getForce() - champions.getDefense();
                if(champions.isSoin()) {
                    degatSubit = degatSubit - 10;
                }
                int LifeMoinsDegatSubit = champions.getLife() - degatSubit;
                champions.setLife(LifeMoinsDegatSubit);
                System.out.println(this.getName() + " a attaqué " + champions.getName() + " et lui a fait subir " + degatSubit + " de dégat.");
            }
        }
        else {
            System.out.println(this.getName() + " ne peut pas attaquer " + champions.getName());
        }
    }
}
