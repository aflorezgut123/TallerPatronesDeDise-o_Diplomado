package org.example.escenario3;

public abstract class Usuario {
    protected String nombre;
    protected Mediador mediador;

    public Usuario(String nombre, Mediador mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
    }

    public void enviar(String mensaje) {
        System.out.println(nombre + " envía: " + mensaje);
        mediador.enviar(mensaje, this);
    }

    public abstract void recibir(String mensaje);
}
