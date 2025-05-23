package org.example.escenario2;

public class NotificacionAlerta extends Notificacion{
    public NotificacionAlerta(Plataforma plataforma) {
        super(plataforma);
    }

    public void enviar(String mensaje) {
        plataforma.mostrar("Alerta", mensaje);
    }
}
