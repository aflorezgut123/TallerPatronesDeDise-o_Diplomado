package org.example.escenario1;

import lombok.Builder;
import lombok.Data;

@Data // Anotación que genera los getters, setters, toString y constructor con valores finales.
@Builder // Anotación que genera automaticamente la clase estatica y la función build.
public class Automovil {
    private final String motor;
    private final String color;
    private final String llantas;
    private final String sonido;
    private final String interiores;
    private final boolean techoSolar;
    private final boolean gps;
}
