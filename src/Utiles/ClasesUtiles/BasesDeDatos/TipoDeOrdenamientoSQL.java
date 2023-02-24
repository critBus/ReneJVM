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
public enum TipoDeOrdenamientoSQL {
    ASC("ASC"),DESC("DESC");
    private final String  valor;

    private TipoDeOrdenamientoSQL(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    

    
    public static boolean esTipoDeOrdenamientoSQL(Object e){
        return e instanceof TipoDeOrdenamientoSQL;
    }
    
    public static TipoDeOrdenamientoSQL get(String a){
    return TipoDeOrdenamientoSQL.valueOf(a);
    }
    
    public static boolean pertenece(String a){
    return TipoDeOrdenamientoSQL.get(a)!=null;
    }
    
}
