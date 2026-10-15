import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner scan;

    public static void main(String[] args) {


        Drink mojito = new Drink(50);

        mojito.setPrice(30);

        System.out.println(mojito.getPrice());

        mojito.setPrice(1);

        ArrayList<String>items = new ArrayList<>();

        items.add("kaffe");
        items.add("kage");
        items.add("Fisk");

        try {
            System.out.println(getItem(items, 2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }


    public ArrayList<String> readLines(String path) throws FileNotFoundException

    public static String getItem(ArrayList<String> items, int index) {
        if (index < 0 || index >= items.size()) {
            throw new IllegalArgumentException ("Index er ude fra index intervallet!");
        }
        return items.get(index);
    }

    public int promptNumber(String msg) {
        System.out.println(msg);
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Skriv venligst et heltal");
            return promptNumber(msg);
        }
    }


}