/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import Utiles.ClasesUtiles.BasesDeDatos.BDConexion;
//import Utiles.ClasesUtiles.BasesDeDatos.BDConexionController;
import Utiles.ClasesUtiles.BasesDeDatos.BDTipoDeConexion;
import Utiles.ClasesUtiles.BasesDeDatos.TipoDeDatoSQL;
import Utiles.ClasesUtiles.BasesDeDatos.TipoDeOrdenamientoSQL;
import Utiles.ClasesUtiles.EducacionFisica.EducacionFisicaUtiles;
import Utiles.ClasesUtiles.Interfases.Funcionales.Creador;
import Utiles.ClasesUtiles.Servidores.ProcesoServidor;
import Utiles.MetodosUtiles.Archivo;
import Utiles.MetodosUtiles.MetodosUtiles;
import Utiles.MetodosUtiles.Operaciones;
import Utiles.MetodosUtiles.Tempus;
import static Utiles.PW.UtilesHTLM.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.Callback;

//import Utiles.ClasesUtiles.Servidores.Referencia.*;
import Utiles.MetodosUtiles.Arreglos;
import Utiles.MetodosUtiles.BD;
import Utiles.MetodosUtiles.SQLUtil;
import Utiles.MetodosUtiles.ServidorUtil;
import static Utiles.MetodosUtiles.Tempus.tiMin;
import Utiles.MetodosUtiles.Videos;
import Utiles.PW.UtilesHTLM;
import java.rmi.ConnectException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalTime;
import java.time.Period;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;
//import Utiles.MetodosUtiles.SQLUtil;
//import com.oracle.webservices.internal.impl.encoding.StreamDecoderImpl;
//import com.sun.corba.se.impl.encoding.EncapsInputStream;
//import com.sun.corba.se.impl.io.IIOPInputStream;
//import com.sun.corba.se.impl.io.IIOPOutputStream;
//import com.sun.corba.se.spi.encoding.CorbaInputObject;
//import com.sun.javafx.webkit.UtilitiesImpl;
//import com.sun.org.apache.xml.internal.serializer.SerializerBase;
//import com.sun.webkit.Utilities;
//import com.sun.xml.internal.fastinfoset.algorithm.HexadecimalEncodingAlgorithm;
//import com.sun.xml.internal.messaging.saaj.packaging.mime.util.BASE64DecoderStream;
//import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QDecoderStream;
//import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QPDecoderStream;
//import com.sun.xml.internal.messaging.saaj.packaging.mime.util.UUDecoderStream;
//import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
//import com.sun.xml.internal.stream.buffer.stax.StreamReaderBufferCreator;
//import com.sun.xml.internal.ws.api.server.InstanceResolver;
//import com.sun.xml.internal.ws.message.stream.StreamHeader12;
//import com.sun.xml.internal.ws.server.SingletonResolver;
//import com.sun.xml.internal.ws.util.ReadAllStream;
//import java.io.ByteArrayInputStream;
//import java.io.DataInputStream;
//import java.io.FilterInputStream;
//import java.io.InputStream;
//import java.io.ObjectOutputStream;
//import java.sql.SQLException;
//import java.util.stream.Stream;
//import java.util.zip.CheckedInputStream;
//import java.util.zip.InflaterInputStream;
//import java.util.zip.ZipInputStream;
//import javax.print.StreamPrintService;
//import javax.rmi.CORBA.Util;
//import javax.sql.rowset.serial.SerialBlob;
//import javax.sql.rowset.serial.SerialException;
//import javax.sql.rowset.serial.SerialJavaObject;
//import javax.sql.rowset.serial.SerialRef;
//import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
//import javax.xml.stream.util.StreamReaderDelegate;
//import javax.xml.transform.stream.StreamResult;
//import org.postgresql.core.Utils;
//import org.postgresql.core.VisibleBufferedInputStream;
//import org.postgresql.fastpath.Fastpath;
//import org.postgresql.largeobject.BlobInputStream;
//import org.postgresql.largeobject.LargeObject;
//import org.postgresql.largeobject.LargeObjectManager;
//import sun.awt.datatransfer.DataTransferer;
//import sun.net.TelnetInputStream;
//import sun.net.www.http.ChunkedInputStream;
//import sun.print.PSStreamPrintService;
//import sun.rmi.server.MarshalInputStream;
//import sun.security.jca.GetInstance;
//import sun.security.ssl.HandshakeInStream;
//import java.sql.B
//import Prueba.ComunicacionP.IDeComunicacion;
import Utiles.ClasesUtiles.Tiempo2.Calculador.CantidadDeTiempo;
import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Rene
 */
public class provar {
//Utils.encodeUTF8("") org.postgres.core
    //Utils.toHexString("")

    //org.jcp.xml.dsig.internal.dom.Utils.readBytesFromStream(in)
    //public static String USERS = "users", EDAD = "edad", NOMBRE = "nombre", IDENTIFICACION = "identificacion", USERNAME = "username", CONTRASEÑA = "password", PERMISOS = "permisos";
    static class Usuario {

        public String id;
        public String nombre;

    }

    public static void main(String[] args) throws Exception {
        //String i = "5";
        //String j = "6";
        System.out.println(String.format("%.2f", 123.456));
       
        
        //p1();
        //provar4();
    }

    public static void p1() throws Exception {
        class Usuario {

            public String nombre, username;
            public int edad, idkey;

            public Usuario init(Object O[]) {
                this.idkey =(int) O[0];
                this.nombre = O[1] + "";
                this.username = O[2] + "";
                this.edad = (int) O[3];
                return this;
            }
        }
        class Informacion {

            public int idUsuario, idkey;
            public String idTelegram, email;
            public Informacion init(Object O[]) {
                this.idkey =(int) O[0];
                this.idUsuario = (int) O[1];
                this.idTelegram = O[2] + "";
                this.email =  O[3] + "";
                return this;
            }
        }

        String tu = "TABLA_USUARIO", cn = "COLUMNA_NOMBRE", cu = "COLUMNA_USERNAME", cedad = "COLUMNA_EDAD";
        String ti = "TABLA_INFO", ciu = "COLUMNA_ID_USUARIO", cidt = "COLUMNA_ID_TELEGRAM", cemail = "COLUMNA_EMAIL";

        BDConexion bd = BDConexion.getConexionSQL_LITE("nuevabd.sqlite");
//        bd.crearTablaYBorrarSiExiste(tu, cn, 50, cu, 50, cedad, TipoDeDatoSQL.INTEGER);
//        bd.insertar(tu, "Alberto", "albr", 15);
//        bd.insertar(tu, "Juan", "juan", 15);
//        bd.insertar(tu, "Pedro", "pedro", 20);
//        
//        Usuario u1=new Usuario().init(bd.select_Where_FirstRow(tu,cn,"Alberto"));
//        Usuario u2=new Usuario().init(bd.select_Where_FirstRow(tu,cn,"Juan"));
//        Usuario u3=new Usuario().init(bd.select_Where_FirstRow(tu,cn,"Pedro"));
//                
//
//        byte[] A;
//        bd.csl();
//
//        bd.select_Where(tu, cedad, 15);
//
//        bd.crearTablaYBorrarSiExiste(ti, ciu, cidt, cemail);
//        bd.insertar(ti,u1.idkey,"123","correo" );
//        bd.insertar(ti,u2.idkey,"124","correo" );
//        bd.insertar(ti,u3.idkey,"125","correo3" );
        
//        bd.select_Where_ORDER_BY(ti, new Object[]{cemail,"correo"},ciu);
//        System.out.println("Paso!!");
        
//        bd.select_Where_Inner_Join_TodoDeTabla(tu, new Object[]{
//            new Object[]{ new Object[]{tu}, new Object[]{ti,ciu} }
//        },new Object[]{ti,cemail},"correo"); 
        
//        bd.select_Where_Inner_Join_ORDER_BY_TodoDeTabla(tu, new Object[]{
//            new Object[]{ new Object[]{tu}, new Object[]{ti,ciu} }
//        },new Object[]{
//            new Object[]{ti,cemail},"correo"
//        }, new Object[]{ti,ciu},TipoDeOrdenamientoSQL.DESC );

    
        System.out.println(bd.insertar(tu, "nu1", "u1", 20).id);

    }

