//This is an abstract class

package IOStream_2;

import java.io.*;

public class InputStream_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/IOStream_2/input.txt");
        int c;
        while((c=fis.read())!=-1){
            System.out.print((char)c);
        }
        fis.close();
    }
}
