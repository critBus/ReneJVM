/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.Interfases.Servidores;

/**
 *
 * @author Rene
 */
public interface ObjetoRemoteServidor extends DatosRemote{
    public void addCliente(String host, int port, String nombreObjetoRemoto) throws Exception;
    public void removeCliente(String host, int port, String nombreObjetoRemoto) throws Exception;
}
