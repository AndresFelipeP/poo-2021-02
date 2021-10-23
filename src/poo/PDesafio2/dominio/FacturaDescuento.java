package poo.PDesafio2.dominio;

import java.time.LocalDateTime;

public class FacturaDescuento extends FacturaSinIVA{

    private int porcDescuento;

    public FacturaDescuento(int numero, long valor, LocalDateTime fecha, int porcDescuento) {
        super(numero, valor, fecha);
        this.porcDescuento = porcDescuento;
    }

    @Override
    public long calcularTotal() {
        return 0;
    }
}