/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

/**
 *
 * @author Rene
 */
public class provar2 {

    public static boolean esCubicoPerfecto(int numero) {
        //int cantidadDeUnidades=(numero+"").length();
        int temporal = numero;
        int dm = -1;
        if (temporal > 9999) {
            dm = temporal / 10000;
            temporal = temporal - (dm * 10000);
        }

        int m = -1;
        if (temporal > 999) {
            m = temporal / 1000;
            temporal = temporal - (m * 1000);
        }

        int centena = -1;
        if (temporal > 99) {
            centena = temporal / 100;
            temporal = temporal - (centena * 100);
        }

        int decena = -1;
        if (temporal > 9) {
            decena = temporal / 10;
            temporal = temporal - (decena * 10);
        }

        int unidad = temporal;

        int suma = 0;
        if (dm != -1) {
            suma += dm * dm * dm;
        }
        if (m != -1) {
            suma += m * m * m;
        }
        if (centena != -1) {
            suma += centena * centena * centena;
        }
        if (decena != -1) {
            suma += decena * decena * decena;
        }

        suma += unidad * unidad * unidad;
        return suma == numero;

        // System.out.println("dm="+dm+" m="+m+" centena="+centena+" decena="+decena+" unidad="+unidad);
        // return false;
    }

    public static void main(String[] args) {
        for (int i = 2; i < 10000; i++) {
            boolean esPerfecto = esCubicoPerfecto(i);
            if (esPerfecto) {
                System.out.println("esPerfecto=" + esPerfecto + " i=" + i);
            }

        }

//        int a=-1,b=4,c=3;
//        do{
//        if(a>0){
//            b-=c;
//        }else{
//            a++;
//            b=a/c;
//        }
//            System.out.println("a="+a+" b="+b+" c="+c);
//        }while(b>=0);
    }
}
