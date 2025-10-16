package Exam_Questions;
import java.io.*;
public class Q6_fil_upr {
    public static void main(String[] args) {
        String fileName = "src/Exam_Questions/word.txt";
        StringBuilder content = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                content.append(line).append(" ");
            }

            String finalText = content.toString().trim();

            finalText = finalText.replaceAll("\\s+", " ").toUpperCase();
            int wordCount = finalText.isEmpty() ? 0 : finalText.split(" ").length;
            System.out.println("Processed Text: " + finalText);
            System.out.println("Total Number of Words: " + wordCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

