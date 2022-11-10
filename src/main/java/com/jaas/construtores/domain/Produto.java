package com.jaas.construtores.domain;

public class Produto {
    private String nome;
    private String codigo;
    private double preco;

    public Produto(String nome){
        this.nome = nome;

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPreco(double preco){
        this.preco = preco;
     }

     public double getPreco(){
        return this.preco;
     }

}
