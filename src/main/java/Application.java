import champions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {

    public static void main(String[] args) {

        Champions chevalier = new Chevalier("Serval", 30, 10);
        Champions archer = new Archer("Ramone", 25, 8);
        Champions mage = new Mage("Yaloupe", 15, 5);

        List<Champions> championsList = new ArrayList<>();
        championsList.add(chevalier);
        championsList.add(archer);
        championsList.add(mage);

        int i = 3;

        while (i > 1) {

            Random InitialChampionRandom = new Random();
            int championRandom = InitialChampionRandom.nextInt(4);

            if(championsList.contains(chevalier) && championRandom == 1) {

                if(championsList.contains(archer)) {

                    chevalier.attaque(archer);

                    if (archer.getLife() <= 0) {
                        championsList.remove(archer);
                        i--;
                        System.out.println("!!! " + archer.getName() + " a été tué par " + chevalier.getName() + " !!!! ");
                    }

                    System.out.println(archer.getName() + " dispose de " + archer.getLife() + " point de vie");
                }

                if(championsList.contains(mage)) {

                    chevalier.attaque(mage);

                    if (mage.getLife() <= 0) {
                        championsList.remove(mage);
                        i--;
                        System.out.println("!!! " + mage.getName() + " a été tué par " + chevalier.getName() + " !!!! ");
                    }

                    System.out.println(mage.getName() + " dispose de " + mage.getLife() + " point de vie");
                }

                Random r1 = new Random();
                if(r1.nextInt(2) == 1) { chevalier.setProtection(true); }
            }

            if(championsList.contains(archer) && championRandom == 2) {

                if(championsList.contains(chevalier)) {

                    archer.attaque(chevalier);

                    if(archer.isDoubleAtaque()) { archer.attaque(chevalier); }

                    if (chevalier.getLife() <= 0) {
                        championsList.remove(chevalier);
                        i--;
                        System.out.println("!!! " + chevalier.getName() + " a été tué par " + archer.getName() + " !!!! ");
                    }

                    System.out.println(chevalier.getName() + " dispose de " + chevalier.getLife() + " point de vie");
                }

                if(championsList.contains(mage)) {

                    archer.attaque(mage);

                    if(archer.isDoubleAtaque()) { archer.attaque(mage); }

                    if (mage.getLife() <= 0) {
                        championsList.remove(mage);
                        i--;
                        System.out.println("!!! " + mage.getName() + " a été tué par " + archer.getName() + " !!!! ");
                    }

                    System.out.println(mage.getName() + " dispose de " + mage.getLife() + " point de vie");
                }

                Random r2a = new Random();
                if(r2a.nextInt(2) == 1) { archer.setProtection(true); }

                Random r2b = new Random();
                if(r2b.nextInt(2) == 1) { archer.setDoubleAtaque(true); }
            }

            if(championsList.contains(mage) && championRandom == 3) {

                if(championsList.contains(chevalier)) {

                    mage.attaque(chevalier);

                    if (chevalier.getLife() <= 0) {
                        championsList.remove(chevalier);
                        i--;
                        System.out.println("!!! " + chevalier.getName() + " a été tué par " + mage.getName() + " !!!! ");
                    }

                    System.out.println(chevalier.getName() + " dispose de " + chevalier.getLife() + " point de vie");
                }

                if(championsList.contains(archer)) {

                    mage.attaque(archer);

                    if (archer.getLife() <= 0) {
                        championsList.remove(archer);
                        i--;
                        System.out.println("!!! " + archer.getName() + " a été tué par " + mage.getName() + " !!!! ");
                    }

                    System.out.println(archer.getName() + " dispose de " + archer.getLife() + " point de vie");
                }

                Random r3 = new Random();
                if(r3.nextInt(2) == 1) { mage.setProtection(true); }
            }

        }
        if(i == 1) {
            System.out.println("!!! Le gagnant du combat est : " + championsList.get(0).getName() + " !!!");
        }
    }
}
