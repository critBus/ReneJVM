/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.Interfases.Funcionales;

/**
 *  Del Tipo ( E -> R )
 * @author Rene
 */
@FunctionalInterface
public interface Creador1ConException <E,R> {
    public R crear(E e) throws Exception;
}
