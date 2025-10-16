package Exam_Questions;
import java.util.Scanner;
public class Q2_alt_str {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Text: ");
        String s = scn.nextLine();
        StringBuilder tS = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isUpperCase(ch)) {
                tS.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                tS.append(Character.toUpperCase(ch));
            } else {
                tS.append(ch);
            }
        }
        System.out.println(tS.toString());

    }
}
