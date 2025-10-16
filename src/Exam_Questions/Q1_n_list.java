package Exam_Questions;
import java.util.Scanner;
public class Q1_n_list {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Number of Elements: ");
        int n = scn.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.next();
        }
        for(String array:arr){
            System.out.print(array.toUpperCase()+"\t");
        }
    }
}
