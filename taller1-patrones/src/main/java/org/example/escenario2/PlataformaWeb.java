package org.example.escenario2;

public class PlataformaWeb implements Plataforma{
    public void mostrar(String tipo, String mensaje) {
        System.out.println("[WEB - " + tipo + "] " + mensaje);
    }
}
