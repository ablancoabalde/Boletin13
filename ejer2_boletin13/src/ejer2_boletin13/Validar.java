package ejer2_boletin13;

import javax.swing.JOptionPane;

public class Validar {

    public Validar() {
    }
    float numerador;

    public float ValidaOk() {
        boolean condicion=false;

        while (condicion==false) {
            numerador=Float.parseFloat(JOptionPane.showInputDialog("Grados Centigrados"));
            if (numerador<=-80) {

                JOptionPane.showMessageDialog(null, "Centigrados menor que 80 vuelva a meter");
                condicion=false;
            } else {
                condicion=true;

            }

        }
        return numerador;

    }

}
