package poo.vehiculo.dominio.carro;

import poo.vehiculo.dominio.Vehiculo;

public class Carro extends Vehiculo {
    private String tipoTrasmision;

    public Carro(String marca, String modelo, String tipoTrasmision) {
        super(marca, modelo);
        this.tipoTrasmision = tipoTrasmision;
    }

    public String getTipoTrasmision() {
        return tipoTrasmision;
    }
}
