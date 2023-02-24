/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.BasesDeDatos;

/**
 *
 * @author Rene
 */
public class ModeloDeApiBD<E> {
    public int idkey;
    public E apibd;

    public ModeloDeApiBD(int idkey, E apibd) {
        this.idkey = idkey;
        this.apibd = apibd;
    }

    public int getIdkey() {
        return idkey;
    }

    public void setIdkey(int idkey) {
        this.idkey = idkey;
    }

    public E getApibd() {
        return apibd;
    }

    public void setApibd(E apibd) {
        this.apibd = apibd;
    }
    
}
