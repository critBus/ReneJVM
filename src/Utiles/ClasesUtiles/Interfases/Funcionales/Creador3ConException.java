/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.Interfases.Funcionales;

/**
 *D es el tipo respuesta y A,B,D los parametros
 * @author Rene
 * 
 */
public interface Creador3ConException <A,B,C,D> {
    public D crear(A a,B b,C c) throws Exception;
}
