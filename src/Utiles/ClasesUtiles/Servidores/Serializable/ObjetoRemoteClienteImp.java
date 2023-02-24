/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.Servidores.Serializable;

import Utiles.ClasesUtiles.Interfases.Funcionales.Utilizar2;
import Utiles.ClasesUtiles.Interfases.Servidores.DatosRemote;
import Utiles.ClasesUtiles.Interfases.Servidores.ObjetoRemoteServidor;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;

/**
 *
 * @author Rene
 */
public class ObjetoRemoteClienteImp extends UnicastRemoteObject implements DatosRemote {
    private String host,nombreObjetoRemoto;
    private int port;
    private boolean conectado;

    
    public ObjetoRemoteClienteImp(String host, int port, String nombreObjetoRemoto) throws RemoteException {
        super(port);
        this.host = host;
        this.nombreObjetoRemoto = nombreObjetoRemoto;
        this.port = port;
        conectado=true;
    }
    
    
    
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getNombreObjetoRemoto() {
        return nombreObjetoRemoto;
    }

    public void setNombreObjetoRemoto(String nombreObjetoRemoto) {
        this.nombreObjetoRemoto = nombreObjetoRemoto;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
    

    @Override
    public boolean estaConectado() throws Exception {
        return conectado;
    }
    
    public boolean igualA(DatosRemote d) throws Exception{
    //return host.equals(d.getHost())&&nombreObjetoRemoto.equals(d.getNombreObjetoRemoto())&&port==d.getPort();
    return iguales(this, d);
    }

    public static boolean iguales(DatosRemote a,DatosRemote b) throws Exception{
    return a.getHost().equals(b.getHost())&&a.getNombreObjetoRemoto().equals(b.getNombreObjetoRemoto())&&a.getPort()==b.getPort();
    }
}
