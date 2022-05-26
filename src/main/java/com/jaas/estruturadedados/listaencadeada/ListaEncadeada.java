package com.jaas.estruturadedados.listaencadeada;

public class ListaEncadeada<T> {
    No<T> refEntrada;

    public ListaEncadeada(){
        this.refEntrada = null;
    }
    private No<T> getNo(int index){
        validate(index);
        No<T> noAux = refEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i <= index; i++){
            noRetorno = noAux;
            noAux = noAux.getProximoNo();
        }
        return noRetorno;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            refEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    private void validate(int index) {
        if(index >= size()){
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException("Nao existe conteudo " + lastIndex);
        }
    }


    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            refEntrada = novoNo;
            return;
        }
        No<T> noAux = refEntrada;
        for(int i = 0; i < this.size()-1; i++){
            noAux = noAux.getProximoNo();
        }
        noAux.setProximoNo(novoNo);
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> refAux = refEntrada;
        while (true){
            if(!this.isEmpty()){
                tamanhoLista++;
                if(refAux.getProximoNo() != null){
                    refAux = refAux.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    public boolean isEmpty(){
        return refEntrada == null ? true : false;
    }

    @Override
    public String toString(){
        String strRetorno = "";
        No<T> noAuxiliar = refEntrada;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]\n";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }

}
