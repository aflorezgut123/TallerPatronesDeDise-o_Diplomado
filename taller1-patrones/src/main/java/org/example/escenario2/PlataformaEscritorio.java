package org.example.escenario2;

public class PlataformaEscritorio implements Plataforma{
    public void mostrar(String tipo, String mensaje) {
        System.out.println("[ESCRITORIO - " + tipo + "] " + mensaje);
    }
}