    public static Time provar4() {
        Pattern PATRON_HORA_MINUTOS = Pattern.compile("^((?:1?[0-9])|(?:2[0-3]))(?:[:]([0-5][0-9]))?$");
        //String A[]=PATRON_HORA_MINUTOS.split("23:21");
        //System.out.println(PATRON_HORA_MINUTOS.toString());
//        String A[]="23:21".split("((?:1?[0-9])|(?:2[0-3]))(?:[:]([0-5][0-9]))?");
//        System.out.println("A.length="+A.length);
//        for (int i = 0; i < A.length; i++) {
//            System.out.println(A[i]);
//        }
        Matcher m = PATRON_HORA_MINUTOS.matcher("23:21");
        System.out.println("m.groupCount()=" + m.groupCount());
//        //if (m.groupCount() > 0) {
        if (m.find()) {

            //String a=m.find();
//            int horas = Integer.parseInt(m.group(0));
//            int minutos = 0;
//            if (m.groupCount() > 1) {
//                minutos = Integer.parseInt(m.group(1));
//            }
//            System.out.println(new Time(horas, minutos, 0));
//            return new Time(horas, minutos, 0);
            System.out.println(m.group(1));

            System.out.println(m.group(2));
        }
//        System.out.println(new Time(0, 0, 0));
        return new Time(0, 0, 0);
    }

    public static void ignorarNumeroSaltar() {
        String a[] = Videos.saltarDespues;
        //{new CondicionIgnorarNumero(true,"")};
        String r = "{";
        for (int i = 0; i < a.length; i++) {
            r += i != 0 ? "," : "";
            r += "new CondicionIgnorarNumero(true,\"";
            r += a[i] + "\")\n";
        }
        r += "};";
        System.out.println(r);
    }

    public static void ignorarNumeroSaltarAntes() {
        String a[][] = Videos.saltarAntesNumero;
        //{new CondicionIgnorarNumero(true,"")};
        String r = "{";
        for (int i = 0; i < a.length; i++) {
            r += i != 0 ? "," : "";
            for (int j = 0; j < a[i].length; j++) {
                r += "new CondicionIgnorarNumero(true,\"";
            }
        }
    }

    public static void arreglarTelefonos() {
        String en = "_Otro +53 5 4341674_\n"
                + "_Otro +53 5 5274751_\n"
                + "_Otro +53 5 4949446_\n"
                + "_Otro +53 5 4157370_\n"
                + "_Otro +53 5 4026689_\n"
                + "_Otro +53 5 8002317_\n"
                + "_Otro +53 5 3096127_\n"
                + "_Otro +53 5 6681744_\n"
                + "_Otro +53 5 8742844_\n"
                + "_Otro +53 5 9161224_\n"
                + "_Otro +53 5 9298350_\n"
                + "_Otro +53 5 8834187_\n"
                + "_Otro +53 5 8880436_\n"
                + "_Otro +53 5 2483088_\n"
                + "_Otro +53 5 6016885_\n"
                + "_Otro +53 5 6532171_\n"
                + "_Otro +53 5 9326087_\n"
                + "_Otro +53 5 9605335_\n"
                + "_Otro +53 5 8986526_\n"
                + "_Otro +5354341674_\n"
                + "_Otro +5358834187_\n"
                + "_Otro +5352483088_\n"
                + "_Otro +5354026689_\n"
                + "_Otro +5358880436_\n"
                + "_Otro +5354157370_\n"
                + "_Otro +5356681744_\n"
                + "_Otro +5356532171_\n"
                + "_Otro +5358742844_";

        MetodosUtiles.recorrerLineas(en, (v, i) -> {
            String telf = v.replace("Otro +", "").replace("_", "").replace(" ", "");
            System.out.println("\"" + telf + "\",");
        });
    }

