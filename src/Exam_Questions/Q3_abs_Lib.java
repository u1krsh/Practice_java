package Exam_Questions;
abstract class Library{
    abstract void issueBook();
    abstract void returnBook();
    void displayLib(int Numb_book, int Numb_issue){
        System.out.println("Total number of Books: "+Numb_book);
        System.out.println("Number of Books Issued: "+Numb_issue);
    }
}
class StudentLibrary extends Library {
    int Numb_Book;
    int Numb_issue;

    StudentLibrary(int Numb_book, int Numb_issue){
        this.Numb_Book = Numb_book;
        this.Numb_issue = Numb_issue;
    }
    @Override
    void issueBook() {
        if (Numb_Book <= 0){
            System.out.println("All book Gone");
        }
        else {
            System.out.println("Book Issued");
            Numb_Book--;
            Numb_issue++;
        }
    }

    @Override
    void returnBook() {
        System.out.println("Book returned");
        Numb_issue--;
        Numb_Book++;
    }

    void displayLib() {
        System.out.println("Number of Books "+Numb_Book);
        System.out.println("Number Of Issued "+Numb_issue);
    }
}
public class Q3_abs_Lib {
    public static void main(String[] args) {
        StudentLibrary stu1 = new StudentLibrary(100,10);
        stu1.issueBook();
        stu1.returnBook();
        stu1.returnBook();
        stu1.displayLib();
    }
}
