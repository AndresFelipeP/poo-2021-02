package poo.Desafio2.dominio;

public class Directo extends Empleado{
    protected long salario;
    public static long salarioM = 6000000;

    public Directo(String nombre, long salario){
        super(nombre);
        this.salario = salario;
    }

    public long calcularSalud(){

        return(long) (0.04*salario);
    }

    public long calcularPension(){

        return (long) (0.065*salario);
    }

    public long calcularAporte() {
        if (salario > salarioM) {
            return 15000;
        }

        return 0;
    }

    @Override
    public long calcularSalario() {
        return salario-(this.calcularPension()+this.calcularSalud()-this.calcularAporte());
    }

}


