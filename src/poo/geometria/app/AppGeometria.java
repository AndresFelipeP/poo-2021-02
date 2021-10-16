package poo.geometria.app;

import poo.geometria.dominio.Circulo;
import poo.geometria.dominio.Cuadrado;
import poo.geometria.dominio.Figura;
import poo.geometria.dominio.TrianguloRectangulo;

import java.util.ArrayList;
import java.util.List;

public class AppGeometria {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();

        Figura figura = new TrianguloRectangulo(50, 87);
        Circulo circulo = new Circulo(80);
        Cuadrado cuadrado = new Cuadrado(5, 6);

        figuras.add(figura);
        figuras.add(circulo);
        figuras.add(cuadrado);

        figuras.forEach(f -> {
            System.out.println("Se calculará el área y perímetro de " + f);
            System.out.println("Área " + f.calcularArea());
            System.out.println("Perímetro " + f.calcularPerimetro() + "\n");
        });
    }
}
