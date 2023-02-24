/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.Servidores.Serializable;

import Utiles.ClasesUtiles.Interfases.Funcionales.Creador;
import Utiles.ClasesUtiles.Interfases.Funcionales.CreadorConException;
import Utiles.ClasesUtiles.Interfases.Servidores.ObjetoRemoteServidor;
import Utiles.MetodosUtiles.ServidorUtil;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Rene
 */
public class ProcesoServidorRMI <E extends ObjetoRemoteClienteImp> {

    private E servidor;
    private Registry registry;

    private CreadorConException<E> creadorDeServidor;
    private Class interfasDeComunicacion;
    private int numeroRegistro;
    private String nombreDelRegistro;

    public ProcesoServidorRMI(CreadorConException<E> creadorDeServidor, Class interfasDeComunicacion, int numeroRegistro, String nombreDelRegistro) throws Exception {
        this.creadorDeServidor = creadorDeServidor;
        this.interfasDeComunicacion = interfasDeComunicacion;
        this.numeroRegistro = numeroRegistro;
        this.nombreDelRegistro = nombreDelRegistro;
        System.out.println("va a comenzar");
        start();
    }

//    public ProcesoServidorRMI(CreadorConException<E> creadorDeServidor, Class interfasDeComunicacion) throws RemoteException, NotBoundException {
//        this(creadorDeServidor, interfasDeComunicacion, 8888, "ServidorRMI");
//
//    }

//    public ProcesoServidorRMI(CreadorConException<E> creadorDeServidor, Class interfasDeComunicacion) throws RemoteException, NotBoundException {
//
//        this.creadorDeServidor = creadorDeServidor;
//        this.interfasDeComunicacion = interfasDeComunicacion;
//        start();
//    }

    public void start() throws Exception {
        System.out.println("comienza RMI");
        ServidorUtil.setCodeBase(interfasDeComunicacion);
        try {
            servidor = creadorDeServidor.crear();
            System.out.println("pasa por la creacion RMI");
        } catch (Exception ex) {
            
            System.out.println("ya existia este objeto exportado creado");
            ex.printStackTrace();
            registry = LocateRegistry.getRegistry(numeroRegistro);
            registry.unbind(nombreDelRegistro);
            servidor = creadorDeServidor.crear();
            System.out.println("continua con la creacion RMI");
        }
        System.out.println("RMI paso 1");
        E remote = servidor;
       
        System.out.println("RMI paso 2");
        try {
            registry = LocateRegistry.createRegistry(numeroRegistro);
        } catch (Exception ex) {
            System.out.println("ya existia el registro " + numeroRegistro);
//                    ex.printStackTrace();
registry = LocateRegistry.getRegistry(numeroRegistro);

        }
        System.out.println("RMI paso 3");
        try {
            registry.rebind(nombreDelRegistro, remote);
        } catch (RemoteException ex) {
            System.out.println("ya existia el enlace " + nombreDelRegistro);
//                    ex.printStackTrace();
registry.unbind(nombreDelRegistro);

registry.rebind(nombreDelRegistro, remote);
        }
        System.out.println("RMI creo servidor");
    }

    public void stop() throws RemoteException, NotBoundException {
        System.out.println("deteniendo servidor RMI");
        registry.unbind(nombreDelRegistro);
        System.out.println("RMI paso 1");
        /*bun */ UnicastRemoteObject.unexportObject(servidor, true);
        System.out.println("se detuvo el servidor RMI");

    }

    public E getServidor() {
        return servidor;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getNombreDelRegistro() {
        return nombreDelRegistro;
    }

    public void setNombreDelRegistro(String nombreDelRegistro) {
        this.nombreDelRegistro = nombreDelRegistro;
    }

}
