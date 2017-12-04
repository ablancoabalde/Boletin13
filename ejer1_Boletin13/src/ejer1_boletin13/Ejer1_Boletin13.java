package ejer1_boletin13;

public class Ejer1_Boletin13 {

    public static void main(String[] args) {

        ConversorTemperaturas ct=new ConversorTemperaturas();

        try {
            System.out.println("Grados Fharenheit "+ct.centigradosAFharenheit(-81));

        } catch (TemperaturaErradaExcepcion ex) {

            System.out.println(ex.getMessage());
        }
        try {

            System.out.println("Grados Remur "+ct.centígradosAReamur(75));

        } catch (TemperaturaErradaExcepcion ex) {

            System.out.println(ex.getMessage());
        }

    }

}
