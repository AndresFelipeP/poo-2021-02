package poo.PDesafio2.dominio;

import java.time.LocalDateTime;

public class FacturaConIVA extends Factura {
    private int iva;

    public FacturaConIVA(int numero, long valor, LocalDateTime fecha, int iva) {
        super(numero, valor, fecha);
        this.iva = iva;
    }

    @Override
    public long calcularTotal() {
        return 0;
    }

}
