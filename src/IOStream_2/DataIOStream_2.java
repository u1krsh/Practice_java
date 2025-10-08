package IOStream_2;
import java.io.*;
public class DataIOStream_2 {
    public static void main(String[] args) throws IOException{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/IOStream_2/output.txt"));
        dos.writeInt(101);
        dos.writeDouble(69.420);
        dos.writeUTF("Hello!");
        dos.writeBoolean(true);
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("src/IOStream_2/output.txt"));
        int id = dis.readInt();
        double marks = dis.readDouble();
        System.out.println(id);
        System.out.println(marks);


    }
}
