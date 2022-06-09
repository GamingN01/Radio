import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Radio neuesRadio = new Radio();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String eingabe = scanner.next();
            runSoftware(neuesRadio, scanner, eingabe);
        }
    }

    private static void runSoftware(Radio neuesRadio, Scanner scanner, String eingabe) {
        switch (eingabe) {
            case "run":
                neuesRadio.ein_aus_schalten();
                break;

            case "lauter":
                if (!neuesRadio.checkStatus()) break;
                neuesRadio.lauter();
                break;

            case "leiser":
                if (!neuesRadio.checkStatus()) break;
                neuesRadio.leiser();
                break;

            case "setL": //Lautstaerke setzen
                if (!neuesRadio.checkStatus()) break;
                System.out.println("Neue Lautstaerke eingeben: ");
                int laut = scanner.nextInt();
                neuesRadio.setLautstaerke(laut);
                break;

            case "setF": //Frequenz setzen
                if (!neuesRadio.checkStatus()) break;
                System.out.println("Neue Frequenz eingeben: ");
                double freq = scanner.nextDouble();
                neuesRadio.setFrequenz(freq);
                break;

            case "ausgabe":
                if (!neuesRadio.checkStatus()) break;
                neuesRadio.ausgabe();
                break;

            case "help":
                System.out.println("+run -> schaltet radio ein/aus \n+lauter -> lautstaerke + 1 \n+leiser -> lautstaerke - 1 \n+setL -> setze bestimmte Lautstaerke \n+setF -> setze bestimmte Frequenz \n+ausgabe -> gibt aktuellen Status wieder \n+end -> schliesst die Scannereingabe");
                break;

            case "end":
                scanner.close();
                break;

            default:
                System.out.println("Keine gueltige Operation!");
                break;
        }
    }

}
