package Exception_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class reaFil{
    void readFile(String fileName) throws IOException{
        FileReader file = new FileReader(fileName);
        BufferedReader fileInput = new BufferedReader(file);
        throw new IOException("FileNotFound");
    }
}
public class throws_1 {
    public static void main(String[] args) {
        reaFil re = new reaFil();
        try{
            re.readFile("test.txt");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
