
package ejer2_boletin13;

import javax.swing.JOptionPane;

public class Ejer2_boletin13 {

    public static void main(String[] args) {
        ConversorTemperaturas ct=new ConversorTemperaturas();
        Validar validacion = new Validar();
        
        try {
            
            System.out.println("Grados Fharenheit "+ct.centigradosAFharenheit(validacion.ValidaOk()));
            
            
            
        } catch (TemperaturaErradaExcepcion ex) {

            System.out.println(ex.getMessage());
        }
      
        try {

            System.out.println("Grados Remur "+ct.centígradosAReamur(validacion.ValidaOk()));

        } catch (TemperaturaErradaExcepcion ex) {

            System.out.println(ex.getMessage());
        }

    }
    }
    

