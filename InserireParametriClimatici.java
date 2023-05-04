import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class InserireParametriClimatici {
    public void inserisciParametriClimatici() {
        int vento, umidita, pressione, temperatura, precipitazione, altitudineGhiacciai, massaGhiacciai;
        String centroMoritoraggio,areaInteresse;
        String noteVento,noteUmidita,notePressione,noteTemperatura,notePrecipitazione,noteAltitudineG,noteMassaG;
        Scanner input = new Scanner(System.in);
        
            System.out.print("Inserisci centro di moritoraggio: ");
            centroMoritoraggio = input.nextLine();
        
            System.out.print("Inserisci area di interesse: ");
            areaInteresse = input.nextLine();

            Date data = new Date();
            DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            String dataCorrente = formatoData.format(data);

        do {
            System.out.print("Inserisci punteggio vento - velocità del vento (km/h), suddivisa in fasce - (1-5): ");
            vento = input.nextInt();
            if(vento < 1 || vento > 5){
                System.out.println("Errore di inserimento");
            }
            input.nextLine(); // Acquisisce il carattere di newline rimasto nel buffer
        } while (vento < 1 || vento > 5);

        System.out.print("Inserisci note in merito al vento (max 250 caratteri): ");
        noteVento=input.nextLine();

        do {
            System.out.print("Inserisci punteggio umidità - % di Umidità, suddivisa in fasce - (1-5): ");
            umidita = input.nextInt();
            if(umidita < 1 || umidita > 5){
                System.out.println("Errore di inserimento");
            }
            input.nextLine(); // Acquisisce il carattere di newline rimasto nel buffer
        } while (umidita < 1 || umidita > 5);

        System.out.print("Inserisci note in merito all' umidità (max 250 caratteri): ");
        noteUmidita=input.nextLine();

        do {
            System.out.print("Inserisci punteggio pressione - in hPa, suddivisa in fasce - (1-5): ");
            pressione = input.nextInt();
            if(pressione < 1 || pressione > 5){
                System.out.println("Errore di inserimento");
            }
            input.nextLine(); // Acquisisce il carattere di newline rimasto nel buffer
        } while (pressione < 1 || pressione > 5);

        System.out.print("Inserisci note in merito alla pressione: ");
        notePressione=input.nextLine();

        do {
            System.out.print("Inserisci punteggio temperatura - in °C, suddivisa in fasce - (1-5): ");
            temperatura = input.nextInt();
            if(temperatura < 1 || temperatura > 5){
                System.out.println("Errore di inserimento");
            }
            input.nextLine(); // Acquisisce il carattere di newline rimasto nel buffer
        } while (temperatura < 1 || temperatura > 5);

        System.out.print("Inserisci note in merito alla temperatura (max 250 caratteri): ");
        noteTemperatura=input.nextLine();

        do {
            System.out.print("Inserisci punteggio precipitazione - in mm di pioggia, suddivisa in fasce - (1-5): ");
            precipitazione = input.nextInt();
            if(precipitazione < 1 || precipitazione > 5){
                System.out.println("Errore di inserimento");
            }
            input.nextLine(); // Acquisisce il carattere di newline rimasto nel buffer
        } while (precipitazione < 1 || precipitazione > 5);

        System.out.print("Inserisci note in merito alle precipitazioni (max 250 caratteri): ");
        notePrecipitazione=input.nextLine();

        do {
            System.out.print("Inserisci punteggio altitudine dei ghiacciai - in m, suddivisa in piogge - (1-5): ");
            altitudineGhiacciai = input.nextInt();
            if(altitudineGhiacciai < 1 || altitudineGhiacciai > 5){
                System.out.println("Errore di inserimento");
            }
            input.nextLine(); // Acquisisce il carattere di newline rimasto nel buffer
        } while (altitudineGhiacciai < 1 || altitudineGhiacciai > 5);

        System.out.print("Inserisci note in merito all'altitudine dei ghiacciai (max 250 caratteri): ");
        noteAltitudineG=input.nextLine();

        do {
            System.out.print("Inserisci punteggio massa dei ghiacciai - in kg, suddivisa in fasce - (1-5) "); 
            massaGhiacciai = input.nextInt();
            if(massaGhiacciai < 1 || massaGhiacciai > 5){
                System.out.println("Errore di inserimento");
            }
            input.nextLine(); // Acquisisce il carattere di newline rimasto nel buffer
        } while (massaGhiacciai < 1 || massaGhiacciai > 5);

        System.out.print("Inserisci note in merito alla massa dei ghiacciai (max 250 caratteri): ");
        noteMassaG=input.nextLine();

        input.close();

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("ParametriClimatici.dati",true)); //append:true serve per far scrivere i dati nel file senza eliminare quelli precedentemente inseriti
            writer.write("Centro di monitoraggio: " + centroMoritoraggio);
            writer.newLine();
            writer.write("Area di interesse: " + areaInteresse);
            writer.newLine();
            writer.write("Data di rivelazione: " + dataCorrente);
            writer.newLine();
            writer.write("Vento (velocità del vento (km/h), suddivisa in fasce ):" + vento);
            writer.newLine();
            writer.write("Note: " + noteVento);
            writer.newLine();
            writer.write("Umidita (% di Umidità, suddivisa in fasce): " + umidita);
            writer.newLine();
            writer.write("Note: " + noteUmidita );
            writer.newLine();
            writer.write("Pressione (in hPa, suddivisa in fasce): " + pressione);
            writer.newLine();
            writer.write("Note: " + notePressione);
            writer.newLine();
            writer.write("Temperatura (in °C, suddivisa in fasce): " + temperatura);
            writer.newLine();
            writer.write("Note: " + noteTemperatura);
            writer.newLine();
            writer.write("Precipitazione (in mm di pioggia, suddivisa in fasce): " + precipitazione);
            writer.newLine();
            writer.write("Note: " + notePrecipitazione);
            writer.newLine();
            writer.write("Altitudine dei ghiacciai (in m, suddivisa in piogge): " + altitudineGhiacciai);
            writer.newLine();
            writer.write("Note: " + noteAltitudineG);
            writer.newLine();
            writer.write("Massa dei ghiacciai (in kg, suddivisa in fasce): " + massaGhiacciai);
            writer.newLine();
            writer.write("Note: " + noteMassaG );
            writer.newLine();
            writer.write("---------------------------\n"); // separatore per distinguere i vari inserimenti
            writer.close();
            System.out.println("Parametri climatici salvati correttamente in ParametriClimatici.dati");  
        } catch (IOException e) {
            System.out.println("Errore durante il salvataggio dei parametri climatici");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InserireParametriClimatici inseritore = new InserireParametriClimatici();
        inseritore.inserisciParametriClimatici();
    }
}
