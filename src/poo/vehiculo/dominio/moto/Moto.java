package poo.vehiculo.dominio.moto;

import poo.vehiculo.dominio.Vehiculo;

public class Moto extends Vehiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar(int incremento) {
        System.out.println("Acelerando moto");
        this.velocidad += incremento;
    }
}
