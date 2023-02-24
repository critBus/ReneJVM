/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.BasesDeDatos;

import Utiles.ClasesUtiles.Interfases.IReneBasico;
import Utiles.MetodosUtiles.MetodosUtiles;
import Utiles.MetodosUtiles.SQLUtil;
import java.sql.Time;
import java.util.Date;
//import 

/**
 *
 * @author Rene
 */
public abstract class BasicoBD implements IReneBasico {

    public  int toInt(Object o) {
        if (o == null || !esNumeroInt(o)) {
            return -1;
        }
        return inT(o);
    }
    public  double toDou(Object o) {
        if (o == null || !esNumeroDou(o)) {
            return -1;
        }
        return dou(o);
    }

    public  String to_String(Object o) {
        if (o == null) {
            return "";
        }
        return o.toString();
    }

    public  boolean toBool(Object o) {

        if (o == null) {
            return false;
        }
        String a = o.toString().trim().toLowerCase();
        if (!MetodosUtiles.esBool(a)) {
            return false;
        }
        return Boolean.valueOf(a);
    }

    public  Date toDate(Object o) {
        if (o == null) {
            return null;
        }

        if (o instanceof Date) {
            return (Date) o;
        }
        String a=o.toString().trim();
        if(a.isEmpty()){
            return null;
        }
        return getDate(a);
    }
    public  byte[] toBlob(Object o) {
        if(o==null){
        return new byte[0];
        }
        //algo para llevar a byte[]
        return new byte[0];
    }
    
    public  String fromBlob(Object o) {
        if(o instanceof byte[]){
        //algo
        }
        //algo
        return "";
    }
    
    
    public static Date getDate(String timestamp) {
        return SQLUtil.getDate(timestamp);
    }
    
    public  Time toTime(Object o){
        if(o==null){
        return null;
        }
        return Time.valueOf(o.toString());
        //Time.valueOf(s)
    //Date d=toDate(o);
    //eturn new Time(d.getHours(),d.getMinutes(),d.getSeconds());
    }
    
    
}
