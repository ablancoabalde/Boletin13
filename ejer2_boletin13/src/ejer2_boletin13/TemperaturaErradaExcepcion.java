
package ejer2_boletin13;

public class TemperaturaErradaExcepcion extends Exception{
        public TemperaturaErradaExcepcion() {

        super("Temperatura menor de 80 grados");

    }

    public TemperaturaErradaExcepcion(String msg) {

        super(msg);

    }
}
