package IOStream_2;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream_2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/IOStream_2/output.txt");
        fos.write("Hello, World!".getBytes());
    }
}
