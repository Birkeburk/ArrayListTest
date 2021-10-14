import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        boolean programRunning = true;

        Scanner myScanner = new Scanner(System.in);
        ArrayList<String> inköpsLista = new ArrayList<>();

        while (programRunning) {

            int menyVal = meny();


            switch (menyVal) {

                case 1:
                    System.out.println("Vilken produkt vill du lägga till?");
                    System.out.print("> ");
                    inköpsLista.add(myScanner.next().toUpperCase());
                    break;
                case 2:
                    System.out.println("Vilken produkt vill du ta bort?");
                    System.out.print("> ");
                    inköpsLista.remove(myScanner.next().toUpperCase());
                    break;
                case 3:
                    System.out.println(inköpsLista);
                    break;
                case 4:
                    System.out.println("Programmet avslutas");
                    programRunning = false;
                    break;
                default:
                    System.out.println("Felaktigt menyval");

            }
        }
    }
    public static int meny(){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("[1] Lägg till produkt");
        System.out.println("[2] Ta bort produkt");
        System.out.println("[3] Visa inköpslista");
        System.out.println("[4] Avsluta din inköpsLista");
        System.out.print("> ");

        int menyVal = myScanner.nextInt();
        return menyVal;
    }
}
