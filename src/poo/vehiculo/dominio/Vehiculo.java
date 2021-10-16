package poo.vehiculo.dominio;

public abstract class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    protected int velocidad;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void acelerar(int incremento);

    public void frenar(int decremento) {
        this.velocidad -= decremento;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
