import java.io.BufferedWriter;
import java.io.FileWriter;

public class Reg_centro_moni{
    public static void main(String[] args) {
        
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\Utente\\Desktop\\Progetto Climate Monitoring\\Dati\\OperatoriRegistrati.dati"));
            writer.write("Username");
            writer.write("\nPassword");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}