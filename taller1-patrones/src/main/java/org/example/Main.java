package org.example;

import org.example.escenario2.*;
import org.example.escenario1.Automovil;
import org.example.escenario1.Fabrica;
import org.example.escenario3.ChatMediadorConcreto;
import org.example.escenario3.Mediador;
import org.example.escenario3.Usuario;
import org.example.escenario3.UsuarioConcreto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();

        //Uso de director Fabrica, este usa la instancia builder para construir configuraciones predefinidas
        Automovil altaGama = fabrica.construirAltaGama();
        Automovil gamaEstandar = fabrica.construirGamaEstandar();

        //Uso directo de builder en caso de necesitar una configuración especifica
        Automovil personalizado = Automovil.builder()
                .motor("SKYACTIV-G 2.0L")
                .color("rojo diamante")
                .llantas("continental")
                .interiores("cuero")
                .sonido("bose")
                .gps(true)
                .build();
        System.out.println("------------------------ESCENARIO 1--------------------------------");
        System.out.println(altaGama);
        System.out.println(gamaEstandar);
        System.out.println(personalizado);

        System.out.println("------------------------ESCENARIO 2--------------------------------");
        Plataforma web = new PlataformaWeb();
        Plataforma movil = new PlataformaMovil();

        Notificacion mensajeWeb = new NotificacionMensaje(web);
        Notificacion alertaMovil = new NotificacionAlerta(movil);

        mensajeWeb.enviar("Tienes un nuevo mensaje.");
        alertaMovil.enviar("¡Atención! Batería baja.");

        System.out.println("------------------------ESCENARIO 3--------------------------------");
        Mediador chat = new ChatMediadorConcreto();

        Usuario u1 = new UsuarioConcreto("Anderson", chat);
        Usuario u2 = new UsuarioConcreto("Amparo", chat);
        Usuario u3 = new UsuarioConcreto("Alonso", chat);

        ((ChatMediadorConcreto) chat).registrar(u1);
        ((ChatMediadorConcreto) chat).registrar(u2);
        ((ChatMediadorConcreto) chat).registrar(u3);

        u1.enviar("Hola a todos");
        u2.enviar("¡Hola Hijo!");
    }
}