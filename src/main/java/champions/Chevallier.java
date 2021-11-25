package champions;

public class Chevallier extends Champions {

    public Chevallier(String name, int force, int defense) {
        super(name, force, defense);
    }

    public void attaque(Champions champions) {
        if(this != champions) {
            if(champions.isProtection()) {
                champions.setProtection(false);
                System.out.println(champions.getName() + " n'a subit aucun degat grace a sa protection lors de l'attaque de " + this.getName());
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
