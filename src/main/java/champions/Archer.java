package champions;

import java.util.Objects;

public class Archer extends Champions {

    public Archer(String name, int force, int defense) {
        super(name, force, defense);
        this.setTypeChampion("archer");
    }

    public void attaque(Champions champions) {
        if(this != champions) {
            int degatSubit = this.getForce() - champions.getDefense();

            if(champions.isProtection()) {
                if(Objects.equals(champions.getTypeChampion(), "chevalier")) {
                    System.out.println(champions.getName() + " n'a subit aucun degat grace a sa protection lors de l'attaque de " + this.getName());
                }
                else {
                    degatSubit = degatSubit / 2;
                    if(champions.isSoin()) {
                        degatSubit = degatSubit - 10;
                    }
                    int LifeMoinsDegatSubit = champions.getLife() - degatSubit;
                    champions.setLife(LifeMoinsDegatSubit);
                    System.out.println(champions.getName() + " n'a subit que la moitier des degats (" + degatSubit + ") grace a sa protection lors de l'attaque de " + this.getName());
                }
                champions.setProtection(false);
            }
            else {
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
