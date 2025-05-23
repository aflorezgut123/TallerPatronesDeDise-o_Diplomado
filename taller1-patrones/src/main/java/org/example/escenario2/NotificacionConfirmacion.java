package org.example.escenario2;

public class NotificacionConfirmacion extends Notificacion{
    public NotificacionConfirmacion(Plataforma plataforma) {
        super(plataforma);
    }

    public void enviar(String mensaje) {
        plataforma.mostrar("Confirmación", mensaje);
    }
}
