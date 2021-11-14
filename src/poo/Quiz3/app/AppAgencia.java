package poo.Quiz3.app;

import poo.Quiz3.dominio.Agencia;
import poo.Quiz3.dominio.Apartamento;
import poo.Quiz3.dominio.Casa;
import poo.Quiz3.dominio.Lote;

public class AppAgencia {
    public static void main(String[] args) {
        Agencia agencia = new Agencia("TUHOGAR");

        Apartamento Verdi = new Apartamento("2302",250000000, 10000000,false,3);
        Apartamento LaMartina = new Apartamento("1204",315000000, 12000000,true,4);

        Casa Valcones = new Casa("carreara50c #67-2", 300000000, 12000000, true);
        Casa Lotus = new Casa("carreara45c #62-25", 412000000, 13500000, true);

        Lote AltosDelLago= new Lote("carreara50c #61-32", 450000000, 13000000, true);

        agencia.agregarInmueble(Verdi,LaMartina,Valcones,Lotus,AltosDelLago);
        agencia.arrendar(Verdi);
        System.out.println("Inmuebles arrendados: ");
        agencia.listaArrendados();
    }


}
