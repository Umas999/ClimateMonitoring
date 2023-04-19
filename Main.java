import java.io.File;
import java.io.*;
import java.util.Scanner;
import prog.io.*;

public class Main {
    public static void main(String[] args) {
    //sistemato la parte di opzioni, da fare il richiamo del metodo registrautente all'interno dell'opzione 1, sistemare il boolean do while, all'avvio del programma e selezionando l'opzione richiesta non succede nulla
    ConsoleInputManager in = new ConsoleInputManager();
    ConsoleOutputManager out = new ConsoleOutputManager();
    System.out.println("Benvenuto nel programma Climate Monitoring ");
    System.out.println("MENU");
    System.out.println("Inserire: ");
    System.out.println("1 - per registrarsi");
    System.out.println("2 - per accedere ");
    System.out.println("3 - per visualizzare parametrici climatici");
    in.readInt("Selezionare l'opzione:");

    int opzione1=0;
    int opzione2=0;
    do{

    switch(opzione1){
        case 1: 
                
                in.readInt("Premere 4 per creare centro di monitoraggio qual ora non fosse presente:");
            
            if(opzione2==4){
                    //istanziare centro monitoraggio
                }
                else
                System.out.println("Benvenuto nella registrazione utente, immetti i tuoi dati per poter creare un centro monitoraggio:");
                //Operatore operatore = new Operatore(RegistraUtente());
        
        case 2: String UseridLog=in.readLine("Userid:");
                String PasswordLog=in.readLine("Password:");
        
        case 3: System.out.println("Cerca area geografica");
                System.out.println("Tramite:");
                System.out.println("5 - per denominazione");
                System.out.println("6 - per coordinate geografiche");
            }
        
        }
        while (opzione1<1 || opzione1>3);
    }

    
    
}