    public static void arreglarXmlMql4() throws Exception {
        int cant = 8;

        String secciones[] = new String[cant];
        String seccionesArregladas[] = new String[cant];
        File direccion = new File("E:\\_Cosas\\Programacion\\Estudio\\MQL4\\Curso de forex\\arreglado\\1-Basico");
        secciones[0] = "<li><a href=\"file:///C:/Users/Sion/Desktop/Curso%20de%20forex/Basico/%C2%BFQu%C3%A9%20es%20Forex%20%20-%20Mundo-Forex.com.htm\">¿Qué es Forex?</a></li><li><a href=\"https://www.mundo-forex.com/como-se-gana-dinero-forex/\">¿Cómo se gana dinero en Forex?</a></li><li><a href=\"https://www.mundo-forex.com/que-son-pips-y-lotes/\">¿Qué son Pips y Lotes?</a></li><li><a href=\"https://www.mundo-forex.com/tipos-ordenes-forex/\">Tipos de Órdenes en Forex</a></li><li><a href=\"https://www.mundo-forex.com/elegir-broker-forex/\">Cómo elegir tu broker de Forex</a></li><li><a href=\"https://www.mundo-forex.com/abriendo-una-cuenta-forex/\">Abriendo una Cuenta de Forex</a></li><li><a href=\"https://www.mundo-forex.com/forex-vs-acciones/\">Forex Vs Acciones</a></li><li><a href=\"https://www.mundo-forex.com/forex-vs-futuros/\">Forex Vs Futuros</a></li><li><a href=\"https://www.mundo-forex.com/terminologia-basica-forex/\">Terminología Básica de Forex</a></li><li><a href=\"https://www.mundo-forex.com/precauciones-en-forex/\">Precauciones en Forex</a></li>";
        secciones[1] = "<li><a href=\"https://www.mundo-forex.com/tipos-analisis-forex/\">Tipos de Análisis en Forex</a></li><li><a href=\"https://www.mundo-forex.com/analisis-fundamental-forex/\">Análisis Fundamental en Forex</a></li><li><a href=\"https://www.mundo-forex.com/analisis-tecnico-forex/\">Análisis Técnico en Forex</a></li><li><a href=\"https://www.mundo-forex.com/tipos-de-graficos-forex/\">Tipos de Gráficos en Forex</a></li><li><a href=\"https://www.mundo-forex.com/resumen-analisis-graficos-forex/\">Resumen de Análisis y Gráficos en Forex</a></li>";
        secciones[2] = "<li><a href=\"https://www.mundo-forex.com/velas-japonesas/\">Velas Japonesas</a></li><li><a href=\"https://www.mundo-forex.com/cuerpos-y-sombras-de-las-velas-japonesas/\">Cuerpos y Sombras de las Velas Japonesas</a></li><li><a href=\"https://www.mundo-forex.com/patrones-basicos-velas-japonesas/\">Patrones Básicos de Velas Japonesas</a></li><li><a href=\"https://www.mundo-forex.com/patrones-cambio-tendencia/\">Patrones de Cambio de Tendencia</a></li><li><a href=\"https://www.mundo-forex.com/resumen-velas-japonesas/\">Resumen de Velas Japonesas</a></li>";
        secciones[3] = "<li><a href=\"https://www.mundo-forex.com/soportes-y-resistencias/\">Soportes y Resistencias</a></li><li><a href=\"https://www.mundo-forex.com/lineas-de-tendencia/\">Líneas de Tendencia</a></li><li><a href=\"https://www.mundo-forex.com/canales-en-forex/\">Canales</a></li><li><a href=\"https://www.mundo-forex.com/resumen-soportes-resistencias/\">Resumen de Soportes y Resistencias</a></li>";
        secciones[4] = "<li><a href=\"https://www.mundo-forex.com/niveles-de-fibonacci/\">Niveles de Fibonacci</a></li><li><a href=\"https://www.mundo-forex.com/retrocesos-fibonacci/\">Retrocesos de Fibonacci</a></li><li><a href=\"https://www.mundo-forex.com/extensiones-fibonacci/\">Extensiones de Fibonacci</a></li><li><a href=\"https://www.mundo-forex.com/resumen-niveles-fibonacci/\">Resumen de los Niveles de Fibonacci</a></li>";
        secciones[5] = "<li><a href=\"https://www.mundo-forex.com/media-movil-simple/\">Media Móvil Simple (SMA)</a></li><li><a href=\"https://www.mundo-forex.com/media-movil-exponencial/\">Media Móvil Exponencial (EMA)</a></li><li><a href=\"https://www.mundo-forex.com/sma-vs-ema/\">Medias Móviles Simples (SMA) Vs Medias Móviles Exponenciales (EMA)</a></li><li><a href=\"https://www.mundo-forex.com/resumen-medias-moviles/\">Resumen Medias Móviles</a></li>";
        secciones[6] = "<li><a href=\"https://www.mundo-forex.com/bandas-de-bollinger/\">Bandas de Bollinger</a></li><li><a href=\"https://www.mundo-forex.com/macd/\">MACD</a></li><li><a href=\"https://www.mundo-forex.com/sar-parabolico/\">SAR Parabólico</a></li><li><a href=\"https://www.mundo-forex.com/estocastico/\">Estocástico</a></li><li><a href=\"https://www.mundo-forex.com/indice-de-fuerza-relativa-rsi/\">RSI – Índice de Fuerza Relativa</a></li><li><a href=\"https://www.mundo-forex.com/combinando-indicadores-tecnicos/\">Combinando Indicadores Técnicos</a></li><li><a href=\"https://www.mundo-forex.com/resumen-indicadores-comunes/\">Resumen Indicadores Comunes</a></li>";
        secciones[7] = "<li><a href=\"https://www.mundo-forex.com/indicadores-adelantados-vs-indicadores-retrasados/\">Indicadores Adelantados Vs Indicadores Retrasados</a></li><li><a href=\"https://www.mundo-forex.com/osciladores/\">Osciladores</a></li><li><a href=\"https://www.mundo-forex.com/indicadores-retrasados/\">Indicadores Retrasados</a></li><li><a href=\"https://www.mundo-forex.com/resumen-ociladores-e-indicadores/\">Resumen de Ociladores e Indicadores</a></li>";

        //File direccion = new File("E:\\_Cosas\\Programacion\\Estudio\\MQL4\\Curso de forex\\arreglado\\1-Basico");
//        File direccion = new File("E:\\_Cosas\\Programacion\\Estudio\\MQL4\\Curso de forex\\arreglado\\2");
//        secciones[0] = "<li><a href=\"https://www.mundo-forex.com/patrones-de-graficos/\">Patrones de Gráficos</a></li><li><a href=\"https://www.mundo-forex.com/triangulos-simetricos/\">Triángulos Simétricos</a></li><li><a href=\"https://www.mundo-forex.com/triangulos-ascendentes/\">Triángulos Ascendentes</a></li><li><a href=\"https://www.mundo-forex.com/triangulos-descendentes/\">Triángulos Descendentes</a></li><li><a href=\"https://www.mundo-forex.com/doble-techo/\">Doble Techo</a></li><li><a href=\"https://www.mundo-forex.com/doble-suelo/\">Doble Suelo</a></li><li><a href=\"https://www.mundo-forex.com/hombro-cabeza-hombro/\">Hombro Cabeza Hombro</a></li><li><a href=\"https://www.mundo-forex.com/hombro-cabeza-hombro-invertido/\">Hombro Cabeza Hombro Invertido</a></li><li><a href=\"https://www.mundo-forex.com/resumen-patrones-graficos/\">Resumen Patrones de Gráficos</a></li>";
//        secciones[1] = "<li><a href=\"https://www.mundo-forex.com/puntos-pivote/\">Puntos Pivote</a></li><li><a href=\"https://www.mundo-forex.com/calcular-los-puntos-pivote/\">¿Cómo calcular los Puntos Pivote?</a></li><li><a href=\"https://www.mundo-forex.com/operar-puntos-pivote/\">¿Cómo operar con puntos pivote?</a></li><li><a href=\"https://www.mundo-forex.com/consejos-operar-puntos-pivote/\">Consejos para Operar con Puntos Pivote</a></li><li><a href=\"https://www.mundo-forex.com/resumen-puntos-pivote/\">Resumen Puntos Pivote</a></li>";
//        secciones[2] = "<li><a href=\"https://www.mundo-forex.com/que-marco-de-tiempo-utilizar-al-operar-en-forex/\">¿Qué marco de tiempo utilizar al operar en Forex?</a></li><li><a href=\"https://www.mundo-forex.com/marcos-tiempo-forex/\">¿Qué marcos de tiempo hay en Forex?</a></li><li><a href=\"https://www.mundo-forex.com/marcos-tiempo-largos-o-cortos/\">¿Marcos de tiempo largos o cortos?</a></li><li><a href=\"https://www.mundo-forex.com/resumen-marcos-tiempo/\">Resumen Marcos de Tiempo</a></li>";
//        secciones[3] = "<li><a href=\"https://www.mundo-forex.com/teoria-de-las-ondas-de-elliot/\">Teoría de las Ondas de Elliot</a></li><li><a href=\"https://www.mundo-forex.com/ondas-de-correccion-abc/\">Ondas de Corrección ABC</a></li><li><a href=\"https://www.mundo-forex.com/resumen-ondas-elliot/\">Resumen Ondas de Elliot</a></li>";
//        File direccion = new File("E:\\_Cosas\\Programacion\\Estudio\\MQL4\\Curso de forex\\arreglado\\3");
//        secciones[0] = "<li><a href=\"https://www.mundo-forex.com/buscando-un-sistema-de-trading-para-forex/\">Buscando un Sistema de Trading para Forex</a></li><li><a href=\"https://www.mundo-forex.com/6-pasos-crear-sistema-de-trading-forex/\">6 Pasos para Crear tu propio Sistema de Trading en Forex</a></li><li><a href=\"https://www.mundo-forex.com/ejemplo-sistema-de-trading-ridiculamente-sencillo/\">Ejemplo de un Sistema de Trading ridículamente sencillo</a></li><li><a href=\"https://www.mundo-forex.com/resumen-sistemas-trading/\">Resumen Sistemas de Trading</a></li>";
//        secciones[1] = "<li><a href=\"https://www.mundo-forex.com/horario-del-mercado-forex/\">Horario del Mercado Forex</a></li><li><a href=\"https://www.mundo-forex.com/mejores-dias-para-trading-forex/\">Mejores Días para hacer Trading en Forex</a></li><li><a href=\"https://www.mundo-forex.com/cuando-hacer-trading-si-quieres-perder-dinero/\">Cuándo hacer trading si quieres perder dinero</a></li><li><a href=\"https://www.mundo-forex.com/si-no-puedes-trading-las-horas-con-mas-movimiento/\">¿Y si no puedes hacer trading en las horas con más movimiento?</a></li><li><a href=\"https://www.mundo-forex.com/resumen-horario-forex/\">Resumen Horario Forex</a></li>";
//        secciones[2] = "<li><a href=\"https://www.mundo-forex.com/gestion-del-dinero-forex/\">Gestión del Dinero en Forex</a></li><li><a href=\"https://www.mundo-forex.com/controlar-las-perdidas-forex/\">Controlar las pérdidas en Forex</a></li><li><a href=\"https://www.mundo-forex.com/no-pierdas-todo-tu-dinero-en-forex/\">No pierdas todo tu dinero en Forex</a></li><li><a href=\"https://www.mundo-forex.com/relacion-riesgo-recompensa-forex/\">Relación Riesgo / Recompensa en Forex</a></li><li><a href=\"https://www.mundo-forex.com/resumen-gestion-del-dinero/\">Resumen Gestión del Dinero</a></li>";
//        secciones[3] = "<li><a href=\"https://www.mundo-forex.com/por-que-es-importante-un-plan-de-operaciones-forex/\">¿Por qué es importante tener un Plan de Operaciones en Forex?</a></li><li><a href=\"https://www.mundo-forex.com/que-debe-tener-tu-plan-de-operaciones-en-forex/\">¿Qué debe tener tu Plan de Operaciones en Forex?</a></li><li><a href=\"https://www.mundo-forex.com/resumen-plan-operaciones/\">Resumen Plan de Operaciones</a></li>";
//        
//        File direccion = new File("E:\\_Cosas\\Programacion\\Estudio\\MQL4\\Curso de forex\\arreglado\\4");
//        secciones[0] = "<li><a href=\"https://www.mundo-forex.com/estrategia-cruce-medias-moviles-exponenciales-emas/\">Estrategia Básica Forex #1 – Cruce de Medias Móviles Exponenciales (EMAs)</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-cruce-de-medias-moviles-simples-smas/\">Estrategia Básica Forex #2 – Cruce de Medias Móviles Simples (SMAs)</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-estocastico-alto-bajo/\">Estrategia Básica Forex #3 – Estocástico Alto-Bajo</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-rsi-alto-bajo/\">Estrategia Básica Forex #4 – RSI Alto-Bajo</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-cruce-lineas-estocasticas/\">Estrategia Básica Forex #5 – Cruce de Líneas Estocásticas</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-estocastico-doble/\">Estrategia Básica Forex #6 – Estocástico Doble</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-cruce-macd-simple/\">Estrategia Básica Forex #7 – Cruce MACD Simple</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-corte-ema/\">Estrategia Básica Forex #8 – Corte de EMA</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-tunel-linea-tendencia/\">Estrategia Básica Forex #9 – Túnel de Línea de Tendencia</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-banda-bollinger-h4/\">Estrategia Básica Forex #10 – Banda Bollinger H4</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-breakout-gbpusd/\">Estrategia Básica Forex #11 – Breakout GBP/USD</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-3-soldados-blancos-3-cuervos-negros/\">Estrategia Básica Forex #12 – 3 Soldados Blancos / 3 Cuervos Negros</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-del-guru-del-fractal/\">Estrategia Básica Forex #13 – La estrategia del Gurú del Fractal</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-poder-adx/\">Estrategia Básica Forex #14 – Poder ADX</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-operacion-simple-linea-tendencia/\">Estrategia Básica Forex #15 – Operación Simple de Línea de Tendencia</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-altos-bajos-bandas-de-bollinger/\">Estrategia Básica Forex #16 – Altos y Bajos en Bandas de Bollinger</a></li><li><a href=\"https://www.mundo-forex.com/estrategia-sistema-balanceado-simple/\">Estrategia Básica Forex #17 – Sistema Balanceado Simple</a></li><li><a href=\"https://www.mundo-forex.com/10-estrategias-basicas-en-forex/\">10 Estrategias Básicas en Forex</a></li>";
        LinkedList<String> nombrePW = new LinkedList<>();

        for (int j = 0; j < secciones.length; j++) {
            String text = secciones[j];

            LinkedList<String> lt1 = new LinkedList<>();
            String lis[] = text.split("<li>");
            for (int i = 1; i < lis.length; i++) {
                String li = lis[i], href = MetodosUtiles.getStringEntre(li, "\""), textInterno = MetodosUtiles.getStringEntre(li, "\">", "</a>");
                //System.out.println("textInterno="+textInterno);

                lt1.add(UtilesHTLM.li(UtilesHTLM.a(textInterno.replace("?", "").replace("¿", "") + ".htm", textInterno)));
                nombrePW.add(textInterno.replace("?", "").replace("¿", ""));
            }
            seccionesArregladas[j] = UtilesHTLM.ul(lt1);
            //System.out.println(seccionesArregladas[j]);
        }
        //  System.out.println(nombrePW);
//        UtilesHTLM.u
//        File f=new File("");
//         LinkedList<String> ls=new LinkedList<>();
//        Archivo.recorrerTexto(f, (t,i)->{
//        
//        });
//         

//        File direccion = new File("E:\\_Cosas\\Programacion\\Estudio\\MQL4\\Curso de forex\\arreglado\\1-Basico");
        String fragmentosViejos[] = secciones;
        String fragmentosNuevos[] = seccionesArregladas;
        System.out.println("paso cero");
        Archivo.recorrerSoloArchivosExternosEnCarpeta(direccion, f -> {
            if (f.getName().startsWith("¿")) {

                Archivo.renombrar(f, Archivo.getNombre(f).substring(1));
            }
        });

        for (int i = 0; i < nombrePW.size(); i++) {
            String nombre = nombrePW.get(i);
            if (nombre.startsWith("¿")) {
                nombrePW.set(i, nombre.substring(1));

            }
        }
        Collections.sort(nombrePW);
        System.out.println("fin paso cero");
        // System.out.println("nombrePW="+nombrePW);
        System.out.println("paso uno");
        Archivo.recorrerSoloArchivosExternosEnCarpeta(direccion, f -> {
            boolean renombro = false;
            for (int i = 0; i < nombrePW.size(); i++) {
                String nombre = nombrePW.get(i).toLowerCase();

                String nombreF = Archivo.getNombre(f);
                //  System.out.println("nombre="+nombre);
//                  System.out.println("f="+f);
//                  System.out.println("nombreF="+nombreF);
//                  System.out.println("nombreF.toLowerCase()="+nombreF.toLowerCase());
//                  System.out.println("nombreF.toLowerCase().replace(\"?\",\"\")="+nombreF.toLowerCase().replace("?",""));
                //System.out.println("nombreF.toLowerCase().replace(\"?\",\"\").replace(\"  - mundo-forex.com\", \"\")="+nombreF.toLowerCase().replace("?","").replace("  - Mundo-Forex.com", ""));
                //  System.out.println("      ="+nombreF.toLowerCase().replace("?","").replace("  - mundo-forex.com", "").replace(" - mundo-forex.com", ""));
                // System.out.println(nombreF.toLowerCase().replace("?","").replace("  - mundo-forex.com", "").replace(" - mundo-forex.com", "").replace(" - mundo-forex.com", "").trim().equalsIgnoreCase(nombre.trim()));
                String a = nombreF.toLowerCase().replace("?", "").replace("_", "").replace("  - mundo-forex.com", "").replace(" - mundo-forex.com", "").replace(" - mundo-forex.com", "").trim();
                String b = nombre.trim();
                //System.out.println("a="+a);
                //System.out.println("b="+b);
                //  System.out.println("a.equalsIgnoreCase(b)="+a.equalsIgnoreCase(b));
                if (a.replace("-", "–").equalsIgnoreCase(b)) {
                    // System.out.println("renombro");
                    Archivo.renombrar(f, nombrePW.get(i));
                    renombro = true;
                    break;
                }
            }
//            if(!renombro){
//                System.out.println("aqui");
//            Archivo.renombrar(f, f.getName().replace("  - Mundo-Forex.com", ""));
//            }

        });
//System.out.println("fragmentosViejos="+Arrays.toString(fragmentosViejos));
//System.out.println("fragmentosNuevos="+Arrays.toString(fragmentosNuevos));
        System.out.println("Paso uno completado");
        Archivo.sustituirTextoArchivosExternosEnCarpeta(direccion, fragmentosViejos, fragmentosNuevos);
        System.out.println("termino");
    }

