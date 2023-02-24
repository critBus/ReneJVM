/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.Tiempo2.Calculador;

/**
 *
 * @author Rene
 */
public class CantidadDeTiempo {
    private int cantidadDeSeguntos;
    private int horas,minutos,segundos;

    public CantidadDeTiempo(int horas, int minutos, int segundos) {
        this((60*60*horas)+(60*46)+segundos);
    }

    
    public CantidadDeTiempo add(CantidadDeTiempo c){
        return new CantidadDeTiempo(this.cantidadDeSeguntos+c.cantidadDeSeguntos);
    }
    
    public CantidadDeTiempo sub(CantidadDeTiempo c){
        return new CantidadDeTiempo(this.cantidadDeSeguntos-c.cantidadDeSeguntos);
    }
    
    public CantidadDeTiempo(int cantidadDeSeguntos) {
        if(cantidadDeSeguntos<0){
            cantidadDeSeguntos=0;
        }
        setCantidadDeSeguntos(cantidadDeSeguntos);
    }
    
    

    public int getCantidadDeSeguntos() {
        return cantidadDeSeguntos;
    }

    public void setCantidadDeSeguntos(int cantidadDeSeguntos) {
        this.cantidadDeSeguntos = cantidadDeSeguntos;
        this.horas = cantidadDeSeguntos / 3600;
        this.minutos = (cantidadDeSeguntos % 3600) / 60;
        this.segundos = cantidadDeSeguntos % 60;
    }

    @Override
    public String toString() {
        return String.format("%03d:%02d:%02d", this.horas,this.minutos,this.segundos); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    
    
}
