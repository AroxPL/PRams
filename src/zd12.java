import java.util.Scanner;
public class zd12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę przejechanych kilometrów: ");
        double distance = scanner.nextDouble();
        System.out.print("Podaj liczbę zużytych litrów paliwa: ");
        double fuel = scanner.nextDouble();

        double fuelEfficiency = distance / fuel;

        System.out.println("liczba kilometrów przejechanych na litrze paliwa:"+fuelEfficiency);
    }
}