package poo.Desafio2.dominio;

public class Vendedor extends Directo{
    private long ventasDelMes;
    private long salario;


    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes = ventasDelMes;
        this.salario=salario;
    }

    public long CalcularComision(){
        long saldo=0;
        if (salario>=999999){
            saldo=(long)(ventasDelMes*0.055);
        }else{
            saldo=(long)(ventasDelMes*0.045);
        }
        return saldo;
    }
    @Override
    public long calcularSalario() {

        return this.salario+CalcularComision()-(calcularPension()+calcularSalud());
    }


}
