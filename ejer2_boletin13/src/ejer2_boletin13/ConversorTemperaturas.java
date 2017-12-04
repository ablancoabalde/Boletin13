
package ejer2_boletin13;

public class ConversorTemperaturas {
    static final float CONSTANTE=-80;

    public ConversorTemperaturas() {
    }

    public float centigradosAFharenheit(float tempC) throws TemperaturaErradaExcepcion {

        if (tempC<=CONSTANTE) {
            throw new TemperaturaErradaExcepcion();
        } else {
            return ((float) ((9/5)*(tempC+32.4)));
        }

    }

    public float centígradosAReamur(float tempC) throws TemperaturaErradaExcepcion {

        if (tempC<CONSTANTE) {
            throw new TemperaturaErradaExcepcion();
        } else {
            return ((float) ((4.0/5.0)*tempC));
        }

    }
}
