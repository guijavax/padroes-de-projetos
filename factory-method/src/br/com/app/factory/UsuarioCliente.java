package br.com.app.factory;

public class UsuarioCliente extends Usuario{

    public UsuarioCliente(String usuario, String senha) {
        super(usuario, senha);
    }

    @Override
    public void showTypeUsuario() {
        System.out.println("O usuário " + getNome()+ " é:" + "Cliente");
    }
}
