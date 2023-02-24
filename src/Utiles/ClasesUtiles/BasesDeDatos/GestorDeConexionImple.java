package Utiles.ClasesUtiles.BasesDeDatos;
import Utiles.ClasesUtiles.BasesDeDatos.DatosBDConect;
import Utiles.ClasesUtiles.Interfases.BD.GestorDeConexion;

/**
 * Created by Rene on 07/01/2021.
 */

public abstract class GestorDeConexionImple implements GestorDeConexion {
    private DatosBDConect datosBDConect;

    public GestorDeConexionImple(DatosBDConect datosBDConect) {
        this.datosBDConect = datosBDConect;
    }

    public DatosBDConect getDatosBDConect() {
        return datosBDConect;
    }

    public void setDatosBDConect(DatosBDConect datosBDConect) {
        this.datosBDConect = datosBDConect;
    }
}
