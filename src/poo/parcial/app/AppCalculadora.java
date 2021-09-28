package poo.parcial.app;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class AppCalculadora {
    private static final int OPCION_SUMAR = 0;
    private static final int OPCION_RESTAR = 1;
    private static final int OPCION_MULTIPLICAR = 2;
    private static final int OPCION_DIVIDIR = 3;

    public static void main(String[] args) {
        JCheckBox checkbox = new JCheckBox("Redondear");

        while (true) {
            int opcionElegida = JOptionPane.showOptionDialog(null,
                    "Elige una de las siguientes opciones", "POO", 0, 0, null,
                    Arrays.asList("Sumar", "Restar", "Multiplicar", "Dvidir", checkbox).toArray(), null);

            switch (opcionElegida) {
                case OPCION_SUMAR: {
                    int aleatorio = new Random().nextInt(3);
                    JOptionPane.showMessageDialog(null, "Aleatorio: " + aleatorio);
                    break;
                }
                case OPCION_DIVIDIR: {
                    double numero1 = 78;
                    double numero2 = 60;

                    double resultado = numero1 / numero2;
                    System.out.println(resultado);
                    if (checkbox.isSelected()) {
                        resultado = Math.round(resultado);
                    }

                    JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
                    break;
                }
                case JOptionPane.CLOSED_OPTION:
                    return;
            }
        }
    }
}
