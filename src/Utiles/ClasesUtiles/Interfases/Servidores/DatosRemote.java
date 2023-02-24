/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.Interfases.Servidores;

import java.rmi.Remote;

/**
 *
 * @author Rene
 */
public interface DatosRemote extends Remote{
    public String getHost() throws Exception;
    public int getPort()throws Exception;
    public String getNombreObjetoRemoto()throws Exception;
    public boolean estaConectado()throws Exception;
}