    public static void crearTablaDeDatos2() {
        String th[][] = {{"Excelente", "-13:00 min", "-14:00 min"},
        {"Bueno", "13:01-15:30", "14:01-16:30"},
        {"Medio", "15:31-18:00", "16:31-19:00"},
        {"Bajo", "18:01-19:30", "19:01-21:30"},
        {"Muy bajo", "+19:30 min", "+21:30 min"}
        };
        String tm[][] = {{"Excelente", "-13:30 min", "-14:30 min"},
        {"Bueno", "13:31-16:00", "14:31-17:00"},
        {"Medio", "16:01-18:30", "17:01-19:30"},
        {"Bajo", "18:31-20:00", "19:31-22:00"},
        {"Muy bajo", "+20:00 min", "+22:00 min"}
        };
        String res = UtilesHTLM.crearTablaTheme(new String[]{"Rendimiento", "+40 años", "-40 años"}, th, (v, i) -> v);
        System.out.println(res);
        System.out.println("");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("");
        System.out.println(UtilesHTLM.crearTablaTheme(new String[]{"Rendimiento", "+40 años", "-40 años"}, tm, (v, i) -> v));
    }

    public static void probarTEST_DE_ROCKPORT_Estimado() {
        Random r = new Random();
        for (int i = 0; i < (r.nextInt(7) + 5); i++) {
            int min = r.nextInt(23), seg = r.nextInt(60);
            Date tiempo = Tempus.tiMin(min, seg);
            System.out.println("tiempo=" + min + ":" + seg + "\t chico " + EducacionFisicaUtiles.getTEST_DE_ROCKPORT_Estimado(41, true, tiempo) + "\t\t\t " + EducacionFisicaUtiles.getTEST_DE_ROCKPORT_Estimado(23, true, tiempo)
                    + "\t\t\t chica " + EducacionFisicaUtiles.getTEST_DE_ROCKPORT_Estimado(41, false, tiempo) + "\t\t\t " + EducacionFisicaUtiles.getTEST_DE_ROCKPORT_Estimado(23, false, tiempo));

        }
    }

