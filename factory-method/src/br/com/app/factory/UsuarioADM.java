package br.com.app.factory;

public class UsuarioADM extends Usuario{

    public UsuarioADM(String usuario, String senha) { super(usuario, senha); }

    @Override
    public void showTypeUsuario() { System.out.println("O usuário " + getNome()+ " é:" + "ADM"); }
}
