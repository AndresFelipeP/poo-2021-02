package poo.vehiculo.app;

import poo.vehiculo.dominio.Vehiculo;
import poo.vehiculo.dominio.bici.Bicicleta;
import poo.vehiculo.dominio.bici.BicicletaMTB;
import poo.vehiculo.dominio.bici.BicicletaRuta;
import poo.vehiculo.dominio.carro.Carro;
import poo.vehiculo.dominio.carro.Taxi;
import poo.vehiculo.dominio.moto.Moto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AppVehiculo {

    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();

        Moto moto = new Moto("AKT", "NKD 125");
        Bicicleta bici = new BicicletaRuta("Dogma", "Pinarello");
        Carro carro = new Carro("BMW", "M3", "Triptonico");
        Bicicleta mtb = new BicicletaMTB("Trek", "X-Caliber");
        Vehiculo taxi = new Taxi("Chevrolet", "Spark", "Asistida", "TransUnidos", 4);

        vehiculos.add(moto);
        vehiculos.add(bici);
        vehiculos.add(carro);
        vehiculos.add(mtb);
        vehiculos.add(taxi);

        vehiculos.forEach(vehi -> {
            vehi.acelerar(new Random().nextInt(50));
            System.out.println(vehi + " va a " + vehi.getVelocidad() + "km/h \n");
        });
    }
}
