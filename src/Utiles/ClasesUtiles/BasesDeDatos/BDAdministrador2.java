/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utiles.ClasesUtiles.BasesDeDatos;

import Utiles.ClasesUtiles.Admininistrador.Administrador;
import Utiles.ClasesUtiles.Interfases.Funcionales.Creador;
import Utiles.MetodosUtiles.BD;
import java.io.File;
import javafx.util.Callback;

/**
 *
 * @author Rene
 */
public class BDAdministrador2//{}
        <E> implements Administrador<E> {

    private static final String COLUMNA_NOMBRE = "nombre", COLUMNA_DATO = "dato";

    private Creador<BDConexion> conexion;
    private String nombreTabla;

    public BDAdministrador2(String nombreTabla) throws Exception {
        final File f = BD.crearDBEstadoActualSiNoExiste();
        inicializar(nombreTabla, () -> BDConexion.getConexionSQL_LITE(f));
    }

    public BDAdministrador2(String nombreTabla, Creador<BDConexion> conexion)throws Exception {
        inicializar(nombreTabla, conexion);
    }

    public void inicializar(String nombreTabla, Creador<BDConexion> conexion) throws Exception {
        this.conexion = conexion;
        this.nombreTabla = nombreTabla;
        crearTablaSiNoExiste();
    }

    private BDConexion getDB() {
        return conexion.crear();
    }

    private void crearTablaSiNoExiste() throws Exception {
        getDB().crearTablaSiNoExiste(nombreTabla, COLUMNA_NOMBRE, TipoDeClasificacionSQL.UNIQUE, COLUMNA_DATO, TipoDeDatoSQL.BLOB);
    }

    @Override
    public String[] getNombres() throws Exception {
//        Object[][] sal = getDB().select(nombreTabla, COLUMNA_NOMBRE);
//        String nombres[] = new String[sal.length];
//        for (int i = 0; i < sal.length; i++) {
//            nombres[i] = sal[0].toString();
//        }

        return getDB().select_Columna_Str(nombreTabla, COLUMNA_NOMBRE);
    }

    @Override
    public E getInformacion(String nombre) throws Exception {
        System.out.println("nombre="+nombre);
        Object o=getDB().<E>select_Where_FirstResult(nombreTabla, COLUMNA_DATO, COLUMNA_NOMBRE, nombre);
        System.out.println("o="+o+" "+o.getClass());
        E e=(E)o;
        System.out.println("casteo");
        return e;
    }

    @Override
    public void eliminarInformacion(String nombre) throws Exception {
        getDB().delete(nombreTabla, COLUMNA_NOMBRE, nombre);
    }

    @Override
    public void canviarInformacion(String nombre, E informacion) throws Exception {
        getDB().update(nombreTabla, COLUMNA_DATO, informacion, COLUMNA_NOMBRE, nombre);
    }

    @Override
    public void agregarInformacion(String nombre, E informacion) throws Exception {
        getDB().insertar(nombreTabla, nombre, informacion);
    }

    @Override
    public boolean isEmpty() throws Exception {
        return getDB().isEmpty(nombreTabla, COLUMNA_NOMBRE);
    }

    @Override
    public boolean contieneNombre(String nombre) throws Exception {
        return getDB().contiene(nombreTabla, COLUMNA_NOMBRE, nombre);
    }

    @Override
    public void canviarNombre(String nombre, String nuevoNombre) throws Exception {
        getDB().update(nombreTabla, COLUMNA_NOMBRE, nuevoNombre, COLUMNA_NOMBRE, nombre);
    }

    @Override
    public boolean existe(String nombre) throws Exception {
        return getDB().contiene(nombreTabla, COLUMNA_NOMBRE, nombre);
    }

}
