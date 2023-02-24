/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.Interfases.Visuales;

import Utiles.MetodosUtiles.MetodosUtiles;

/**
 * Version 0.1
 * @author Rene
 */
public interface ControladorVisual {
     
     public default int inT(String numero){
         return MetodosUtiles.inT(numero);
     }
     public default boolean isEmptyOR(String... A){
        return MetodosUtiles.isEmptyOR(A);
    }
     public default boolean esNumeroAll(String... A) {
        return MetodosUtiles.esNumeroAll(A);
    }
     public default boolean isEmptyAll(String... A) {
     return MetodosUtiles.isEmptyAll(A);
     }
}
