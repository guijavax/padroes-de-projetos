package br.com.app.factory;

public class UsuarioDev extends Usuario{

    public UsuarioDev(String usuario, String senha) {
        super(usuario, senha);
    }

    @Override
    public void showTypeUsuario() {
        System.out.println("O usuário " + getNome()+ " é:" + "DEV");
    }
}
