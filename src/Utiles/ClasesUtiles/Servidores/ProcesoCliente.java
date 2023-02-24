/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.Servidores;

import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Rene
 */
public class ProcesoCliente<E extends Remote> {

    private E servidor;
    private Registry registry;

    private int numeroRegistro;
    private String nombreDelRegistro,host;

    public ProcesoCliente() throws Exception {
        this("localhost",8888, "ServidorRMI");
    }

    public ProcesoCliente(String host,int numeroRegistro, String nombreDelRegistro) throws Exception {
        this.numeroRegistro = numeroRegistro;
        this.nombreDelRegistro = nombreDelRegistro;
        this.host=host;
        start();
    }

    public void start() throws Exception {
        registry = LocateRegistry.getRegistry(host, numeroRegistro);
//        Object o =  Naming.lookup("rmi://" + host+":"+numeroRegistro + "/"+nombreDelRegistro);
        Object o=registry.lookup(nombreDelRegistro);
        servidor = (E) o;
        //servidor = (E) registry.lookup(nombreDelRegistro);

    }

//    public void stop() throws RemoteException, NotBoundException {
//        registry.unbind(nombreDelRegistro);
//        
//
//    }

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
