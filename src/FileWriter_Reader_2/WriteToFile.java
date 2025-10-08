package FileWriter_Reader_2;
import java.io.*;
public class WriteToFile {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src/FileWriter_Reader/output.txt");
        fw.write("Hello!!");
        fw.close();
        System.out.println("Written Successfully");
    }
}
