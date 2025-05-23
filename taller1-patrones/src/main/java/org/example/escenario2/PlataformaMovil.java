package org.example.escenario2;

public class PlataformaMovil implements Plataforma{
    public void mostrar(String tipo, String mensaje) {
        System.out.println("[MOVIL - " + tipo + "] " + mensaje);
    }
}
