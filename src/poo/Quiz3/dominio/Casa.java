package poo.Quiz3.dominio;

public class Casa extends Inmueble implements Arrendable{

    public Casa(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
    }

    @Override
    public void arrendar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public String toString() {
        return "Casa{" +
                "Valor de la venta='" +  getValorVenta() + '\'' + ", Valor del Arriendo='" +  getValorArriendo() + '\'' +
                ", Estado='" +  isArrendado() + '\''+ ", Direccion='" +  getDireccion() + '\'' + '}';
    }
}
