package Exception_1;

class exm{
    void checkAge(int age){
        if(age <18){
            throw new IllegalArgumentException("Age Must be older than 18");
        }
    }
}
public class throw_1 {
    public static void main(String[] args) {
        exm ex = new exm();
        try {
        ex.checkAge(16);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
