package Exam_Questions;
import java.util.Scanner;
public class Q7_comr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        String processedStr1 = str1.replaceAll("\\s+", "").toLowerCase();
        String processedStr2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (processedStr1.equals(processedStr2)) {
            System.out.println("Strings are Equal after processing.");
        } else {
            System.out.println("Strings are Not Equal after processing.");
        }

        sc.close();
    }
}

