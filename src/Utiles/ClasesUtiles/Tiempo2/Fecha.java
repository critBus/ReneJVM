/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.Tiempo2;

import Utiles.ClasesUtiles.Interfases.Clonable;
import Utiles.ClasesUtiles.Interfases.Semejantes;
import Utiles.ClasesUtiles.Interfases.Iteradora;
import Utiles.ClasesUtiles.Interfases.metodosParaInterfases;
import java.util.Arrays;
import java.util.Iterator;
import static Utiles.MetodosUtiles.Tempus.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Rene
 */
public class Fecha implements Semejantes<Fecha>, Comparable<Fecha>, Iteradora<Fecha>, Serializable,Clonable<Fecha> {

    int dia;//0
    int mes;//0
    int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public  Date toDate(){
    return new Date(año-1900,mes,dia);
    }
    
    @Override
    public boolean igualA(Fecha a) {
        return (a instanceof Fecha && a.getDia() == getDia() && a.getMes() == getMes() && a.getAño() == getAño());
    }

    @Override
    public String toString() {
        //   System.out.println(String.format("%02ds", dia));
        // return dia+"/"+mes+"/"+año;
        //    System.out.println(dia+" "+mes+" "+año);
        return String.format("%02d/%02d/%04d", dia + 1, mes + 1, año);
    }

    @Override
    public int compareTo(Fecha o) {
//        if (igualA(o)) {
//            return 0;
//        }
        if (año == o.año) {
            if (mes == o.mes) {
                return new Integer(dia).compareTo(o.dia);
            }
            return new Integer(mes).compareTo(o.mes);
        }
        return new Integer(año).compareTo(o.año);
    }

    @Override
    public Fecha next() {
        int mes = this.mes;
        int cantidadDeDiasDelMes = cantidadDeDiasMes(mes);
        int año = this.año;
        int dia = this.dia + 1;
        if (!(cantidadDeDiasDelMes > dia)) {
            if (mes == 11) {
                ++año;
            }
            mes = aumentoMes(mes);
            dia = 0;
        }
        return new Fecha(dia, mes, año);
    }
    public Fecha avanza() {
    Fecha next=next();
    dia=next.dia;
    año=next.año;
    mes=next.mes;
    return this;
    }

    @Override
    public Fecha next(int siguientes) {
        return (Fecha) metodosParaInterfases.next(this, siguientes);
//        if (siguientes < 1) {
//            return null;
//        }
//        Fecha f = new Fecha(dia, mes, año);
//        while (siguientes-- > 0) {
//            f = f.next();
//        }
//        return f;
    }

    @Override
    public Fecha before() {
        int mes = this.mes;
        // int cantidadDeDiasDelMes = cantidadDeDiasMes(mes);
        int año = this.año;
        int dia = this.dia - 1;
        if (dia < 0) {
            if (mes == 0) {
                --año;
            }
            mes = retrocesoMes(mes);
            dia = cantidadDeDiasMes(mes) - 1;
        }
        return new Fecha(dia, mes, año);
    }

    @Override
    public Fecha before(int anteriores) {
        return (Fecha) metodosParaInterfases.before(this, anteriores);
//        if (anteriores < 1) {
//            return null;
//        }
//        Fecha f = new Fecha(dia, mes, año);
//        while (anteriores-- > 0) {
//            f = f.after();
//        }
//        return f;
    }

    @Override
    public Fecha copia() {
        return new Fecha(dia, mes, año);
    }

    public static Fecha normal(int dia,int mes ,int año){
    return new Fecha(dia-1, mes-1, año);
    }
}
