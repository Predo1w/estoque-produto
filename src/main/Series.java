package main;

public class Series {
    private String nome;
    private String plataforma;
    private double nota;

    public Series(String nome, String plataforma) {
        this.nome = nome;
        this.plataforma = plataforma;
    }
    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }

    public Series (String nome) {
        this.nome = nome;
        this.plataforma = "plataforma indefinida";

    }
}
