/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */

    

    
        public static void main(String[] args) {
        Excepciones excepciones = new Excepciones ();
        int denominador = 0;
        double resultado = 0;
        Scanner lectura = new Scanner (System .in);
            for (int i = 0; i < 5; i++) {
                denominador = lectura.nextInt();
                resultado = excepciones.dividirCero(denominador);
                System.out.println(resultado);
            }
    }
        
            public static double dividirCero(int denominador){
    double resultado = 0;
    
    try{
        resultado = 25/denominador;
    }catch(ArithmeticException e){
        System.out.println("division por cero");
       //e.printStackTrace(); 
        System.out.println(e.getMessage());
    }
    return resultado;
    
}
}
