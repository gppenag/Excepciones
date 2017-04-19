/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones1;

import excepciones.*;
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
                try{
                resultado = excepciones.dividirCero(denominador);
                }catch(CustomException e){
                System.out.println(e.getMessage());
                }
                System.out.println(resultado);
            }
    }
        
    public double dividirCero(int denominador)throws CustomException{
    double resultado = 0;
    if(denominador == 0)
        throw new CustomException();
        resultado = 25/denominador;
    return resultado;
    
}
    
    public double dividir (int denominador)throws CustomException{
        //poner try catch si le corresponde o poner thows para decir que no me hago cargo
        return this.dividirCero(denominador);
    }
}
