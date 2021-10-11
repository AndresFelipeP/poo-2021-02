package poo.vehiculo.dominio.bici;

import poo.vehiculo.dominio.Vehiculo;

public class Bicicleta extends Vehiculo {
    private int cadencia;

    public Bicicleta(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar(int incremento) {
        System.out.println("Acelerando como bici normal...");
        this.velocidad += incremento * 1.2;
    }

    public int getCadencia() {
        return cadencia;
    }

    public void setCadencia(int cadencia) {
        this.cadencia = cadencia;
    }
}
