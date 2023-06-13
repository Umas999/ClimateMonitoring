import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CercaAreaGeografica {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Inserisci il paese da cercare: ");
            String inputPaese = input.nextLine();

            List<String> paroleTrovate = ricercaParoleCSV("Dataset.csv", inputPaese);

            System.out.println("Paesi trovati: ");
            for (String parola : paroleTrovate) {
                System.out.println(parola);
            }
        }
    }

    public static List<String> ricercaParoleCSV(String filePath, String inputPaese) {
        List<String> paroleTrovate = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(";");
                for (String parola : row) {
                    if (parola.contains(inputPaese) || parola.equalsIgnoreCase(inputPaese)) {
                        paroleTrovate.add(parola);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return paroleTrovate;
    }
}
