package allan.maratonajava.metodos.domain;

public class OuterClasses {
    private String name = "José Allan";

    class Inner{
        public void printName(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClasses oC = new OuterClasses();
        Inner inner = oC.new Inner();
        inner.printName();

    }
}
