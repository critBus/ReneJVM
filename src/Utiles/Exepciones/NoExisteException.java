/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.Exepciones;

/**
 *
 * @author Rene
 */
public class NoExisteException extends Exception{

    public NoExisteException() {
    }

    public NoExisteException(String message) {
        super(message);
    }
    
}