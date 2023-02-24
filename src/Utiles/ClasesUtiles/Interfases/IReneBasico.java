/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.Interfases;

import Utiles.MetodosUtiles.MetodosUtiles;

/**
 *
 * @author Rene
 */
public interface IReneBasico {

    public default boolean esNumeroInt(Object o) {
        if (o instanceof Integer) {
            return true;
        }
        return MetodosUtiles.esNumeroAll(o.toString());
    }
    
    public default int inT(Object o) {
        return MetodosUtiles.inT(o.toString());
    }
    public default double dou(Object o) {
        return MetodosUtiles.dou(o.toString());
    }
    
    public default boolean esNumeroDou(Object o) {
        if (o instanceof Integer) {
            return true;
        }
        if (o instanceof Float) {
            return true;
        }
        if (o instanceof Double) {
            return true;
        }
        return MetodosUtiles.esNumeroAll(o.toString());
    }
    
    public default boolean esArregloString(Object a) {
        return MetodosUtiles.esArregloString(a);
    }

    public default  boolean esArreglo(Object a) {
        return MetodosUtiles.esArreglo(a);
    }
}
