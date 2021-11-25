package champions;

import java.util.Objects;
import java.util.Random;

public class Archer extends Champions {

    public Archer(String name, int force, int defense) {
        super(name, force, defense);
        this.setTypeChampion("archer");
    }

    public void attaque(Champions champions) {

        if(this != champions) {

            Random initialRandomAttaque = new Random();
            int randomAttaque = initialRandomAttaque.nextInt(20);
            int degatSubit = (this.getForce() + randomAttaque) - champions.getDefense();
            String infoSoin = "";

            if(champions.isProtection()) {

                if(Objects.equals(champions.getTypeChampion(), "chevalier")) {
                    System.out.println(champions.getName() + " n'a subit aucun degat grace a sa protection lors de l'attaque de " + this.getName());
                }

                else {

                    degatSubit = degatSubit / 2;

                    if(champions.isSoin()) {
                        degatSubit = degatSubit - 10;
                        infoSoin = " dont 10 de soin en moins";
                    }

                    int LifeMoinsDegatSubit = champions.getLife() - degatSubit;
                    champions.setLife(LifeMoinsDegatSubit);
                    System.out.println(champions.getName() + " n'a subit que la moitier des degats (" + degatSubit + infoSoin + ") grace a sa protection lors de l'attaque de " + this.getName());
                }

                champions.setProtection(false);
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
