package br.com.app.factory;

public interface GerenciadorUsuario {
    Usuario createUsuario(TipoUsuario tipoUsuario, String nome, String senha) throws ClassNotFoundException;
}
