package poo.vehiculo.dominio.bici;

public class BicicletaMTB extends Bicicleta {
    public BicicletaMTB(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void acelerar(int incremento) {
        System.out.println("Acelerando bici de montaña... 🚵️");
        super.acelerar(incremento);
        this.velocidad += incremento / 2;
    }

    @Override
    public String toString() {
        return "MTB";
    }
}
