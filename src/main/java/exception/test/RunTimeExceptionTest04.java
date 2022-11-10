package exception.test;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Dentro IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Dentro ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Dentro RuntimeException");
        }
    }
}
