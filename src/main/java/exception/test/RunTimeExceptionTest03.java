package exception.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        try {
            System.out.println("Open File");
            System.out.println("Write File");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("Closed File");
        }
    }
}
