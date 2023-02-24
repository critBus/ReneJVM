/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.MetodosUtiles;

import Utiles.ClasesUtiles.Interfases.Funcionales.Creador;
import Utiles.ClasesUtiles.Servidores.ProcesoServidor;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Metodos utile para servidores
 * Version 0.1
 * @author Rene
 */
public abstract class ServidorUtil {
    public static final String CODEBASE_RMI = "java.rmi.server.codebase";

    public static void setCodeBase(Class c) {
        String ruta = c.getProtectionDomain().getCodeSource().getLocation().toString(), path = System.getProperty(CODEBASE_RMI);
        if (path != null && !path.isEmpty()) {
            ruta = path + " " + ruta;
        }
        System.setProperty(CODEBASE_RMI, ruta);
    }
    
    public static String getHostNameLocal() throws UnknownHostException{
    
    return InetAddress.getLocalHost().getHostAddress();
    }
    
//    public static <E> ProcesoServidor getProcesoServidor(Creador<E> creadorDeServidor,Class Interfas){
//    return new ProcesoServidor(creadorDeServidor, Interfas);
//    }
}
