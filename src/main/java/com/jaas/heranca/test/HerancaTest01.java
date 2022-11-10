package com.jaas.heranca.test;

import com.jaas.heranca.domain.Endereco;
import com.jaas.heranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa();

        endereco.setRua("Rua Americo Vespucio, n:863, apartamento: 103A");
        endereco.setCep("11700-802");

        pessoa.setNome("Jose Allan Andrade de Santana");
        pessoa.setCpf("391.288.756-29");
        pessoa.setEndereco(endereco);



        pessoa.imprimir();

    }
}
