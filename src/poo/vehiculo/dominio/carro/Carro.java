package poo.vehiculo.dominio.carro;

import poo.vehiculo.dominio.Vehiculo;

public class Carro extends Vehiculo {
    private String tipoTrasmision;

    public Carro(String marca, String modelo, String tipoTrasmision) {
        super(marca, modelo);
        this.tipoTrasmision = tipoTrasmision;
    }

    @Override
    public void acelerar(int incremento) {
        System.out.println("Acelerando carro");
        this.velocidad += incremento + 20;
    }

    public String getTipoTrasmision() {
        return tipoTrasmision;
    }
}
