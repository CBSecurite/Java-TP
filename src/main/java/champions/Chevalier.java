package champions;

public class Chevalier extends Champions {

    public Chevalier(String name, int force, int defense) {
        super(name, force, defense);
        this.setTypeChampion("chevalier");
    }

    public void attaque(Champions champions) {

        if(this != champions) {

            int degatSubit = this.getForce() - champions.getDefense();
            String infoSoin = "";

            if(champions.isProtection()) {

                degatSubit = degatSubit / 2;

                if(champions.isSoin()) {
                    degatSubit = degatSubit - 10;
                    infoSoin = " dont 10 de soin en moins";
                }

                int LifeMoinsDegatSubit = champions.getLife() - degatSubit;
                champions.setLife(LifeMoinsDegatSubit);
                champions.setProtection(false);
                System.out.println(champions.getName() + " n'a subit que la moitier des degats (" + degatSubit + infoSoin + ") grace a sa protection lors de l'attaque de " + this.getName());
            }

            else {

                if(champions.isSoin()) {
                    degatSubit = degatSubit - 10;
                    infoSoin = " (dont 10 de soin en moins)";
                }

                int LifeMoinsDegatSubit = champions.getLife() - degatSubit;
                champions.setLife(LifeMoinsDegatSubit);
                System.out.println(this.getName() + " a attaqué " + champions.getName() + " et lui a fait subir " + degatSubit + " de dégat" + infoSoin + ".");
            }
        }
        else {
            System.out.println(this.getName() + " ne peut pas attaquer " + champions.getName());
        }
    }
}
