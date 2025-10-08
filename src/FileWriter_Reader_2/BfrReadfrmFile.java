package FileWriter_Reader_2;
import java.io.*;
public class BfrReadfrmFile {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader("src/FileWriter_Reader/output.txt"));
        String line;
        while((line = fr.readLine())!=null){
            System.out.println(line);
        }
    }
}
