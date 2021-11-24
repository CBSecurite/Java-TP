import champions.*;

import java.util.ArrayList;
import java.util.List;


public class Application {

    public static void main(String[] args) {

        Champions chevallier = new Chevallier("Serval", 20, 5, false, false);
        Champions archer = new Archer("Ramone", 18, 15, false, false);
        Champions mage = new Mage("Yaloupe", 15, 7, true, false);

        List<Champions> championsList = new ArrayList<>();
        championsList.add(chevallier);
        championsList.add(archer);
        championsList.add(mage);

        int i = 3;
        while (i > 1) {
            if(championsList.contains(chevallier)) {
                if(championsList.contains(archer)) {
                    chevallier.attaque(archer);
                    if (archer.getLife() <= 0) {
                        championsList.remove(archer);
                        i--;
                        System.out.println(archer.getName() + " est mort !!!!");
                    }
                    System.out.println(archer.getName() + " dispose de " + archer.getLife() + " point de vie");
                }
                if(championsList.contains(mage)) {
                    chevallier.attaque(mage);
                    if (mage.getLife() <= 0) {
                        championsList.remove(mage);
                        i--;
                        System.out.println(mage.getName() + " est mort !!!!");
                    }
                    System.out.println(mage.getName() + " dispose de " + mage.getLife() + " point de vie");
                }
                chevallier.setProtection(true);
            }

            if(championsList.contains(archer)) {
                if(championsList.contains(chevallier)) {
                    archer.attaque(chevallier);
                    if (chevallier.getLife() <= 0) {
                        championsList.remove(chevallier);
                        i--;
                        System.out.println(chevallier.getName() + " est mort !!!!");
                    }
                    System.out.println(chevallier.getName() + " dispose de " + chevallier.getLife() + " point de vie");
                }
                if(championsList.contains(mage)) {
                    archer.attaque(mage);
                    if (mage.getLife() <= 0) {
                        championsList.remove(mage);
                        i--;
                        System.out.println(mage.getName() + " est mort !!!!");
                    }
                    System.out.println(mage.getName() + " dispose de " + mage.getLife() + " point de vie");
                }
            }

            if(championsList.contains(mage)) {
                if(championsList.contains(chevallier)) {
                    mage.attaque(chevallier);
                    if (chevallier.getLife() <= 0) {
                        championsList.remove(chevallier);
                        i--;
                        System.out.println(chevallier.getName() + " est mort !!!!");
                    }
                    System.out.println(chevallier.getName() + " dispose de " + chevallier.getLife() + " point de vie");
                }
                if(championsList.contains(archer)) {
                    mage.attaque(archer);
                    if (archer.getLife() <= 0) {
                        championsList.remove(archer);
                        i--;
                        System.out.println(archer.getName() + " est mort !!!!");
                    }
                    System.out.println(archer.getName() + " dispose de " + archer.getLife() + " point de vie");
                }
            }

        }
        if(i == 1) {
            System.out.println("Le gagnant est " + championsList.get(0).getName());
        }
    }
}
