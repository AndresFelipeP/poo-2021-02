package poo.vehiculo.dominio.carro;

public class Taxi extends Carro {
    private String empresa;
    private int capacidadPasajeros;
    private int nroPasajerosActuales;

    public Taxi(String marca, String modelo, String tipoTrasmision, String empresa, int cantidadPasajeros) {
        super(marca, modelo, tipoTrasmision);
        this.empresa = empresa;
        this.capacidadPasajeros = cantidadPasajeros;
    }

    @Override
    public void acelerar(int incremento) {
        super.acelerar(incremento);
        System.out.println("Antes del turbo " + this.velocidad);
        this.velocidad += 80;
        System.out.println("Taxi de afán " + this.velocidad + "km / h");
    }

    public void recogerPasajero(){
        if (nroPasajerosActuales < capacidadPasajeros) {
            nroPasajerosActuales++;
        }
    }

    public void descargarPasajero() {
        if (nroPasajerosActuales > 0) {
            nroPasajerosActuales--;
        }
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public int getNroPasajerosActuales() {
        return nroPasajerosActuales;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
