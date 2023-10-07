import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numere = new ArrayList<>();

        // A. Utilizarea condițiilor pentru citirea numerelor
        System.out.println("Introduceți numere întregi (introduceți 0 pentru a opri introducerea):");
        while (true) {
            int numar = scanner.nextInt();
            if (numar == 0) {
                break;
            }
            numere.add(numar);
        }

        // B. Variabile
        int suma = 0;

        // C. Mase de date
        for (int numar : numere) {
            suma += numar;
        }

        // D. Exceptii
        try {
            double media = (double) suma / numere.size();
            System.out.println("Suma numerelor: " + suma);
            System.out.println("Media numerelor: " + media);
        } catch (ArithmeticException e) {
            System.out.println("Eroare a datelor");
        }

        // E. Liste
        System.out.println("Numerele introduse: " + numere);

        // F. Stream-uri
        numere.stream().sorted().forEach(System.out::println);

        scanner.close();
    }
}
