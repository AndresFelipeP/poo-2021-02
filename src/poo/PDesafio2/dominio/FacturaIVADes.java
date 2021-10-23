package poo.PDesafio2.dominio;

import java.time.LocalDateTime;

public class FacturaIVADes extends FacturaConIVA{

    private int porcDescuento;

    public FacturaIVADes(int numero, long valor, LocalDateTime fecha, int iva, int porcDescuento) {
        super(numero, valor, fecha, iva);
        this.porcDescuento = porcDescuento;
    }

    @Override
    public long calcularTotal() {
        return 0;
    }
}
