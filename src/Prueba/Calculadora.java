/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

/**
 *
 * @author Rene
 */
public abstract class Calculadora {
     public static double Calcular(String operacion) {
        return calculo(operacion)[0];
    }
    private static double[] calculo(String operacion) {

//        Enunciados e = new Enunciados();
        //Revision r = new Revision();
        String suboperacion = "";
        double resultado[] = new double[2];
        int contadorSalto = 0;
        int contadorParentesis = 0;
        String numero = "";
        double operador1 = 0;
        double operador2 = 0;
        String sinParentesis = "";
        String sinMyD = "";
        String respuesta = "";

        for (int i = 0; i < operacion.length(); i++) {
            if (contadorSalto-- != 0) {
                continue;
            } else {
                contadorSalto = 0;
            }
            if ('(' == operacion.charAt(i)) {
                if (i != 0 && operacion.charAt(i - 1) != '*' && operacion.charAt(i - 1) != '/'
                        && operacion.charAt(i - 1) != '+' && operacion.charAt(i - 1) != '-' && operacion.charAt(i - 1) != ')'
                        && operacion.charAt(i - 1) != '[' && operacion.charAt(i - 1) != ']' && operacion.charAt(i - 1) != '^'
                        && (operacion.charAt(i - 1) >= 97 && operacion.charAt(i - 1) <= 122 ? false : true)) {
                    sinParentesis += "*";
                }
                for (int j = i + 1;; j++) {

                    if (operacion.charAt(j) == '(') {
                        contadorParentesis++;
                    }
                    if (operacion.charAt(j) == ')') {
                        contadorParentesis--;
                    }
                    contadorSalto++;
                    suboperacion += operacion.charAt(j);
                    if (contadorParentesis == 0 && operacion.charAt(j + 1) == ')') {
                        break;
                    }
                }
                contadorSalto++;
                // Operaciones o = new Operaciones();
                double A[] = new double[2];
                A = calculo(suboperacion);
                suboperacion = "";
                if (A[1] == 1) {
                    resultado[1] = 1;
                    return resultado;
                } else {
                    if (sinParentesis.length() == 1 && sinParentesis.charAt(0) == '-') {
                        sinParentesis += "1*";
                    }
                    if (sinParentesis.length() > 1 && sinParentesis.charAt(sinParentesis.length() - 1) == '-') {
                        String trasformado = "";
                        for (int j = 0; j < sinParentesis.length() - 1; j++) {
                            trasformado += sinParentesis.charAt(j) + "";
                        }
                        sinParentesis = trasformado + "+-1*";
                    }
                    sinParentesis += A[0];
                    if (i + contadorSalto != operacion.length() - 1 && operacion.charAt(i + contadorSalto + 1) != '*' && operacion.charAt(i + contadorSalto + 1) != '/'
                            && operacion.charAt(i + contadorSalto + 1) != '+' && operacion.charAt(i + contadorSalto + 1) != '-' && operacion.charAt(i + contadorSalto + 1) != ')'
                            && operacion.charAt(i + contadorSalto + 1) != ']') {
                        sinParentesis += "*";
                    }
                }
            } else {
                sinParentesis += operacion.charAt(i);
            }
        }
        //modifiacar
        if (errores(sinParentesis) == true) {
            resultado[1] = 1;
            return resultado;
        }
        for (int i = 0; i < sinParentesis.length(); i++) {

            if (contadorSalto-- != 0) {
                continue;
            } else {
                contadorSalto = 0;
            }
            double B[];
            if (i != sinParentesis.length() - 1 && sinParentesis.charAt(i) == '^') {
                B = numero(sinParentesis, i, 1);
                contadorSalto += B[1];
                respuesta += regulador(Math.pow(Double.parseDouble(numero), B[0]));
                numero = "";
                continue;
            }
            if (i < sinParentesis.length() - 4) {
                String caracteres3 = "";
                int salto = 0;
                for (int j = 0; j < 3; j++) {
                    caracteres3 += sinParentesis.charAt(i + j);
                }

                switch (caracteres3) {
                    //4-3
                    case "lnx":
                        contadorSalto += 2;
                        B = numero(sinParentesis, i, 3);
                        contadorSalto += (int) B[1];
                        if (numero != "") {
                            respuesta += numero + Math.log(B[0]);
                        } else {
                            respuesta += Math.log(B[0]);
                        }

                        continue;
                    case "csc":
                        contadorSalto += 2;
                        B = numero(sinParentesis, i, 3);
                        contadorSalto += (int) B[1];
                        if (numero != "") {
                            respuesta += numero + (1 / regulador(Math.sin(B[0] * Math.PI / 180)));
                        } else {
                            respuesta += (1 / regulador(Math.sin(B[0] * Math.PI / 180)));
                        }

                        continue;
                    case "sec":
                        contadorSalto += 2;
                        B = numero(sinParentesis, i, 3);
                        contadorSalto += (int) B[1];
                        if (numero != "") {
                            respuesta += numero + (1 / regulador(Math.cos(B[0] * Math.PI / 180)));
                        } else {
                            respuesta += (1 / regulador(Math.cos(B[0] * Math.PI / 180)));
                        }

                        continue;
                    case "sin":
                    case "sen":
                        contadorSalto += 2;
                        B = numero(sinParentesis, i, 3);
                        contadorSalto += (int) B[1];
                        if (numero != "") {
                            respuesta += numero + regulador(Math.sin(B[0] * Math.PI / 180));
                        } else {
                            respuesta += regulador(Math.sin(B[0] * Math.PI / 180));
                        }

                        continue;
                    case "cos":
                        contadorSalto += 2;
                        B = numero(sinParentesis, i, 3);
                        contadorSalto += (int) B[1];
                        if (numero != "") {
                            respuesta += numero + regulador(Math.cos(B[0] * Math.PI / 180));
                        } else {
                            respuesta += regulador(Math.cos(B[0] * Math.PI / 180));
                        }

//                        System.out.println("contadorSalto=" + contadorSalto);
                        continue;
                    case "tan":
                        contadorSalto += 2;
                        B = numero(sinParentesis, i, 3);
                        contadorSalto += (int) B[1];
                        if (numero != "") {
                            respuesta += numero + regulador(Math.tan(B[0] * Math.PI / 180));
                        } else {
                            respuesta += regulador(Math.tan(B[0] * Math.PI / 180));
                        }

                        continue;
                    case "cot":
                        contadorSalto += 2;
                        B = numero(sinParentesis, i, 3);
                        contadorSalto += (int) B[1];
                        if (numero != "") {
                            respuesta += numero + (1 / regulador(Math.tan(B[0] * Math.PI / 180)));
                        } else {
                            respuesta += (1 / regulador(Math.tan(B[0] * Math.PI / 180)));
                        }

                        continue;
                    case "sqr":
                        contadorSalto += 2;
                        caracteres3 = "";
                        for (int j = 1; j < 4; j++) {
                            caracteres3 += sinParentesis.charAt(i + 2 + j);
                        }

                        if (caracteres3 == "[2]") {
                            //7-6
                            B = numero(sinParentesis, i, 6);
                            respuesta += Math.sqrt(B[0]);
                            salto = 1;
                        } else {
                            //[2.0]
                            if (caracteres3 == "[2.") {
                                B = numero(sinParentesis, i, 8);
                                respuesta += Math.sqrt(B[0]);
                                salto = 3;

                            } else {
                                numero = "";
                                for (int j = i + 4; sinParentesis.charAt(j) != ']'; j++) {
                                    numero += sinParentesis.charAt(j);
                                    salto++;
                                }
                                //6-5
                                B = numero(sinParentesis, i, salto + 5);
                                respuesta += regulador(Math.pow(B[0], 1 / Double.parseDouble(numero)));
                                numero = "";
                            }

                        }
                        contadorSalto += (int) B[1] + salto + 2;
                        continue;
                    default:
                }
            }
            if (sinParentesis.charAt(i) != '*' && sinParentesis.charAt(i) != '/' && sinParentesis.charAt(i) != '+'
                    & (sinParentesis.charAt(i) == '-' ? numero == "" : true)) {
                numero += sinParentesis.charAt(i);
            } else {
                respuesta += numero + sinParentesis.charAt(i);
                numero = "";
            }
        }
        if (numero != "") {
            respuesta += numero;
            numero = "";
        }
        sinParentesis = respuesta;
        respuesta = "";
        //Sin Parentesis
        //Multiplicacion y Divicion
        for (int i = 0; i < sinParentesis.length(); i++) {
            if (contadorSalto-- != 0) {
                continue;
            } else {
                contadorSalto = 0;
            }
            if ('*' == sinParentesis.charAt(i) | '/' == sinParentesis.charAt(i) & i != sinParentesis.length() - 1) {
                operador1 = Double.parseDouble(numero);
                numero = "";
                for (int j = i + 1; j < sinParentesis.length() && sinParentesis.charAt(j) != '*' && sinParentesis.charAt(j) != '/'
                        && sinParentesis.charAt(j) != '+'; j++) {
                    if (j == i + 1 && sinParentesis.charAt(j) == '-') {
                        numero += "-";
                        contadorSalto++;
                        continue;
                    }
                    if (sinParentesis.charAt(j) == '-') {
                        break;
                    }
                    numero += sinParentesis.charAt(j);
                    contadorSalto++;
                }
                operador2 = Double.parseDouble(numero);
                numero = "";
                if ('*' == sinParentesis.charAt(i)) {
                    numero = operador1 * operador2 + "";
                } else {
                    if (operador2 == 0) {
                        resultado[1] = 1;
                        Error_Cero();
                        return resultado;
                    } else {
                        numero = operador1 / operador2 + "";
                    }
                }
            } else {
                if ('+' == sinParentesis.charAt(i) | '-' == sinParentesis.charAt(i) && numero != "" ? true : false) {
                    sinMyD += numero + sinParentesis.charAt(i);
                    numero = "";
                } else {
                    numero += sinParentesis.charAt(i);
                }
            }
        }
        sinMyD += numero;
        numero = "";
        //Suma y Resta                

        for (int i = 0; i < sinMyD.length(); i++) {
            if (i == 0 && sinMyD.charAt(i) == '-') {
                numero += "-";
                continue;
            }
            if (contadorSalto-- != 0) {
                continue;
            } else {
                contadorSalto = 0;
            }
            if ('+' == sinMyD.charAt(i) | '-' == sinMyD.charAt(i) & i != sinMyD.length() - 1) {
                operador1 = Double.parseDouble(numero);
                numero = "";
                for (int j = i + 1; j < sinMyD.length() && '+' != sinMyD.charAt(j); j++) {
                    if (j == i + 1 && sinMyD.charAt(j) == '-') {
                        numero += "-";
                        contadorSalto++;
                        continue;
                    }
                    if (sinMyD.charAt(j) == '-') {
                        break;
                    }
                    numero += sinMyD.charAt(j);
                    contadorSalto++;
                }
                operador2 = Double.parseDouble(numero);
                numero = "";
                if ('+' == sinMyD.charAt(i)) {
                    respuesta = operador1 + operador2 + "";
                    numero = respuesta;
                } else {
                    respuesta = operador1 - operador2 + "";
                    numero = respuesta;
                }
            } else {
                numero += sinMyD.charAt(i);
            }
        }
        if (respuesta == "") {
            respuesta = numero;
        }
        resultado[0] = Double.parseDouble(respuesta);
        suboperacion = "";
        return resultado;

    }
 private static double regulador(double numero) {
        String N = numero + "";
        String n0 = "0.";
        int c9 = 0;
        int c0 = 0;
        boolean c = false;
        String N2 = "";
        for (int i = N.length() - 1; i >= 0 && c0 != 5; i--) {
            if (N.charAt(i) == '0') {
                c0++;
            } else {
                c0 = 0;
            }
        }
        if (c0 == 5) {
            //double ssss=0.0000000000000001;
            //  return Math.floor(numero);
            return Double.parseDouble((numero + "").substring(0, (numero + "").length() - 2));
        }
        c0 = 0;
        for (int i = N.length() - 1; i >= 0 && c9 != 3; i--) {
            if (N.charAt(i) == '9') {
                c9++;
            } else {
                c9 = 0;
            }
        }
        c = false;
        if (c9 == 3) {
            for (int i = 0; i < N.length() - 2; i++) {
                N2 += N.charAt(i);
            }
            for (int i = 0; i < N2.length(); i++) {
                if (N2.charAt(i) == '.') {
                    c = true;
                    continue;
                }
                if (c && i < N2.length() - 1) {
                    c0++;
                }
            }
            for (int i = 0; i < c0; i++) {
                n0 += "0";
            }
            n0 += "1";
            int ceroC;
            return Double.parseDouble(N2) + Double.parseDouble(n0);
        }
        return numero;
    }

 
 
