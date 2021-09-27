package allan.maratonajava.sobrecargametodos.domain;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime(String nome, String tipo, int episodios, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    //Construtor
    public Anime(){

    }
    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;

    }

    //sobreCargaDeMetodos
    public void init(String nome, String tipo, int episodios,String genero){
        this.init(nome,tipo,episodios);
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public String getTipo(){
        return this.tipo;
    }

    public int getEpisodios(){
        return this.episodios;
    }
}
