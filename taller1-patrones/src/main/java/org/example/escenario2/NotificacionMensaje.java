package org.example.escenario2;

public class NotificacionMensaje extends Notificacion{
    public NotificacionMensaje(Plataforma plataforma) {
        super(plataforma);
    }

    public void enviar(String mensaje) {
        plataforma.mostrar("Mensaje", mensaje);
    }
}