    // private  class Enunciados {
    private static void Error_parentecisCierre() {

        System.out.println("**  A la operacion le falto un parentecis de cierre **");
    }

    private static void Error_parentecisInicial() {

        System.out.println("*  A la operacion le falto un parentecis de apertura *");
    }

    private static void Error_coma() {

        System.out.println("****************  Escribio mas de una , **************");

    }

    private static void Error_Cero() {

        System.out.println("****  No se puede realizar una divicion por cero  ****");
    }

    private static void Error_caracterIncorrecto() {

        System.out.println("*******  Escribio un caracter no permitido  **********");

    }

    private static void Error_caracterDoble(String a, String b) {

        System.out.println("****  Escribio " + a + b + " que no es permitido *****");

    }

    private static void Error_caracterInicial(String a) {

        System.out.println("************  Comezo con solo " + a + " **************");

    }

    private static void Error_caracterFinal(String a) {

        System.out.println("****************  Termino con " + a + " **************");

    }
    // }
private static boolean errores(String operacion) {
        for (int i = 0; i < operacion.length(); i++) {
            if (i == 0 && '.' == operacion.charAt(i) | ',' == operacion.charAt(i) | '*' == operacion.charAt(i)
                    | '/' == operacion.charAt(i) | '+' == operacion.charAt(i)
                    | (i == operacion.length() - 1 && '-' == operacion.charAt(i) ? true : false)) {
                Error_caracterInicial(operacion.charAt(i) + "");
                return true;
            }
            if (i == operacion.length() - 1
                    && '.' == operacion.charAt(i) | ',' == operacion.charAt(i) | '*' == operacion.charAt(i)
                    | '/' == operacion.charAt(i) | '+' == operacion.charAt(i) | '-' == operacion.charAt(i)) {
                Error_caracterFinal(operacion.charAt(i) + "");
                return true;
            }
            if (i != operacion.length() - 1
                    && '*' == operacion.charAt(i) | '/' == operacion.charAt(i) | '+' == operacion.charAt(i) | '-' == operacion.charAt(i) | '.' == operacion.charAt(i) | ',' == operacion.charAt(i)
                    && '.' == operacion.charAt(i + 1) | ',' == operacion.charAt(i + 1) | '*' == operacion.charAt(i + 1)
                    | '/' == operacion.charAt(i + 1) | '+' == operacion.charAt(i + 1)
                    | ('.' == operacion.charAt(i) | ',' == operacion.charAt(i) ? '-' == operacion.charAt(i + 1) : false)) {
                Error_caracterDoble(operacion.charAt(i) + "", operacion.charAt(i + 1) + "");
                return true;
            }
            if (i != operacion.length() - 2
                    && '-' == operacion.charAt(i) && '-' == operacion.charAt(i + 1) && '.' == operacion.charAt(i + 2) | ',' == operacion.charAt(i + 2) | '*' == operacion.charAt(i + 2)
                    | '/' == operacion.charAt(i + 2) | '+' == operacion.charAt(i + 2) | '-' == operacion.charAt(i + 2)) {
                Error_caracterDoble(operacion.charAt(i) + "" + operacion.charAt(i + 1) + "", operacion.charAt(i + 2) + "");
                return true;
            }
        }
        return false;
    }
private static double[] numero(String a, int inicio, int salto) {
        String N = "";
        double n[] = new double[2];
        n[1] = 0;

        for (int i = inicio + salto; i < a.length() && a.charAt(i) != '*' && a.charAt(i) != '/' && a.charAt(i) != '+'
                && (a.charAt(i) == '-' ? i == inicio + salto : true); i++) {
            N += a.charAt(i);
            n[1]++;

        }
        n[0] = Double.parseDouble(N);
        return n;
    }

}
