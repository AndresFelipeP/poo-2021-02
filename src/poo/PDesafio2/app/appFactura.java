package poo.PDesafio2.app;

import poo.PDesafio2.dominio.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class appFactura {
    public static void mostrarTotal(){

    }

    public static void mostrarValores(List<Factura> facturas){
        facturas.forEach(factura -> {
            System.out.println("Valor: " + factura.calcularTotal());
        });
    }

    public static void main(String[] args){
        List<Factura> facturas = new ArrayList<>();
        Factura facturaConIva = new FacturaConIVA(1,30, LocalDateTime.now(),16);
        Factura facturaConIva12 = new FacturaIVA12(2,15, LocalDateTime.now());
        Factura facturaConIbaYDescuento = new FacturaIVADes(3,30,LocalDateTime.now(),16,20);
        Factura facturaSinIva = new FacturaSinIVA(4,60,LocalDateTime.now());
        Factura facturaConDescuento = new FacturaDescuento(5,100, LocalDateTime.now(),30);

        facturas.add(facturaConIva);
        facturas.add(facturaConIva12);
        facturas.add(facturaConIbaYDescuento);
        facturas.add(facturaSinIva);
        facturas.add(facturaConDescuento);

        mostrarValores(facturas);
    }

}


