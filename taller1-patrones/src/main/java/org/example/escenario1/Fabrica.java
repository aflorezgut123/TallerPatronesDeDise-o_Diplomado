package org.example.escenario1;

public class Fabrica {
    public Automovil construirAltaGama(){
        return Automovil.builder()
                .motor("V8")
                .color("negro mate")
                .llantas("bridgestone")
                .sonido("bose")
                .interiores("cuero")
                .techoSolar(true)
                .gps(true)
                .build();
    }

    public Automovil construirGamaEstandar(){
        return Automovil.builder()
                .motor("Renault")
                .color("rojo")
                .llantas("Hankook")
                .sonido("pioneer")
                .interiores("tela")
                .techoSolar(false)
                .gps(false)
                .build();
    }
}
