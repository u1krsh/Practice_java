package Exception_1;

public class Exception_1 {
    public static void main(String[] args) {
        try{
            int[] n = {1,2,3,4,5};
            System.out.println(n[10]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This is always executed");
        }
    }
}
