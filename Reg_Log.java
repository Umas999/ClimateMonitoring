import java.io.*;
import java.util.Scanner;




//Realizzata classe per l'operatore, metodi registrazioni funzionanti, manca login con tutte le verifiche necessarie

public class Reg_Log{
    private static String Nome;
    private static String Cognome;
    private static String CodiceFiscale;
    private static String Email;
    private static String Username;
    private static String Password;
    private static int CodiceAfferenza;
    private static int CAP;

    public Reg_Log(String Nome,String Cognome,String CodiceFiscale,String Email,String Username, String Password, int CodiceAfferenza, int CAP){
        Reg_Log.Nome = Nome;
        Reg_Log.Cognome = Cognome;
        Reg_Log.CodiceFiscale = CodiceFiscale;
        Reg_Log.Email = Email;
        Reg_Log.Username = Username;
        Reg_Log.Password = Password;
        Reg_Log.CodiceAfferenza = CodiceAfferenza;
        Reg_Log.CAP = CAP;
    }

    public String GetNome(){
        return Nome;
    }

    public String GetCognome(){
        return Cognome;
    }

    public String GetCodiceFiscale(){
        return CodiceFiscale;
    }

    public String Email(){
        return Email;
    }

    public String GetUsername(){
        return Username;
    }

    public String GetPassword(){
        return Password;
    }

    public int GetCodiceAfferenza(){
        return CodiceAfferenza;
    }

    public int GetCAP(){
        return CAP;
    }

    public boolean VerificaUtente(){
        File file = new File("Operatoriregistrati.txt");
        return file.exists();
    }

    //Acqusizione dei dati dell'utente per la registrazione
    public static void RegistraUtente(){

        PrintWriter writer = null;

        VerificaCredenziali();
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("benvenuto nella registrazione utente, inserisci i dati:");
            System.out.println("Quale è il tuo nome?");
            String Nome = scanner.nextLine();

            System.out.println("Quale è il tuo cognome?");
            String Cognome = scanner.nextLine();

            System.out.println("Codice fiscale?");                                     
            String CodiceFiscale = scanner.nextLine();

            System.out.println("Email");
            String Email = scanner.nextLine();
        
            System.out.println("Username");
            String Username = scanner.nextLine();

            System.out.println("Password");
            String Password = scanner.nextLine();

            System.out.println("CodiceAfferenza");
            int CodiceAfferenza = scanner.nextInt();
            
            System.out.println("Cap");
            int CAP = scanner.nextInt();
            
            
            try{

            writer = new PrintWriter("Operatoriregistrati.txt");
            writer.println( "nome:"+ Nome + "\n" + "cognome:" + Cognome + "\n" + "codice fiscale:" + CodiceFiscale + "\n" +"email: " + Email + "\n" + "username: " + Username + "\n" + "password:" + Password + "\n " + "codice afferenza:" + CodiceAfferenza + "\n" + "CAP:" + CAP );

            } catch(FileNotFoundException ex){

            System.out.println(ex.getMessage());

            }finally{

                if(writer != null)
                writer.close();

            }
        }
    }

    public static boolean VerificaCredenziali(){

        //Sistemare parte di verifica credenziali, richiedere di reinserire password e username qualora fosse sbagliato
        BufferedReader reader = null;
        try {
            
            reader= new BufferedReader(new FileReader("Operatoriregistrati.txt)"));
            String[] arrayCredenziali = reader.readLine().split(":");
            return Username.equals(arrayCredenziali[0]) && Password.equals(arrayCredenziali[1]);

        } catch (FileNotFoundException ex) {

            System.out.println(ex.getMessage());
            return false;
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
            return false;

        } finally{

            if(reader!=null)
            try {

                reader.close();

            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
        

    }


}






