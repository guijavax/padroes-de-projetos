package br.com.app;

import br.com.app.factory.GerenciadorUsuario;
import br.com.app.factory.GerenciadorUsuarioImpl;
import br.com.app.factory.TipoUsuario;
import br.com.app.factory.Usuario;

import java.lang.management.GarbageCollectorMXBean;

public class App {

    public static void main(String[] args)  {
        try {
            GerenciadorUsuario gerenciadorUsuariousuario = new GerenciadorUsuarioImpl();
            Usuario adm = gerenciadorUsuariousuario.createUsuario(TipoUsuario.ADM, "Guilherme", "234");
            adm.showTypeUsuario();

            Usuario cliente = gerenciadorUsuariousuario.createUsuario(TipoUsuario.CLIENTE, "Marilia", "45567");
            cliente.showTypeUsuario();

            Usuario dev = gerenciadorUsuariousuario.createUsuario(TipoUsuario.DEV, "Geovana", "6789");
            dev.showTypeUsuario();

            Usuario qualquer = gerenciadorUsuariousuario.createUsuario(TipoUsuario.OUTRO , "Geovana", "6789");
            qualquer.showTypeUsuario();

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
