package org.example.escenario2;

public class NotificacionAdvertencia extends Notificacion{
    public NotificacionAdvertencia(Plataforma plataforma) {
        super(plataforma);
    }

    public void enviar(String mensaje) {
        plataforma.mostrar("Advertencia", mensaje);
    }
}
