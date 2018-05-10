/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.juego.modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Juan David Correa
 */
public class LecturaArchivo implements ArchivoJuegoPOO {

    @Override
    public int[][] cargar(String ruta) {
        
        
        int matriz[][] = new int[6][13];
        File archivo = new File(ruta);
        if(archivo.exists()){
            try {
                Scanner lectura = new Scanner(archivo);
                while(lectura.hasNext()){
                  for (int i = 0; i < 6; i++) {
                      for (int j=0; j < 13;j++){
                    matriz[i][j] = lectura.nextInt();
                  }
                  }
                  
                }
            } catch (FileNotFoundException ex) {
              return null;  
            }
            
            return matriz;
        }else{
             return null;
    }
    
}
}