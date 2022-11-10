package com.jaas.modificadorestatico.test;

import com.jaas.modificadorestatico.domain.Car;

public class CarTest {
    public static void main(String[] args){
        Car c1 = new Car("Fox Preto",260);
        Car c2 = new Car("Fox Branco",260);
        Car c3 = new Car("HRV",280);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
