package poo.Desafio2.dominio;

public class Freelance extends Empleado{
    private long ValorHora;
    private int HorasTrabajadas;

    public Freelance(String nombre, long valorHora, int HorasTrabajadas) {
        super(nombre);
        this.ValorHora = valorHora;
        this.HorasTrabajadas = HorasTrabajadas;
    }

    @Override
    public long calcularSalario() {
        return ValorHora*HorasTrabajadas;
    }

}

