/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.Servidores.Serializable;

import Utiles.ClasesUtiles.Interfases.Funcionales.Creador2;
import Utiles.ClasesUtiles.Interfases.Funcionales.Creador2ConException;
import Utiles.ClasesUtiles.Interfases.Funcionales.Utilizar2;
import Utiles.ClasesUtiles.Interfases.Funcionales.Utilizar2Exception;
import Utiles.ClasesUtiles.Interfases.Servidores.DatosRemote;
import Utiles.ClasesUtiles.Interfases.Servidores.ObjetoRemoteServidor;
import Utiles.ClasesUtiles.Servidores.ProcesoCliente;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.LinkedList;

/**
 *
 * @author Rene
 */
public class ObjetoRemoteServidorImp<E extends DatosRemote> extends ObjetoRemoteClienteImp implements ObjetoRemoteServidor {
//    private String host,nombreObjetoRemoto;
//    private int port;
//    private boolean conectado;

    private LinkedList<E> clientes;//= new LinkedList<>()

    public ObjetoRemoteServidorImp(String host, int port, String nombreObjetoRemoto) throws RemoteException {
        super(host, port, nombreObjetoRemoto);
        clientes = new LinkedList<>();
//        this.host = host;
//        this.nombreObjetoRemoto = nombreObjetoRemoto;
//        this.port = port;
//        conectado=true;
    }

    public void removeCliente(String host, int port, String nombreObjetoRemoto) throws Exception{
    recorrerClientesYremoveDesconectadosBol((v, i) -> {
            if (host.equals(v.getHost())&&nombreObjetoRemoto.equals(v.getNombreObjetoRemoto())&&port==v.getPort()) {
                clientes.remove(i);
                return false;
            }
            return true;
        });
    } 
    
    public void addCliente(String host, int port, String nombreObjetoRemoto) throws Exception {
        System.out.println("addCliente " + host + " " + nombreObjetoRemoto + " " + port);
        E cliente = new ProcesoCliente<E>(host, port, nombreObjetoRemoto).getServidor();
        final boolean existe[] = new boolean[1];
        existe[0] = false;

        recorrerClientesYremoveDesconectadosBol((v, i) -> {
            if (iguales(cliente, v)) {
                existe[0] = true;
            }
            return !existe[0];
        });
        System.out.println("existe[0]="+existe[0]);
        if(!existe[0]){
            
        clientes.add(cliente);
        System.out.println("add cliente clientes.size()="+clientes.size());
        } else{
            System.out.println(" no se add");
        }
        

    }

    public void recorrerClientesYremoveDesconectadosBol(Creador2ConException<E, Integer, Boolean> u) throws Exception {
        boolean seguir = true;
        System.out.println("recorriendo clientes.size()="+clientes.size());
        for (int i = 0; i < clientes.size() && seguir; i++) {
            System.out.println("lla i=" + i);
            E d = removeSiEstaDesconectado(i);
            if (d == null) {
                i--;
                continue;
            }
            if (u != null) {
                seguir = u.crear(d, i);
            }
        }
    }

    public void recorrerClientesYremoveDesconectados(Utilizar2Exception<E, Integer> u) throws Exception {
        recorrerClientesYremoveDesconectadosBol((v, i) -> {
            if (u != null) {
                u.utilizar(v, i);
            }
            return true;
        });
//        for (int i = 0; i < clientes.size(); i++) {
//            System.out.println("lla i=" + i);
//            E d = removeSiEstaDesconectado(i);
//            if (d == null) {
//                i--;
//                continue;
//            }
//            if (u != null) {
//                u.utilizar(d, i);
//            }
//        }
    }

    public E removeSiEstaDesconectado(int i) {

        try {
            if (clientes.get(i).estaConectado()) {
                return clientes.get(i);
            }
        } catch (Exception ex) {
            System.out.println("desconectado");
        }
        clientes.remove(i);
        return null;
    }

    public LinkedList<E> getClientes() throws Exception {
        recorrerClientesYremoveDesconectados(null);
        return clientes;
    }
//
//    public String getHost() {
//        return host;
//    }
//
//    public void setHost(String host) {
//        this.host = host;
//    }
//
//    public String getNombreObjetoRemoto() {
//        return nombreObjetoRemoto;
//    }
//
//    public void setNombreObjetoRemoto(String nombreObjetoRemoto) {
//        this.nombreObjetoRemoto = nombreObjetoRemoto;
//    }
//
//    public int getPort() {
//        return port;
//    }
//
//    public void setPort(int port) {
//        this.port = port;
//    }
//
//    public void setConectado(boolean conectado) {
//        this.conectado = conectado;
//    }
//    
//
//    @Override
//    public boolean estaConectado() throws Exception {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
