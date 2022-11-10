package com.jaas.estruturadedados.listadulpaencadeada;

public class ListaDuplaEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;

    public ListaDuplaEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size(){
        return this.tamanhoLista;
    }

    public T get(int index){
        return this.getNoDuplo(index).getConteudo();
    }

    public void add(int index, T e){
        NoDuplo<T> noAux = getNoDuplo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(e);
        novoNo.setNoProximo(noAux);
        if(novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAux.getNoPrevio());
            novoNo.getNoProximo().setNoProximo(novoNo);
        }
        if(novoNo.getNoProximo() == null){
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }
        if(index == 0){
            primeiroNo = novoNo;
        }else{
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    public void add(T e){
        NoDuplo<T> novoNo = new NoDuplo<>(e);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    private NoDuplo<T> getNoDuplo(int index){
        NoDuplo<T> noAux = primeiroNo;
        for(int i = 0; (i < index) && (noAux != null); i++){
            noAux = noAux.getNoProximo();
        }
        return noAux;
    }
}
