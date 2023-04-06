import java.io.*;
import prog.io.*;

public class Climate_Monitoring {
    public static void main(String[] args) {
        /*Pagina iniziale contenente 3 opzioni: registrati , accedi, visualizza dati  */
   
        System.out.println("Benvenuto, per monitorare i parametri climatici seleziona 'P'"+" "+" per registrarti seleziona 'R'" + " "+"per accedere come operatore seleziona 'L'");
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
        
        
        char selezione = in.readChar("seleziona l'operazione:");
        
        switch(selezione){
            case 'P': 
                //consultare le informazioni del repository delle aree di interesse (accesso libero ai comuni cittadini)

            case 'R':
                //registrarsi all'applicazione (solo operatori dei centri di monitoraggio)

            case 'L':
                //metodo per loggare
                /*creare centri di monitoraggio ed aggiungervi aree di interesse (solo operatori registrati e solo dopo login)
                 * nella seconda pagina:inserire i dati rielaborati secondo la scala fornita e relativi ai parametri climatici (solo
                 * operatori registrati e solo dopo login) per ciascuna area di interesse per quel centro
                 * di monitoraggio, per una specifica data di rilevazione
                */
                
        }
        
    }
    
}