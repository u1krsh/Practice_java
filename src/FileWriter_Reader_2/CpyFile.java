package FileWriter_Reader_2;
import java.io.*;
public class CpyFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/FileWriter_Reader/output.txt");
        FileWriter fw = new FileWriter("src/FileWriter_Reader/output_2.txt");
        int b;
        while((b=fr.read())!=-1){
            fw.write(b);
        }
        fw.close();
        fr.close();
    }
}
