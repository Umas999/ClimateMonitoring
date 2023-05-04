import java.io.File;
import java.io.*;
import java.util.Scanner;
import prog.io.*;

public class Main {
    public static void main(String[] args) {
    //sistemato la parte di opzioni, da fare il richiamo del metodo registrautente all'interno dell'opzione 1, sistemare il boolean do while, all'avvio del programma e selezionando l'opzione richiesta non succede nulla
    Scanner sc = new Scanner(System.in); 
    int opzione1;
    int opzione2;
    String selezione; 
   
    System.out.println("Benvenuto nel programma Climate Monitoring ");
    System.out.println("MENU");
    System.out.println("Digitare: ");
    System.out.println("1 - per registrarsi");
    System.out.println("2 - per accedere ");
    System.out.println("3 - per visualizzare parametrici climatici\nDigitare l'opzione:");
    //LOL + PROOT 

    
 opzione1=sc.nextInt();  
    switch(opzione1){
        case 1: 
            selezione="'Registrazione Utente/Centro di Monitoraggio'";
            
            break;
        case 2: 

            selezione="'Log in'";
            
            break;
        case 3: 
                selezione="'Ricerca parametri climatici'";
                System.out.println("Benvenuto, per visualizzare parametri climatici digitare \n 5 - per denominazione \n 6 - per coordinate geografiche");
                opzione2=sc.nextInt();
                switch(opzione2){
                    case 5:
                    break;
                    //denominazione
                    case 6:
                    break;
                    //coordinate geografiche
                }
                
            break;
        default:
            selezione="Errore, digitare un numero valido:";
            }
        System.out.println("Hai selezionato"+" "+selezione);
       
    } 

}


