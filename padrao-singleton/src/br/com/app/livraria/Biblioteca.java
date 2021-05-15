package br.com.app.livraria;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Biblioteca {

    private static Biblioteca biblioteca;

    private Biblioteca(){}

    private static List<Livro> livros = Service.getLivros();
    private static List<Livro> livrosEmprestados;

    public static Biblioteca getBiblioteca() {
        if(biblioteca == null) {
            biblioteca = new Biblioteca();
        }
        livrosEmprestados = new ArrayList<>();
        return biblioteca;
    }

    public void emprestaLivro(String nome) {
        interadorLista(nome, livros, livrosEmprestados);
    }

    private void interadorLista(String nome, List<Livro> listaParaRemover, List<Livro> listaParaAdcionar) {
        for (Livro livro : listaParaRemover) {
            if(nome.equals(livro.getNome())) {
                listaParaAdcionar.add(livro);
                listaParaRemover.remove(livro);
                break;
            }
        }
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void devolveLivro(String nome) {
        interadorLista(nome, livrosEmprestados, livros);
    }
}
