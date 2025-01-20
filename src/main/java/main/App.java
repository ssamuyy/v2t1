package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Anna auton merkki: ");
        String merkki = sc.nextLine();
        System.out.print("Anna auton malli: ");
        String malli = sc.nextLine();

        Car car = new Car();
        car.asetaMerkki(merkki);
        car.asetaMalli(malli);
        
        boolean exit = false;
        while(!exit) {
            System.out.println("1) Näytä auton tila");
            System.out.println("2) Muokkaa auton merkkiä ja mallia");
            System.out.println("3) Kiihdytä autoa");
            System.out.println("4) Hidasta autoa");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        car.status();
                        break;
                    case 2:
                        System.out.print("Anna uusi auton merkki: ");
                        String newMerkki = sc.nextLine();
                        System.out.print("Anna uusi auton malli: ");
                        String newMalli = sc.nextLine();
                        car.asetaMerkki(newMerkki);
                        car.asetaMalli(newMalli);
                        break;
                    case 3:
                        System.out.print("Kuinka monta km/h haluat kiihdyttää? ");
                        int increase = Integer.parseInt(sc.nextLine());
                        car.kiihdyta(increase);
                        break;
                    case 4:
                        System.out.print("Kuinka monta km/h haluat hidastaa? ");
                        int decrease = Integer.parseInt(sc.nextLine());
                        car.hidasta(decrease);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        sc.close();
                        return;
                    default:
                        System.out.println("Syöte oli väärä. Yritä uudelleen.");
                }
            }
        }
    }
}
