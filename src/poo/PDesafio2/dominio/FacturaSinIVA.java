package poo.PDesafio2.dominio;

import java.time.LocalDateTime;

public  class FacturaSinIVA extends Factura{
    public FacturaSinIVA(int numero, long valor, LocalDateTime fecha) {
        super(numero, valor, fecha);
    }

    @Override
    public long calcularTotal() {
        return 0; // en este return quisiera llamar al valor de valor del constructor de arriba
    }

}