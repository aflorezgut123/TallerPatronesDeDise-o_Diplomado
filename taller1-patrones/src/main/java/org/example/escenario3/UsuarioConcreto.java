package org.example.escenario3;

public class UsuarioConcreto extends Usuario {
    public UsuarioConcreto(String nombre, Mediador mediador) {
        super(nombre, mediador);
    }

    @Override
    public void recibir(String mensaje) {
        System.out.println(nombre + " recibió: " + mensaje);
    }
}

