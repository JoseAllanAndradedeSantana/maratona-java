package allan.maratonajava.colecoes.test;

import allan.maratonajava.colecoes.domain.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneTest01 {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone("1ADF28","Iphone10");
        SmartPhone s2 = new SmartPhone("1ADF281","Motorola");
        SmartPhone s3 = new SmartPhone("1ADF2810","Samsung");
        SmartPhone s4 = new SmartPhone("1ADF28108","Xaiomi");

        List<SmartPhone> smartPhones = new ArrayList<>();
        smartPhones.add(s1);
        smartPhones.add(s2);
        smartPhones.add(s3);
        smartPhones.add(s4);
        System.out.println(smartPhones.contains(s4));
        int indexOf = smartPhones.indexOf(s4);
        System.out.println(smartPhones.get(indexOf));

        for (SmartPhone smartPhone : smartPhones){
            System.out.println(smartPhone.getMarca());

        }
    }
}