    public static void probarTestDeLanzamientoDeBalónMedicinal() {
        Random r = new Random();
        for (int i = 0; i < (r.nextInt(7) + 5); i++) {
            double rep = r.nextDouble() + r.nextInt(10);
            System.out.println("metros=" + rep + " chico" + EducacionFisicaUtiles.getTestDeLanzamientoDeBalónMedicinal(rep, true) + " chica" + EducacionFisicaUtiles.getTestDeLanzamientoDeBalónMedicinal(rep, false));

        }
    }

    public static void probarBurpeeTest() {
        Random r = new Random();
//int re[]=new int[r.nextInt(7)+5];
        for (int i = 0; i < (r.nextInt(7) + 5); i++) {
            int rep = r.nextInt(70);
            System.out.println("rep=" + rep + " " + EducacionFisicaUtiles.getBurpeeTest(rep));

        }
    }

    public static void crearTablaDeDatos() {
        String entrada = "10 ..........          9,45....................7,85 \n"
                + "  9,5........           9,15....................7,1 \n"
                + "  9...........           8,9......................6,72 \n"
                + "  8,5........         ..8,45....................6,45 \n"
                + "  8...........          .8,2......................6,2 \n"
                + "  7,5..........         7,35....................5,91 \n"
                + "  7...........          .7,05....................5,4 \n"
                + "  6,5........         ..6,7......................5,15 \n"
                + "  6..........          ..6,3......................5 \n"
                + "  5,5..........         6.........................4,9 \n"
                + "  5............          5,9......................4,65 \n"
                + "  4,5..........         5,55....................4,5 \n"
                + "  4............          5,3......................4,3 \n"
                + "  3,5..........         5.........................4 \n"
                + "  3............          4,85....................3,92 \n"
                + "  2,5..........         4,7......................3,7 \n"
                + "  2,0.........         .4,2......................3,3 \n"
                + "  1,5..........         3,9......................3 \n"
                + "  1............          3,5......................2,92 ";
        Scanner s = new Scanner(entrada);
        LinkedList<String[]> ll = new LinkedList<>();
        while (s.hasNextLine()) {
            String line = s.nextLine();
            line = line.replace('.', ' ');
            StringTokenizer st = new StringTokenizer(line);
            LinkedList<String> datosLinea = new LinkedList<>();
            //String lineaSalida="";
            while (st.hasMoreTokens()) {
                //lineaSalida+=st.nextToken().replace(',', '.')+(st.hasMoreTokens()?",":"");//" {"+ +"} "
                datosLinea.add(st.nextToken().replace(',', '.'));
            }
            ll.add(datosLinea.toArray(new String[0]));
            //System.out.println("{"+lineaSalida+"},");
            //salida="{"+lineaSalida+"},\n"+salida;

        }
        String[][] entradaDatos = ll.toArray(new String[0][]);
//            Arreglos.MostrarMatrizObject(entradaDatos);
        String res = UtilesHTLM.crearTablaTheme(new String[]{"PUNTOS", "M CHICOS", "M CHICAS"}, entradaDatos, (v, i) -> v);
//            System.out.println();
        System.out.println(res);
    }

    public static void obtenerDatos() {
        String entrada = "10 ..........          9,45....................7,85 \n"
                + "  9,5........           9,15....................7,1 \n"
                + "  9...........           8,9......................6,72 \n"
                + "  8,5........         ..8,45....................6,45 \n"
                + "  8...........          .8,2......................6,2 \n"
                + "  7,5..........         7,35....................5,91 \n"
                + "  7...........          .7,05....................5,4 \n"
                + "  6,5........         ..6,7......................5,15 \n"
                + "  6..........          ..6,3......................5 \n"
                + "  5,5..........         6.........................4,9 \n"
                + "  5............          5,9......................4,65 \n"
                + "  4,5..........         5,55....................4,5 \n"
                + "  4............          5,3......................4,3 \n"
                + "  3,5..........         5.........................4 \n"
                + "  3............          4,85....................3,92 \n"
                + "  2,5..........         4,7......................3,7 \n"
                + "  2,0.........         .4,2......................3,3 \n"
                + "  1,5..........         3,9......................3 \n"
                + "  1............          3,5......................2,92 ";
        Scanner s = new Scanner(entrada);
        String salida = "";
        while (s.hasNextLine()) {
            String line = s.nextLine();
            line = line.replace('.', ' ');
            StringTokenizer st = new StringTokenizer(line);
            String lineaSalida = "";
            while (st.hasMoreTokens()) {
                lineaSalida += st.nextToken().replace(',', '.') + (st.hasMoreTokens() ? "," : "");//" {"+ +"} "

            }
            //System.out.println("{"+lineaSalida+"},");
            salida = "{" + lineaSalida + "},\n" + salida;

        }
        System.out.println(salida);

    }

