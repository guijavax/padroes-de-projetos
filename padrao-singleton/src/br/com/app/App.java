package br.com.app;

import br.com.app.livraria.Biblioteca;
import br.com.app.livraria.Livro;
import br.com.app.livraria.Service;

import java.util.*;

public class App {

    public static void main(String[] args) {
        System.out.println("Bem vindo");

        Biblioteca biblioteca = Biblioteca.getBiblioteca();

        System.out.println("Esses são os livros disponíveis: ");

        biblioteca.getLivros().forEach(System.out::println);

        biblioteca.emprestaLivro("Gato de Botas");
        System.out.println("\n");
        biblioteca.getLivros().forEach(System.out::println);

        biblioteca.devolveLivro("Gato de Botas");

        System.out.println("\n");

        biblioteca.getLivros().forEach(System.out::println);


    }

}
