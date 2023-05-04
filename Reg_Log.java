import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.lang.model.element.ExecutableElement;
import javax.swing.*;
import java.awt.event.*;



//Realizzata classe per l'operatore, metodi di registrazione e metodi di verifica con bufferedreader, problema di richiamo metodi in classe Main
class Operatore{
    private String Nome;
    private String Cognome;
    private String CodiceFiscale;
    private String Email;
    private String Username;
    private String Password;
    private int CodiceAfferenza;
    private int CAP;

    public Operatore(String Nome,String Cognome,String CodiceFiscale,String Email,String Username, String Password, int CodiceAfferenza, int CAP){
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.CodiceFiscale = CodiceFiscale;
        this.Email = Email;
        this.Username = Username;
        this.Password = Password;
        this.CodiceAfferenza = CodiceAfferenza;
        this.CAP = CAP;
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

    public void RegistraUtente(){

        PrintWriter writer = null;

        try{

        writer = new PrintWriter("Operatoriregistrati.txt");
        writer.println( Nome + ":\n" + Cognome + ":\n" + CodiceFiscale + ":\n" + Email + ":\n"+ Username + ":\n" + Password + ":\n " + CodiceAfferenza + ":\n" + CAP + ":\n");

        } catch(FileNotFoundException ex){

        System.out.println(ex.getMessage());

        }finally{

            if(writer != null)
            writer.close();

        }
    }

    public boolean VerificaCredenziali(){
        
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






