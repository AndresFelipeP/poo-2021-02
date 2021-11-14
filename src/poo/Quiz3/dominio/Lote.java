package poo.Quiz3.dominio;

public class Lote extends Inmueble{
    private long dimensiones;


    public Lote(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
        this.dimensiones= dimensiones;
    }

    public long getDimensiones() {
        return dimensiones;
    }
}
