import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int startwert;
        int endwert;
        int schrittweite;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Einfache Nummerierung");

        while (true) {
            System.out.println("Bitte geben Sie den Startwert ein: ");
            String startwertInput = scanner.nextLine();
            if (isInteger(startwertInput)) {
                startwert = Integer.parseInt(startwertInput);
                break;
            } else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine gültige Ganzzahl ein.");
            }
        }

        while (true) {
            System.out.println("Bitte geben Sie den Endwert ein:");
            String endwertInput = scanner.nextLine();
            if (isInteger(endwertInput)) {
                endwert = Integer.parseInt(endwertInput);
                break;
            } else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine gültige Ganzzahl ein.");
            }
        }

        while (true) {
            System.out.println("Bitte geben Sie die Schrittweite ein:");
            String schrittweiteInput = scanner.nextLine();
            if (isInteger(schrittweiteInput)) {
                schrittweite = Integer.parseInt(schrittweiteInput);
                break;
            } else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine gültige Ganzzahl ein.");
            }
        }


        for (int start = startwert; start <= endwert; start += schrittweite) {
            System.out.println(start);
        }
    }

    public static boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
