
import java.util.Scanner;
public class zd16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj nazwę ulubionego miasta:");
        String miasto = input.nextLine();

        int liczbaZnakow = miasto.length();
         String miastoWielkimiliterami =miasto.toUpperCase();
         String miastomalymiliterami = miasto.toLowerCase();

         char pierwszyZnak = miasto.charAt(0);
        System.out.println("Liczba znaków w nazwie miasta:" + liczbaZnakow);
        System.out.println("Nazwa miasta dużymi literami:" + miastoWielkimiliterami );
        System.out.println("Nazwa miasta małymi literami:"+ miastomalymiliterami );
        System.out.println("Pierwszy znak nazwy miasta:"+ pierwszyZnak);
    }
}
