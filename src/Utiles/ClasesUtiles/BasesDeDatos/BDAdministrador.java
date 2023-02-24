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

/**
 *
 * @author Rene
 */
public class BDAdministrador<E> implements Administrador<E> {
   public static final String EXTENCION = ".bdad",EXTENCION_PARCIAL= "bdad";  
    private static final String COLUMNA_NOMBRE = "nombre", COLUMNA_DATO = "dato";

    private Class tipo;
    private String nombreTabla;
    private Creador<BDConexion> conexion;

    private SubAdministrador sub;

    public BDAdministrador(Class tipo, String nombreTabla) throws Exception {
        final File f = BD.crearDBEstadoActualSiNoExiste();
        inicializar(tipo, nombreTabla, () -> BDConexion.getConexionSQL_LITE(f), null);
    }

    public BDAdministrador(Class tipo, String nombreTabla, Creador<BDConexion> conexion) throws Exception {
        inicializar(tipo, nombreTabla, conexion, null);
    }

    public BDAdministrador(Class tipo, String nombreTabla, SubAdministrador<E> sub, Creador<BDConexion> conexion) throws Exception {
        inicializar(tipo, nombreTabla, conexion, sub);
    }

    public void inicializar(Class tipo, String nombreTabla, Creador<BDConexion> conexion, SubAdministrador<E> sub) throws Exception {
        this.tipo = tipo;
        this.nombreTabla = nombreTabla;
        this.conexion = conexion;
        iniSub(sub);
        this.sub.crearTablaSiNoExiste();
    }

    private void iniSub(SubAdministrador<E> sub) {
        if (sub != null) {
            this.sub = sub;
            return;
        }
//        System.out.println("tipo="+tipo);
        if (tipo.equals(File.class)) {
            this.sub = new SubFile();
            return;
        }
        if (tipo.equals(File[].class)) {
            this.sub = new SubArregloFile();
            return;
        }
        if (tipo.equals(String.class)) {
            this.sub = new SubString();
            return;
        }
        if (tipo.equals(String[].class)) {
            this.sub = new SubArregloString();
            return;
        }
    }

    private BDConexion getDB() {
        return conexion.crear();
    }

//    private void crearTablaSiNoExiste() throws Exception {
//        getDB().crearTablaSiNoExiste(nombreTabla, COLUMNA_NOMBRE, COLUMNA_DATO, TipoDeDatoSQL.BLOB);
//    }
    @Override
    public String[] getNombres() throws Exception {
        return getDB().select_Distinct_Columna_Str(nombreTabla, COLUMNA_NOMBRE);
//        return getDB().select_Columna_Str(nombreTabla, COLUMNA_NOMBRE);
    }

    @Override
    public E getInformacion(String nombre) throws Exception {
//        System.out.println("nombre="+nombre);
//        Object o=getDB().<E>select_Where_FirstResult(nombreTabla, COLUMNA_DATO, COLUMNA_NOMBRE, nombre);
//        System.out.println("o="+o+" "+o.getClass());
//        E e=(E)o;
//        System.out.println("casteo");
//        return e;
        return (E) sub.getInformacion(nombre);
    }

    @Override
    public void eliminarInformacion(String nombre) throws Exception {
        // getDB().delete(nombreTabla, COLUMNA_NOMBRE, nombre);
        sub.eliminarInformacion(nombre);
    }

    @Override
    public void canviarInformacion(String nombre, E informacion) throws Exception {
        //getDB().update(nombreTabla, COLUMNA_DATO, informacion, COLUMNA_NOMBRE, nombre);
        sub.canviarInformacion(nombre, informacion);
    }

    @Override
    public void agregarInformacion(String nombre, E informacion) throws Exception {
        //  getDB().insertar(nombreTabla, nombre, informacion);
        if(existe(nombre)){
            eliminarInformacion(nombre);
        }
        sub.agregarInformacion(nombre, informacion);
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
        sub.canviarNombreExtra(nombre, nuevoNombre);
    }

    @Override
    public boolean existe(String nombre) throws Exception {
        return getDB().contiene(nombreTabla, COLUMNA_NOMBRE, nombre);
    }

    private abstract class SubAdministrador<T> {

        public abstract void crearTablaSiNoExiste() throws Exception;

        public abstract T getInformacion(String nombre) throws Exception;

        public abstract void eliminarInformacion(String nombre) throws Exception;

        public void canviarInformacion(String nombre, T informacion) throws Exception {
            eliminarInformacion(nombre);
            agregarInformacion(nombre, informacion);
        }

        public abstract void agregarInformacion(String nombre, T informacion) throws Exception;

        public void canviarNombreExtra(String nombre, String nuevoNombre) throws Exception {
            System.out.println("no hay modificaciones extras al nombre");
        }

        public BDConexion getDBConect() {
            return getDB();
        }
    }

    private abstract class SubUnaTabla<T> extends SubAdministrador<T> {

        @Override
        public void crearTablaSiNoExiste() throws Exception {
            getDB().crearTablaSiNoExiste(nombreTabla, COLUMNA_NOMBRE, COLUMNA_DATO, TipoDeDatoSQL.BLOB);
        }

        @Override
        public void eliminarInformacion(String nombre) throws Exception {
            getDB().delete(nombreTabla, COLUMNA_NOMBRE, nombre);
        }

    }

    private abstract class SubSimple<T> extends SubUnaTabla<T> {

        @Override
        public void canviarInformacion(String nombre, T informacion) throws Exception {
            getDB().update(nombreTabla, COLUMNA_DATO, informacion, COLUMNA_NOMBRE, nombre);
        }

        @Override
        public void agregarInformacion(String nombre, T informacion) throws Exception {
            getDB().insertar(nombreTabla, nombre, informacion);
        }

    }

    private abstract class SubArreglo<T> extends SubUnaTabla<T> {

        @Override
        public void agregarInformacion(String nombre, T informacion) throws Exception {
            Object[] O = (Object[]) informacion;
            for (int i = 0; i < O.length; i++) {
                getDB().insertar(nombreTabla, nombre, O[i]);
            }
        }

    }

    private class SubFile extends SubSimple<File> {

        @Override
        public File getInformacion(String nombre) throws Exception {
            Object o = getDB().select_Where_FirstResult(nombreTabla, COLUMNA_DATO, COLUMNA_NOMBRE, nombre);
            return o != null ? new File(o.toString()) : null;
        }

    }

    private class SubString extends SubSimple<String> {

        @Override
        public String getInformacion(String nombre) throws Exception {
            return getDB().select_Where_FirstResult(nombreTabla, COLUMNA_DATO, COLUMNA_NOMBRE, nombre) + "";

        }

    }

    private class SubArregloFile<E extends File> extends SubArreglo<File[]> {

        @Override
        public File[] getInformacion(String nombre) throws Exception {
            Object O[][] = getDB().select_Where(nombreTabla, COLUMNA_DATO, COLUMNA_NOMBRE, nombre);
            File res[] = new File[O.length];
            for (int i = 0; i < 10; i++) {
                res[i] = new File(O[i][0].toString());
            }
            return res;
        }

    }

    private class SubArregloString<E extends String> extends SubArreglo<String[]> {

        @Override
        public String[] getInformacion(String nombre) throws Exception {
            Object O[][] = getDB().select_Where(nombreTabla, COLUMNA_DATO, COLUMNA_NOMBRE, nombre);
            String res[] = new String[O.length];
            for (int i = 0; i < 10; i++) {
                res[i] = O[i][0].toString();
            }
            return res;
        }

    }

}
