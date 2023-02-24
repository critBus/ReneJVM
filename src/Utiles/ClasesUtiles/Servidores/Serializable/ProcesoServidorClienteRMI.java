/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.Servidores.Serializable;

import Utiles.ClasesUtiles.Interfases.Funcionales.Creador;
import Utiles.ClasesUtiles.Interfases.Funcionales.CreadorConException;
import Utiles.ClasesUtiles.Interfases.Servidores.ObjetoRemoteServidor;
import Utiles.ClasesUtiles.Servidores.ProcesoCliente;
import Utiles.MetodosUtiles.ServidorUtil;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Rene
 */
public class ProcesoServidorClienteRMI<A extends ObjetoRemoteClienteImp, B extends ObjetoRemoteServidor> {

    private ProcesoCliente<B> procesoCliente;
    private ProcesoServidorRMI<A> procesoServidorDelCliente;

    private CreadorConException<A> creadorDeServidor;
    private Class interfasDeComunicacion;
    private int numeroRegistro;
    private String nombreDelRegistro;
    private String hostServidor;
    private int numeroRegistroServidor;
    private String nombreDelRegistroServidor;
    
    private B servidor;
    private A cliente;
    
    
    public ProcesoServidorClienteRMI(CreadorConException<A> creadorDeServidor, Class interfasDeComunicacion, int numeroRegistro, String nombreDelRegistro, String hostServidor, int numeroRegistroServidor, String nombreDelRegistroServidor) throws Exception {
        this.creadorDeServidor = creadorDeServidor;
        this.interfasDeComunicacion = interfasDeComunicacion;
        this.numeroRegistro = numeroRegistro;
        this.nombreDelRegistro = nombreDelRegistro;
        this.hostServidor = hostServidor;
        this.numeroRegistroServidor= numeroRegistroServidor;
        this.nombreDelRegistroServidor = nombreDelRegistroServidor;
        star();
    }
    

//    public ProcesoServidorClienteRMI(Creador<A> creadorDeServidor, Class interfasDeComunicacion, int numeroRegistro, String nombreDelRegistro, String hostCliente, int numeroRegistroCliente, String nombreDelRegistroCliente) throws RemoteException, NotBoundException {
//        
//        
//    }

    public void star() throws  Exception{
    procesoCliente = new ProcesoCliente<B>(hostServidor, numeroRegistroServidor, nombreDelRegistroServidor);
    procesoServidorDelCliente = new ProcesoServidorRMI<A>(creadorDeServidor, interfasDeComunicacion, numeroRegistro, nombreDelRegistro);
    servidor=procesoCliente.getServidor();
    servidor.addCliente(ServidorUtil.getHostNameLocal(), numeroRegistro, nombreDelRegistro);
    
    cliente= procesoServidorDelCliente.getServidor();
    }
    
    public void stop() throws Exception{
    servidor.removeCliente(ServidorUtil.getHostNameLocal(), numeroRegistro, nombreDelRegistro);
    procesoServidorDelCliente.stop();
    }

    public CreadorConException<A> getCreadorDeServidor() {
        return creadorDeServidor;
    }

    public void setCreadorDeServidor(CreadorConException<A> creadorDeServidor) {
        this.creadorDeServidor = creadorDeServidor;
    }

   

    public Class getInterfasDeComunicacion() {
        return interfasDeComunicacion;
    }

    public void setInterfasDeComunicacion(Class interfasDeComunicacion) {
        this.interfasDeComunicacion = interfasDeComunicacion;
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

    

    public B getServidor() {
        return servidor;
    }

    public void setServidor(B servidor) {
        this.servidor = servidor;
    }

    public String getHostServidor() {
        return hostServidor;
    }

    public void setHostServidor(String hostServidor) {
        this.hostServidor = hostServidor;
    }

    public int getNumeroRegistroServidor() {
        return numeroRegistroServidor;
    }

    public void setNumeroRegistroServidor(int numeroRegistroServidor) {
        this.numeroRegistroServidor = numeroRegistroServidor;
    }

    public String getNombreDelRegistroServidor() {
        return nombreDelRegistroServidor;
    }

    public void setNombreDelRegistroServidor(String nombreDelRegistroServidor) {
        this.nombreDelRegistroServidor = nombreDelRegistroServidor;
    }

    public A getCliente() {
        return cliente;
    }

    public void setCliente(A cliente) {
        this.cliente = cliente;
    }
    
    
}
