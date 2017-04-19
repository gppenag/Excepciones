/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones1;

import excepciones.*;

/**
 *
 * @author Estudiante
 */
public class CustomException extends Exception{
    
public CustomException(){
    //Indicar que paso, la excepcion se encarga de no terminar, 
    //si nadie se hace responsable se rompe la ejecucion (Sistema operativo)
    //Excepcion que es el papa, con super le envia el mns
    super("Error personalizado");
}    
}
