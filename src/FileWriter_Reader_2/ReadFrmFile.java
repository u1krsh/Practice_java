package FileWriter_Reader_2;

import java.io.*;

public class ReadFrmFile {
    public static void main(String[] args) throws IOException{
        int ch;
        FileReader fr = new FileReader("src/FileWriter_Reader/output.txt");
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
