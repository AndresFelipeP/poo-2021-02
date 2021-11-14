package poo.Quiz3.dominio;

public class Apartamento extends Inmueble implements Arrendable{
    private int habitaciones;

    public Apartamento(String direccion, long valorVenta, long valorArriendo, boolean arrendado, int habitaciones) {
        super(direccion, valorVenta, valorArriendo, arrendado);
        this.habitaciones= habitaciones;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    @Override
    public void arrendar() {
        super.setArrendado(true);

    }

    @Override
    public void devolver() {
        super.setArrendado(false);

    }
    @Override
    public String toString() {
        return "Apartamento{" +
                "nroHabitaciones=" + habitaciones + '\'' + ", Valor de la venta='" +  getValorVenta() + '\'' + ", Valor del Arriendo='" +  getValorArriendo() + '\'' +
                ", Estado='" +  isArrendado() + '\'' + ", Direccion='" +  getDireccion() + '\'' + '}';
    }
}

