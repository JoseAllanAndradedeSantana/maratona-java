package allan.maratonajava.colecoes.test;

import allan.maratonajava.colecoes.domain.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("1ADF28","Iphone10");
        SmartPhone s2 = new SmartPhone("1ADF28","Iphone11");
        System.out.println(s1.equals(s2));
    }
}
