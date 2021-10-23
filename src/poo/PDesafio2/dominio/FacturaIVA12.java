package poo.PDesafio2.dominio;


import java.time.LocalDateTime;

public class FacturaIVA12 extends FacturaConIVA{


    public FacturaIVA12(int numero, long valor, LocalDateTime fecha) {
        super(numero, valor, fecha, 12);
    }

    @Override
    public long calcularTotal() {
        return 0;
    }

}
