
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    //Sistemare menu, mandare programma per verificare la funzionalita delle opzioni
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
    

    
 opzione1=sc.nextInt();  
    switch(opzione1){
        //check su richiamo metodo e utilizzo di esso 
        case 1: 
            selezione="Registrazione Utente/Centro di Monitoraggio";
            Reg_Log.RegistraUtente();
            break;
        //sistemare parte login
        case 2: 

            selezione="'Log in'";
            
            break;
        //realizzare classi per 
        case 3: 
            selezione="'Ricerca parametri climatici'";
            System.out.println("Benvenuto, per visualizzare parametri climatici digitare \n 5 - per denominazione \n 6 - per coordinate geografiche");// Selezione della tipologia di informazioni da utilizzare per la ricerca
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
            selezione="Errore, digitare un numero valido:"; //Messaggio di errore per l'utente in caso è stato inserito un numero non valido
        }
       
    } 

}





