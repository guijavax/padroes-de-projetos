package br.com.app.factory;

public class GerenciadorUsuarioImpl implements GerenciadorUsuario{


    @Override
    public Usuario createUsuario(TipoUsuario tipoUsuario, String nome, String senha) throws ClassNotFoundException{
       switch (tipoUsuario){
           case ADM:  return new UsuarioADM(nome, senha);
           case CLIENTE:  return  new UsuarioCliente(nome, senha);
           case DEV:  return new UsuarioDev(nome, senha);
           default: throw new ClassNotFoundException("Tipo inválido");
       }
    }
}
