package br.com.app.livraria;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Service {

    protected Service(){}
    private static List<Livro> livros = Arrays.asList(mountLivros()).stream().collect(Collectors.toCollection(ArrayList::new));

    private static Livro[] mountLivros() {
        return new Livro[]{new Livro("Gato de Botas", "Sacopeba"),
                new Livro("Ligar o foda-se", "Nao sei"),
                new Livro("Na hora errada", "Nao sei"),
                new Livro("Lado errado", "Sacopeba"),
                new Livro("Clean code", "Sacopeba")};
    }

        static List<Livro> getLivros() {
        return livros;
    }

}
