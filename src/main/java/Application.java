import champions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {

    public static void main(String[] args) {

        Champions joueur1 = new Chevalier("Serval", 30, 20);
        Champions joueur2 = new Archer("Ramone", 18, 15);
        Champions joueur3 = new Mage("Yaloupe", 20, 5);

        List<Champions> championsList = new ArrayList<>();
        championsList.add(joueur1);
        championsList.add(joueur2);
        championsList.add(joueur3);

        int i = 3;

        while (i > 1) {

            Random InitialChampionRandom = new Random();
            int championRandom = InitialChampionRandom.nextInt(4);

            if(championsList.contains(joueur1) && championRandom == 1) {

                if(championsList.contains(joueur2)) {

                    joueur1.attaque(joueur2);

                    if (joueur2.getLife() <= 0) {
                        championsList.remove(joueur2);
                        i--;
                        System.out.println("!!! " + joueur2.getName() + " a été tué par " + joueur1.getName() + " !!!! ");
                    }
                    else {
                        System.out.println("---> " + joueur2.getName() + " dispose de " + joueur2.getLife() + " point de vie");
                    }

                }

                else if(championsList.contains(joueur3)) {

                    joueur1.attaque(joueur3);

                    if (joueur3.getLife() <= 0) {
                        championsList.remove(joueur3);
                        i--;
                        System.out.println("!!! " + joueur3.getName() + " a été tué par " + joueur1.getName() + " !!!! ");
                    }
                    else {
                        System.out.println("---> " + joueur3.getName() + " dispose de " + joueur3.getLife() + " point de vie");
                    }

                }

                Random r1 = new Random();
                if(r1.nextInt(2) == 1) { joueur1.setProtection(true); }
            }

            else if(championsList.contains(joueur2) && championRandom == 2) {

                if(championsList.contains(joueur1)) {

                    joueur2.attaque(joueur1);

                    if(joueur2.isDoubleAtaque()) { joueur2.attaque(joueur1); }

                    if (joueur1.getLife() <= 0) {
                        championsList.remove(joueur1);
                        i--;
                        System.out.println("!!! " + joueur1.getName() + " a été tué par " + joueur2.getName() + " !!!! ");
                    }
                    else {
                        System.out.println("---> " + joueur1.getName() + " dispose de " + joueur1.getLife() + " point de vie");
                    }

                }

                else if(championsList.contains(joueur3)) {

                    joueur2.attaque(joueur3);

                    if(joueur2.isDoubleAtaque()) { joueur2.attaque(joueur3); }

                    if (joueur3.getLife() <= 0) {
                        championsList.remove(joueur3);
                        i--;
                        System.out.println("!!! " + joueur3.getName() + " a été tué par " + joueur2.getName() + " !!!! ");
                    }
                    else {
                        System.out.println("---> " + joueur3.getName() + " dispose de " + joueur3.getLife() + " point de vie");
                    }

                }

                Random r2a = new Random();
                if(r2a.nextInt(2) == 1) { joueur2.setProtection(true); }

                Random r2b = new Random();
                if(r2b.nextInt(2) == 1) { joueur2.setDoubleAtaque(true); }
            }

            else if(championsList.contains(joueur3) && championRandom == 3) {

                if(championsList.contains(joueur1)) {

                    joueur3.attaque(joueur1);

                    if (joueur1.getLife() <= 0) {
                        championsList.remove(joueur1);
                        i--;
                        System.out.println("!!! " + joueur1.getName() + " a été tué par " + joueur3.getName() + " !!!! ");
                    }
                    else {
                        System.out.println("---> " + joueur1.getName() + " dispose de " + joueur1.getLife() + " point de vie");
                    }

                }

                else if(championsList.contains(joueur2)) {

                    joueur3.attaque(joueur2);

                    if (joueur2.getLife() <= 0) {
                        championsList.remove(joueur2);
                        i--;
                        System.out.println("!!! " + joueur2.getName() + " a été tué par " + joueur3.getName() + " !!!! ");
                    }
                    else {
                        System.out.println("---> " + joueur2.getName() + " dispose de " + joueur2.getLife() + " point de vie");
                    }

                }

                Random r3 = new Random();
                if(r3.nextInt(2) == 1) { joueur3.setProtection(true); }
            }

        }
        if(i == 1) {
            System.out.println("!!! Le gagnant du combat est : " + championsList.get(0).getName() + " !!!");
        }
    }
}
