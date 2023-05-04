import java.io.*;
public class ricercadati {
        public static void main(String[] args) {
            //sistemare parte di ricerca dati, 
            String file = "C:\\Users\\Utente\\Desktop\\Progetto Climate Monitoring\\Dati\\Dataset_csv";
            BufferedReader reader = null;
            String line = "";
            
            try {
            reader = new BufferedReader(new FileReader(file));
            while((line = reader.readLine()) != null) {
            
            String[] row = line.split(",");
        
            for(String index : row) {
            System.out.printf("%-10s", index);
            }
            System.out.println();
            }
            }
            catch(Exception e) {
            e.printStackTrace();
            }
            finally {
            try {
            reader.close();
            } catch (IOException e) {
           
            e.printStackTrace();
            }
        }
    }
}