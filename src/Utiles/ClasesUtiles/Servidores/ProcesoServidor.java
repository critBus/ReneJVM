/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.Servidores;

import Utiles.ClasesUtiles.Interfases.Funcionales.Creador;
import Utiles.MetodosUtiles.ServidorUtil;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * E es el tipo de servidor<br/>
 * I es el tipo de interfas, E implementa a I
 *
 * @author Rene
 */
public class ProcesoServidor<E extends I, I extends Remote> {

    private E servidor;
    private Registry registry;

    private Creador<E> creadorDeServidor;
    private Class interfasDeComunicacion;
    private int numeroRegistro;
    private String nombreDelRegistro;

    public ProcesoServidor(Creador<E> creadorDeServidor, Class interfasDeComunicacion, int numeroRegistro, String nombreDelRegistro) throws RemoteException, NotBoundException {
        this.creadorDeServidor = creadorDeServidor;
        this.interfasDeComunicacion = interfasDeComunicacion;
        this.numeroRegistro = numeroRegistro;
        this.nombreDelRegistro = nombreDelRegistro;
        System.out.println("va a comenzar");
        start();
    }

    public ProcesoServidor(Creador<E> creadorDeServidor, Class interfasDeComunicacion) throws RemoteException, NotBoundException {
        this(creadorDeServidor, interfasDeComunicacion, 8888, "ServidorRMI");

    }

    public void start() throws RemoteException, NotBoundException {

        System.out.println("comienza RMI");
        ServidorUtil.setCodeBase(interfasDeComunicacion);
        servidor = creadorDeServidor.crear();
        System.out.println("RMI paso 1");
        I remote = null;
        if (!(servidor instanceof UnicastRemoteObject)) {
            try {
                remote = (I) UnicastRemoteObject.exportObject(servidor, numeroRegistro);
            } catch (Exception ex) {
                System.out.println("ya existia este objeto exportado");
//                    ex.printStackTrace();
                System.out.println("error 1 ***************************8");

                UnicastRemoteObject.unexportObject(servidor, true);
                remote = (I) UnicastRemoteObject.exportObject(servidor, numeroRegistro);

            }
        }else{
        remote=servidor;
        }
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
