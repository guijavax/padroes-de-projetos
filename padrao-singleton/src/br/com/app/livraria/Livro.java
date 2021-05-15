package br.com.app.livraria;

public class Livro {

    private String nome;
    private String editora;

    Livro(String nome, String editora) {
        this.nome = nome;
        this.editora = editora;
    }

    public String getNome() {
        return nome;
    }

    public String getEditora() {
        return editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}
