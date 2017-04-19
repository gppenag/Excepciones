/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Estudiante
 */
public class Archivos {
    
    public static void main(String[] args)  throws FileNotFoundException, IOException {
      //CREAR ARCHIVO SINO EXISTE
        File f = new File("arc.txt");
        if(!f.exists()){
         f.createNewFile();
        }
        
       /* System.out.println("exist returns"+f.exists());
        System.out.println("cadRead return"+ f.canRead());
        System.out.println("lenght return"+f.length());
        System.out.println("getAbsolutePath"+f.getAbsolutePath()); */
      
      /* ESRIBIR EN UN ARCHIVO
        PrintStream output
                = new PrintStream(new File("arc.txt"));
        output.println("Hello World.");
        output.println();
        output.println("Este programa produce 4 lineas de salida");*/
      
      /*SEPARADOS POR COMAS
      Scanner input = new Scanner(new File("hamlet.txt"));
      input.useDelimiter(",");*/
    }
}
