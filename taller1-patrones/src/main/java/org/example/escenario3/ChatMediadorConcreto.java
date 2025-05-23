package org.example.escenario3;

import java.util.ArrayList;
import java.util.List;

public class ChatMediadorConcreto implements Mediador {
    private List<Usuario> usuarios = new ArrayList<>();

    public void registrar(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void enviar(String mensaje, Usuario emisor) {
        for (Usuario usuario : usuarios) {
            if (!usuario.equals(emisor)) {
                usuario.recibir(mensaje);
            }
        }
    }
}
