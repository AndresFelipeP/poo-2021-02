package poo.vehiculo.app;

import poo.vehiculo.dominio.Vehiculo;
import poo.vehiculo.dominio.bici.Bicicleta;
import poo.vehiculo.dominio.bici.BicicletaCrono;
import poo.vehiculo.dominio.bici.BicicletaMTB;
import poo.vehiculo.dominio.bici.BicicletaRuta;
import poo.vehiculo.dominio.carro.Carro;
import poo.vehiculo.dominio.carro.Taxi;
import poo.vehiculo.dominio.moto.Moto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class AppVehiculo {

    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Moto moto = new Moto("AKT", "NKD 125");
        Bicicleta bici = new BicicletaRuta("Dogma", "Pinarello");
        Carro carro = new Carro("BMW", "M3", "Triptonico");
        Bicicleta mtb = new BicicletaMTB("Trek", "X-Caliber");
        Vehiculo taxi = new Taxi("Chevrolet", "Spark", "Asistida", "TransUnidos", 4);

        vehiculos.add(taxi);
        vehiculos.add(bici);
        vehiculos.add(carro);
        vehiculos.add(mtb);
        vehiculos.add(moto);

        vehiculos.forEach(vehiculo -> {
            if (vehiculo instanceof Taxi) {
                Taxi miTaxi = (Taxi) vehiculo;
                System.out.println("El taxi viene con " + miTaxi.getNroPasajerosActuales() + " pasajeros.");
                miTaxi.recogerPasajero();
                miTaxi.recogerPasajero();
                System.out.println("El taxi se va con " + miTaxi.getNroPasajerosActuales() + " pasajeros.");
            }
        });

        vehiculos.forEach(vehi -> {
            vehi.acelerar(new Random().nextInt(50));
            System.out.println(vehi + " va a " + vehi.getVelocidad() + "km/h \n");
        });

        for (Vehiculo v: vehiculos) {
            if (v instanceof Taxi) {
                System.out.println("El taxi lleva " + ((Taxi) v).getNroPasajerosActuales());
            }
        }

        vehiculos.stream().filter(v -> v instanceof Bicicleta).forEach(bicicleta -> {
            System.out.println("La " + bicicleta.getMarca() + " "
                    + bicicleta.getModelo() + " tiene "
                    + ((Bicicleta) bicicleta).getCadencia() + " pedaleadas por minuto.");
        });
    }
}