    public static void arreglarXML() {
        try {

            File dir = new File("C:\\Users\\Rene\\Desktop\\Nueva carpeta\\Nueva carpeta");

            final LinkedList<String> nombrePaginas = new LinkedList<>();
            Archivo.recorrerSoloArchivosExternosEnCarpeta(dir, f -> nombrePaginas.add(f.getName()));

            final String subRemplaso = "https://getbootstrap.com/docs/4.5/utilities/", iden = "<a href=\"" + subRemplaso;

            Archivo.sustituirTextoArchivosExternosEnCarpeta(dir, (f, s, in) -> {
                if (s.contains(iden)) {
                    System.out.println("s=" + s);
                    int indice = s.indexOf(iden) + iden.length();

                    String nombrePagina = s.substring(indice, s.indexOf("/", indice + 1));
                    String aRemplazar = subRemplaso + nombrePagina + "/";
                    System.out.println("aRemplazar=" + aRemplazar);
                    System.out.println("nombrePagina =" + nombrePagina);

                    nombrePagina = nombrePagina.substring(0, 1).toUpperCase() + nombrePagina.substring(1).replace("-", " ");
                    System.out.println("2nombrePagina=" + nombrePagina);
                    for (int i = 0; i < nombrePaginas.size(); i++) {
                        if (nombrePaginas.get(i).startsWith(nombrePagina)) {
                            s = s.replace(aRemplazar, nombrePaginas.get(i));
                            System.out.println("res=" + s);
                            break;
                        }
                    }

                }
                return s;
            });
        } catch (Exception ex) {
            Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static class ProcesoServidor2<E extends I, I extends Remote> {

        private E servidor;
        private Registry registry;

        private Creador<E> creadorDeServidor;
        private Class interfasDeComunicacion;
        private int numeroRegistro;
        private String nombreDelRegistro;

        public ProcesoServidor2(Creador<E> creadorDeServidor, Class interfasDeComunicacion, int numeroRegistro, String nombreDelRegistro) throws Exception {
            this.creadorDeServidor = creadorDeServidor;
            this.interfasDeComunicacion = interfasDeComunicacion;
            this.numeroRegistro = numeroRegistro;
            this.nombreDelRegistro = nombreDelRegistro;
            System.out.println("va a comenzar");
            start();
        }

        public ProcesoServidor2(Creador<E> creadorDeServidor, Class interfasDeComunicacion) throws Exception {
            this(creadorDeServidor, interfasDeComunicacion, 8888, "ServidorRMI");

        }

        public void start() throws Exception {
            System.out.println("Iniciando server...");

            try {
                LocateRegistry.getRegistry(numeroRegistro).list();
                System.out.println("El registro ya existe");
            } catch (ConnectException ex) {
                LocateRegistry.createRegistry(numeroRegistro);
            }

            servidor = creadorDeServidor.crear();

            Naming.rebind(nombreDelRegistro, servidor);

            System.out.println("Ready");
        }

        public void stop() throws RemoteException, NotBoundException {
            System.out.println("deteniendo servidor RMI");
            registry.unbind(nombreDelRegistro);
            System.out.println("RMI paso 1");
            /*bun */ UnicastRemoteObject.unexportObject(servidor, true);
            System.out.println("se detuvo el servidor RMI");

        }

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

    /*
    String fragViejo[] ={"import sun.","import javax.","import com."},// {"com.example.rene",".Utiles.Android"},//com.rene.android.Clases
                    fragNuevo[] ={"import com.rene.android.reneandroid.LibreriasExternas.sun.",
                    "import com.rene.android.reneandroid.LibreriasExternas.javax.",
                    "import com.rene.android.reneandroid.LibreriasExternas.com."};
     */
    private static void arreglarPaqueteAndroid(File carpetaProyecto) {
        try {

            String fragViejo[] = {"com.rene.android.reneandroid.LibreriasExternas.com.rene.android.reneandroid.LibreriasExternas."},// {"com.example.rene",".Utiles.Android"},//com.rene.android.Clases
                    fragNuevo[] = {"com.rene.android.reneandroid.LibreriasExternas."
                    };// {"com.rene.android",""};

            File carpeta = new File(carpetaProyecto + "\\reneandroid\\src\\main\\java\\com\\rene\\android\\reneandroid\\LibreriasExternas");
            Archivo.sustituirTextoEnCarpeta(carpeta, fragViejo, fragNuevo);
            System.out.println("arreglo");
        } catch (Exception ex) {
            Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void crearQuantun() {
        Callback<byte[], String> getBin = v -> {
            String bi = "";
            for (int i = 0; i < v.length; i++) {
                bi += v[i];
            }
            System.out.println("bi=" + bi);
            return bi;
        };
        BufferedInputStream lector = null;
        try {
            System.out.println("ini");
            File dirArc = new File("C:\\Users\\Rene\\Desktop\\Nueva carpeta\\quat.txt");
            lector = new BufferedInputStream(new FileInputStream(dirArc));

            long leng = dirArc.length();
            int max = 1000;
            String quat = "";
            byte B[] = new byte[max];
            int byteLeidos = lector.read(B);

            quat += MetodosUtiles.redondearAString(MetodosUtiles.binarioANumero(getBin.call(B)), 1) + "-";
//            System.out.println("quat="+quat);
            while (byteLeidos > 0) {
                byteLeidos = lector.read(B);
                quat += MetodosUtiles.redondearAString(MetodosUtiles.binarioANumero(getBin.call(B)), 1) + "-";
//                 System.out.println("quat="+quat);
            }

            File dire = new File("C:\\Users\\Rene\\Desktop\\Nueva carpeta");
//            LinkedList<String> li = new LinkedList<>();
            Archivo.crearTXT(dire, "quatR", new String[]{quat});
            System.out.println("end");
        } catch (Exception ex) {
            Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                lector.close();
            } catch (IOException ex) {
                Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void leerQuantun() {
        try {
            File dire = new File("C:\\Users\\Rene\\Desktop\\Nueva carpeta\\quat.txt");
            final Callback<String, Integer> cantDeUnos = v -> {
                int cant = 0;
                for (int i = 0; i < v.length(); i++) {
                    if (v.charAt(i) == '1') {
                        cant++;
                    }
                }
                return cant;
            };
            String lines[] = Archivo.leerTXT(dire);
            LinkedList<Integer> li = new LinkedList<>();
            for (int i = 0; i < lines.length; i++) {
                String ll = lines[i];
                System.out.println(ll);
                System.out.println(MetodosUtiles.binarioANumero(ll));
//                li.add(cantDeUnos.call(lines[i]));
            }
//             LinkedList<String> texto = new LinkedList<>();
//            for (int i = 0; i < li.size(); i++) {
//                
//            }

//            Archivo.recorrerTexto(dire, (v,i)->System.out.println(cantDeUnos.call(v)));
        } catch (Exception ex) {
            Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void quantun() {
        System.out.println("ini");
        File dire = new File("C:\\Users\\Rene\\Desktop\\Nueva carpeta");

        LinkedList<String> li = new LinkedList<>();
        //li.add("quat");
        int max = 100;
        for (int i = 0; i < max; i++) {
            System.out.println("i=" + i);
            String bi = MetodosUtiles.numeroAbinario(i);
            li.add(bi);
        }
//        for (int i = 0; i < (max + 1); i++) {
//            String line = "";
//           
////            for (int j = 0; j < max; j++) {
////                line += (j >= i) ? "0" : "1";
////            }
//            // line+="  "+i;
//            li.add(line);
//        }
        Archivo.crearTXT(dire, "quat", li.toArray(new String[0]));
        System.out.println("end");
    }

    private static void arrglarParaServidor() {
        File carpetaProyecto = new File("F:\\_Cosas\\Programacion\\Proyectos\\PW\\PortalDeNoticiasServidor2");
        int beans = 3;
        arreglarBeans(carpetaProyecto, beans);
        arreglarXHTML(carpetaProyecto, beans);
    }

    private static void arreglarBeans(File carpetaProyecto, int beans) {

        try {
            final String nombreBeans[] = {"EA", "FileSelector", "beanCrearPublicacion", "beanGestionDeUsuarios",
                "beanInicio", "beanLogin", "beanPrincipal", "beanTema", "beanTodasLasPublicaciones",
                "beanDialgoAgregarUsuario", "beanDialogoChatCentro", "beanDialogoChatDerecha",
                "beanDialogoChatIsquierda", "beanDialogoEditarFotoPrefil", "beanDialogoEditarPrefil",
                "beanDialogoEditarUsuario", "beanDialogoInfoUsuario", "beanDialogoMensajeDerecha",
                "beanDialogoRecordarContraseña", "beanDialogoVerContraseña"},
                    fragNuevo[] = new String[nombreBeans.length];
            for (int i = 0; i < nombreBeans.length; i++) {
                if (i == 0) {
                    fragNuevo[i] = "@ManagedBean(name = \"estadoActual" + beans + "\", eager = true)";
                    continue;
                }
                fragNuevo[i] = "@ManagedBean(name = \"" + nombreBeans[i] + beans + "\")";
            }
            Predicate<File> aplAF = v -> {
//                System.out.println("f="+v);
                String nombre = Archivo.getNombre(v);
//                System.out.println("nombre="+nombre);
                for (int i = 0; i < nombreBeans.length; i++) {
                    if (nombreBeans[i].equals(Archivo.getNombre(v))) {
                        return true;
                    }
                }
                return false;
            };
            Predicate<String> conti = v -> !v.startsWith("@ManagedBean");
            Archivo.sustituirTextoEnCarpeta(new File(carpetaProyecto + "\\src\\java"), aplAF, conti, (f, v, i) -> {

                if (v.startsWith("@ManagedBean")) {
//                    System.out.println("v="+v);
                    String nombre = Archivo.getNombre(f);
//                    System.out.println("nombre="+nombre);
                    for (int j = 0; j < nombreBeans.length; j++) {
                        if (nombreBeans[j].equals(nombre)) {
//                            System.out.println("fragNuevo[j]="+fragNuevo[j]);
                            return fragNuevo[j];
                        }
                    }
                }

                return v;
            });

            Archivo.recorrerYSustituirTextoBol(new File(carpetaProyecto + "\\src\\java\\beans\\Superclases\\aplicacionBean.java"),
                    vv -> !vv.contains("@ManagedProperty"), (v, i) -> {
                        if (v.contains("@ManagedProperty(\"#{estadoActual}\")")) {
                            v = "@ManagedProperty(\"#{estadoActual" + beans + "}\")";
                        }
                        return v;
                    });
            Archivo.recorrerYSustituirTextoBol(new File(carpetaProyecto + "\\web\\WEB-INF\\web.xml"),
                    vv -> !vv.contains("<param-value>#{beanTema"), (v, i) -> {
                        if (v.contains("<param-value>#{beanTema")) {
                            v = "<param-value>#{beanTema" + beans + ".tema}</param-value>";
                        }
                        return v;
                    });
        } catch (Exception ex) {
            Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void arreglarXHTML(File carpetaProyecto, int beans) {
        try {
            String fragViejo[] = {"FileSelector", "beanCrearPublicacion", "beanGestionDeUsuarios",
                "beanInicio", "beanLogin", "beanPrincipal", "beanTema", "beanTodasLasPublicaciones",
                "beanDialgoAgregarUsuario", "beanDialogoChatCentro", "beanDialogoChatDerecha",
                "beanDialogoChatIsquierda", "beanDialogoEditarFotoPrefil", "beanDialogoEditarPrefil",
                "beanDialogoEditarUsuario", "beanDialogoInfoUsuario", "beanDialogoMensajeDerecha",
                "beanDialogoRecordarContraseña", "beanDialogoVerContraseña"},
                    fragNuevo[] = new String[fragViejo.length];
            for (int i = 0; i < fragViejo.length; i++) {
                fragNuevo[i] = fragViejo[i] + beans;
            }
            File carpeta = new File(carpetaProyecto + "\\web");
            Archivo.sustituirTextoArchivosExternosEnCarpeta(carpeta, fragViejo, fragNuevo);
        } catch (Exception ex) {
            Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void arrglarExtencion() {
        try {
            File dire = new File("C:\\Users\\Rene\\Desktop\\Nueva carpeta");
            Archivo.recorrerCarpetas(dire, f -> {
//                System.out.println("f="+f);
                // boolean esDos=f.getName().contains("_2");

                String nombre = f.getName().substring(0, f.getName().indexOf(".xhtml"));
                boolean esDos = nombre.endsWith("_2");
//                System.out.println("nombre="+nombre);
                if (esDos) {
                    nombre = nombre.substring(0, nombre.indexOf("_2"));
                    nombre = Archivo.adaptarAntesDeExtencion(nombre, "_2");
//              System.out.println("2 nombre="+nombre);
                }
                File temp = Archivo.adaptarExtencion(nombre, "");
//                System.out.println("temp="+temp);
//                System.out.println("temp.getName()="+temp.getName());
                Archivo.renombrar(f, temp.getName(), "");
                //
                //Archivo.renombrar(f, f.getName().substring(0,f.getName().indexOf("-big"))+"-big"+(esDos?"_2":""), ".gif");
            });
        } catch (Exception ex) {
            Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void crearSales() {
        try {
            File dire = new File("C:\\Users\\Rene\\Desktop\\Nueva carpeta\\Nuevo documento de texto.txt");
            String lines[] = Archivo.leerTXT(dire);
            System.out.println(" {");
            for (int j = 0; j < 10; j++) {
                String l = lines[j];
                System.out.print("new Sale(\"");
                MetodosUtiles.recorrerTokenizer(l, (t, i) -> {
                    switch (i) {
                        case 0:
                            System.out.print(t + "\",");
                            break;
                        case 1:
                        case 2:
                            System.out.print(t.substring(0, t.length() - 1) + ",");
                            break;
                        case 3:
                            System.out.print(t.substring(1, 7).replace(",", "") + ",");
                            break;
                        case 4:
                            System.out.print(t.substring(1, 7).replace(",", "") + ")");
                            break;
                    }

                });
                System.out.println(j == lines.length - 1 ? "" : ",");
            }
            System.out.println("}");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void arreglearXHTM2() {
        File carpetaOriginal = new File("C:\\Users\\Rene\\Desktop\\entra\\Nueva carpeta"), carpetaCopia = new File("C:\\Users\\Rene\\Desktop\\sal\\sal");
        File F[] = carpetaOriginal.listFiles();
        for (int i = 0; i < F.length; i++) {
            arreglearXHTM(F[i], new File(carpetaCopia + "\\" + F[i].getName()));
        }
    }

    private static void arreglearXHTM(File carpetaOriginal, File carpetaCopia) {
        try {
            final String sus = "http://www.primefaces.org/showcase/ui/" + "overlay" + "/" + carpetaCopia.getName() + "/";
            System.out.println("sus=" + sus);
//            System.out.println("carpetaOriginal="+carpetaOriginal);
//            System.out.println("carpetaCopia="+carpetaCopia);
            carpetaCopia.mkdirs();
            //File carpetaOriginal = new File("C:\\Users\\Rene\\Desktop\\datatable"), carpetaCopia = new File("C:\\Users\\Rene\\Desktop\\sal"), carpetaModificado = new File("C:\\Users\\Rene\\Desktop\\sal\\tem"), archivoModificado = new File(carpetaModificado + "\\temp.xhtml");
            File carpetaModificado = new File("C:\\Users\\Rene\\Desktop\\sal\\tem"), archivoModificado = new File(carpetaModificado + "\\temp.xhtml");
            Archivo.copiarCarpetasYAplastarSiExistenDiferentes(carpetaOriginal, carpetaCopia, (f) -> {
                try {
                    final String lineas[] = Archivo.leerTEXTO(f);
                    for (int i = 0; i < lineas.length; i++) {//http://www.primefaces.org/showcase/ui/data/datascroller/
                        //lineas[i] = lineas[i].replace("http://www.primefaces.org/showcase/ui/data/datascroller/", "").replace(".xhtml\">• ", ".htm\">• ");

                        boolean existe = lineas[i].contains(sus);
                        if (existe) {
                            System.out.println("existe " + existe);
                        }

                        lineas[i] = lineas[i].replace(sus, "").replace(".xhtml\">• ", ".htm\">• ");
                    }
                    Archivo.crearTextoYSustituir(carpetaModificado, "temp", ".xhtml", lineas);
                    return archivoModificado;

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
                }
                return null;
            });
        } catch (Exception ex) {
            Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void arreglearXHTM() {
        try {
            //File carpetaOriginal = new File("C:\\Users\\Rene\\Desktop\\datatable"), carpetaCopia = new File("C:\\Users\\Rene\\Desktop\\sal"), carpetaModificado = new File("C:\\Users\\Rene\\Desktop\\sal\\tem"), archivoModificado = new File(carpetaModificado + "\\temp.xhtml");
            File carpetaOriginal = new File("C:\\Users\\Rene\\Desktop\\Nueva carpeta\\Nueva carpeta"), carpetaCopia = new File("C:\\Users\\Rene\\Desktop\\Nueva carpeta (2)\\sal"), carpetaModificado = new File("C:\\Users\\Rene\\Desktop\\Nueva carpeta (2)\\sal\\tem"), archivoModificado = new File(carpetaModificado + "\\temp.xhtml");
            Archivo.copiarCarpetasYAplastarSiExistenDiferentes(carpetaOriginal, carpetaCopia, (f) -> {
                try {
                    final String lineas[] = Archivo.leerTEXTO(f);
                    for (int i = 0; i < lineas.length; i++) {//http://www.primefaces.org/showcase/ui/data/datascroller/
                        //lineas[i] = lineas[i].replace("http://www.primefaces.org/showcase/ui/data/datatable/", "").replace(".xhtml\">• ", ".htm\">• ");
                        lineas[i] = lineas[i].replace("http://www.primefaces.org/showcase/ui/data/datascroller/", "").replace(".xhtml\">• ", ".htm\">• ");
                    }
                    Archivo.crearTextoYSustituir(carpetaModificado, "temp", ".xhtml", lineas);
                    return archivoModificado;

                } catch (FileNotFoundException ex) {
                    Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
                }
                return null;
            });
        } catch (Exception ex) {
            Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void crearTablaRuffierDickson() {
        try {
            String RuffierDickson[][] = {{"Menos de 0", "Excelente"}, {"Entre 0 y 5", "Muy bien"},
            {"Entre 5 y 10", "Bien"}, {"Entre 10 y 15", "Regular"}, {"Entre 15 y 20", "Débil"}};
            File destino = new File("F:\\_Cosas\\ISCA\\PW\\expe2\\Theme");
            Archivo.crearTextoYSustituir(destino, "tablaRuffierDickson", ".html", crearHTMLTheme(new String[]{"Resultado", "Eficiencia"}, RuffierDickson, (v, i) -> new String[]{v[0], v[1]}));
        } catch (IOException ex) {
            Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void crearTablaFlexiones() {
        try {

            File destino = new File("F:\\_Cosas\\ISCA\\PW\\expe2\\Theme");
            Archivo.crearTextoYSustituir(destino, "tablaFlexiones", ".html", crearHTMLTheme(new String[]{"EDAD", "MALO", "MEDIO", "BUENO", "MUY BUENO", "EXELENTE"}, EducacionFisicaUtiles.calidadDeFlexiones, (v, i) -> new String[]{v[0] + "-" + v[1], "Menos de " + v[2], v[3] + "-" + v[4], v[5] + "-" + v[6], v[7] + "-" + v[8], v[9] + ""}));
        } catch (IOException ex) {
            Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void arreglarSub(String sub) {
        MetodosUtiles.recorrerLineas(sub, (v, i) -> System.out.println(v.replace("- >", "-->")));
    }

    private static void crearTablaTest() {
        try {
            File destino = new File("F:\\_Cosas\\ISCA\\PW\\expe2\\Theme");
            Archivo.crearTextoYSustituir(destino, "tabla", ".html", crearHTMLTheme(new String[]{center("DISTANCIA"), center("VO2MAX")}, EducacionFisicaUtiles.testCooper, (v, i) -> new String[]{center(((int) v[0]) + ""), center(v[1] + "")}));
        } catch (IOException ex) {
            Logger.getLogger(provar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void getTes(int... D) {
        for (int d : D) {
            double re = MetodosUtiles.redondearADouble(EducacionFisicaUtiles.getTestCooperFormula(d), 3);
            System.out.println(d + " max=" + EducacionFisicaUtiles.getTestCooperTabla(d) + " for=" + re);
        }
    }
    private final static double[][] testCooperViejo = {{1500, 22.2},
    {2350, 41.6}, {3200, 60.2}, {1550, 23.4}, {2400, 42.4}, {3250, 61.4}, {1600, 24.5},
    {2450, 43.5}, {3300, 62.3}, {1650, 25.6}, {2500, 44.6}, {3350, 63.6}, {1700, 26.7},
    {2550, 45.7}, {3400, 64.7}, {1750, 27.8}, {2600, 46.5}, {3450, 65.8}, {1800, 28.9},
    {2650, 47.9}, {3500, 66.9}, {1850, 30.0}, {2700, 49.0}, {3550, 68.0}, {1900, 31.2},
    {2750, 50.2}, {3600, 69.1}, {1950, 32.3}, {2800, 51.3}, {3650, 70.3}, {2000, 33.4},
    {2850, 52.1}, {3700, 71.4}, {2050, 34.5}, {2900, 53.3}, {3750, 72.3}, {2100, 35.6},
    {2950, 54.0}, {3800, 73.6}, {2150, 36.8}, {3000, 55.5}, {3850, 74.8}, {2200, 37.9},
    {3050, 56.9}, {3900, 75.9}, {2250, 39.0}, {3100, 58.0}, {3950, 77.0}, {2300, 40.1},
    {3150, 59.1}, {4000, 78.1}};

    static class valor implements Comparable<valor> {

        double distancia;
        double valor;

        public valor(double distancia, double valor) {
            this.distancia = distancia;
            this.valor = valor;
        }

        @Override
        public int compareTo(valor o) {
            return new Double(distancia).compareTo(o.distancia);
        }

    }

    public static void ordenar() {
        valor V[] = new valor[testCooperViejo.length];
        for (int i = 0; i < testCooperViejo.length; i++) {
            V[i] = new valor(testCooperViejo[i][0], testCooperViejo[i][1]);
        }
        Arrays.sort(V);
        System.out.print("private final static double[][] testCooper={");
        for (int i = 0; i < V.length; i++) {
            boolean fin = i == V.length - 1;
            System.out.print("{" + ((int) V[i].distancia) + "," + V[i].valor + "}" + (fin ? "};" : ","));

        }
    }

    public static void leerTest() throws FileNotFoundException {
        File direccion = new File("F:\\_Cosas\\ISCA\\Android\\Tabla Cooper.txt");
        // System.out.println("deire"+direccion.exists());
        String lineas[] = Archivo.leerTXT(direccion);
        //  System.out.println("lineas.length="+lineas.length);
        final String res = "private final static double[][]={";
        System.out.print(res);
        for (int i = 0; i < lineas.length; i++) {
            final boolean fin = i == lineas.length - 1;
            MetodosUtiles.recorrerTokenizer(lineas[i], (n, j) -> {
                boolean par = j % 2 == 0;
                System.out.print((par ? "{" : "") + n.replace(",", ".") + (par ? "" : "}") + (fin ? "};" : ","));

            });
        }
        // System.out.println(res);
    }

//    public static void crearTablaUsers() throws Exception {
//        String cons = " CONSTRAINT ", key = "_pkey ", pri = key + " PRIMARY KEY ";
//        String users = "users", auto = "authorities", auty = "authority", table = "TABLE", cret = "CREATE " + table;//fin1="WITH ( OIDS=FALSE ); ALTER "+table+" "+users+" OWNER to postgres;\n" ;
//        String ch = " character", noN = " NOT NULL";
//        String var = " varying";//" varying";
//        String cin = var + "(50)", dos = var + "(255)", noNchCin = ch + cin + noN, noNchDos = ch + dos + noN, boo = "boolean" + noN;
//        String colum[] = {"username", "identificacion", "nombre", "apellido1", "apellido2", "email", "password"}, columnas = "";
//        for (int i = 0; i < colum.length; i++) {
//            columnas += colum[i] + ((i == 0 || i == 6) ? noNchCin : noNchDos) + " ,\n ";
//        }
//        Callback<String, String> fin = f -> "WITH ( OIDS=FALSE ); ALTER " + table + " " + f + " OWNER to postgres;\n";
//
//        String execute = cret + " " + users + "\n (\n  " + columnas + " enable " + boo + " ,\n description " + ch + dos + ",\n"
//                + cons + users + pri + " ( " + colum[0] + " ) \n ) \n" + fin.call(users);
//        String execute2 = "\n"
//                + cret + " " + auto + " (  " + colum[0] + noNchCin + " ,\n " + auty + noNchDos + " ,\n " + cons + auto + pri + " ( " + colum[0] + " , " + auty + " ),\n"
//                + cons + " fkauthorities560259 FOREIGN KEY" + " ( " + colum[0] + " ) \n"
//                + "REFERENCES " + users + " ( " + colum[0] + " ) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION ) \n" + fin.call(auto);
//        //System.out.println("execute=\n"+execute);//436
////          System.out.println("-- Table: "+users);
////         System.out.println("-- DROP TABLE "+users);
////         System.out.println(execute);
////         System.out.println("-- Table: "+auto);
////         System.out.println("-- DROP TABLE "+auto);
////         System.out.println(execute2);
////         for (int i = 0; i < execute.length(); i++) {
////             if(i==436){
////                 String b="";
////                 int max=20;
////                 for (int j = i-max; j < i+max&&j < execute.length(); j++) {
////                     b+=execute.charAt(j)+"";
////                 }
////                 System.out.println("b="+b);
////             }
////        }
//        getConexion().execute(execute + " " + execute2);
//    }

//    public static BDConexionController getConexion() {
//        return BDConexionController.getPOSTGRESConexionLocal5432("postgres", "rene", "Noticias2");
//    }
}
