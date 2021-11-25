import champions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {

    public static void main(String[] args) {

        Champions chevallier = new Chevallier("Serval", 20, 5);
        Champions archer = new Archer("Ramone", 25, 8);
        Champions mage = new Mage("Yaloupe", 15, 3);

        List<Champions> championsList = new ArrayList<>();
        championsList.add(chevallier);
        championsList.add(archer);
        championsList.add(mage);

        int i = 3;

        while (i > 1) {

            Random InitialChampionRandom = new Random();
            int championRandom = InitialChampionRandom.nextInt(4);

            if(championsList.contains(chevallier) && championRandom == 1) {
                if(championsList.contains(archer)) {
                    chevallier.attaque(archer);
                    if (archer.getLife() <= 0) {
                        championsList.remove(archer);
                        i--;
                        System.out.println(archer.getName() + " a été tué par " + chevallier.getName() + " !!!! ");
                    }
                    System.out.println(archer.getName() + " dispose de " + archer.getLife() + " point de vie");
                }
                if(championsList.contains(mage)) {
                    chevallier.attaque(mage);
                    if (mage.getLife() <= 0) {
                        championsList.remove(mage);
                        i--;
                        System.out.println(mage.getName() + " a été tué par " + chevallier.getName() + " !!!! ");
                    }
                    System.out.println(mage.getName() + " dispose de " + mage.getLife() + " point de vie");
                }

                Random r = new Random();
                if(r.nextInt(2) == 1) {
                    chevallier.setProtection(true);
                }
            }

            if(championsList.contains(archer) && championRandom == 2) {
                if(championsList.contains(chevallier)) {
                    archer.attaque(chevallier);
                    if (chevallier.getLife() <= 0) {
                        championsList.remove(chevallier);
                        i--;
                        System.out.println(chevallier.getName() + " a été tué par " + archer.getName() + " !!!! ");
                    }
                    System.out.println(chevallier.getName() + " dispose de " + chevallier.getLife() + " point de vie");
                }
                if(championsList.contains(mage)) {
                    archer.attaque(mage);
                    if (mage.getLife() <= 0) {
                        championsList.remove(mage);
                        i--;
                        System.out.println(mage.getName() + " a été tué par " + archer.getName() + " !!!! ");
                    }
                    System.out.println(mage.getName() + " dispose de " + mage.getLife() + " point de vie");
                }
            }

            if(championsList.contains(mage) && championRandom == 3) {
                if(championsList.contains(chevallier)) {
                    mage.attaque(chevallier);
                    if (chevallier.getLife() <= 0) {
                        championsList.remove(chevallier);
                        i--;
                        System.out.println(chevallier.getName() + " a été tué par " + mage.getName() + " !!!! ");
                    }
                    System.out.println(chevallier.getName() + " dispose de " + chevallier.getLife() + " point de vie");
                }
                if(championsList.contains(archer)) {
                    mage.attaque(archer);
                    if (archer.getLife() <= 0) {
                        championsList.remove(archer);
                        i--;
                        System.out.println(archer.getName() + " a été tué par " + mage.getName() + " !!!! ");
                    }
                    System.out.println(archer.getName() + " dispose de " + archer.getLife() + " point de vie");
                }
            }

        }
        if(i == 1) {
            System.out.println("!!! Le gagnant du combat est : " + championsList.get(0).getName() + " !!!");
        }
    }
}
