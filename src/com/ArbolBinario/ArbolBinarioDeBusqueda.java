/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArbolBinario;

/**
 *
 * @author SebasCarlosama
 */
public class ArbolBinarioDeBusqueda {

    private NodoArbolBinario raiz;

    /**
     * Constructor
     */
    public ArbolBinarioDeBusqueda() {
        this.raiz = null;
    }

    /**
     * Propiedades get y set.
     */
    public NodoArbolBinario getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbolBinario raiz) {
        this.raiz = raiz;
    }

    /**
     * Metodo ingresar objetos a arbol binario de busqueda
     *
     * @param informacion corresponde a la referencia de informacion
     * @return retorna una cadena de texto dependiendo de lo que se ejecuto
     */
    public String Ingresar(Object informacion) {

        if (raiz == null) {
            raiz = new NodoArbolBinario(informacion);

            return "Información ingresada...";

        } else {

            String a = ((Persona) informacion).getNumero_cedula();
            String b;
            NodoArbolBinario aux = raiz;
            int comparacion;
            while (true) {
                b = ((Persona) aux.getInformacion()).getNumero_cedula();
                comparacion = a.compareTo(b);
                if (comparacion < 0) {
                    if (aux.getHermano_izquierdo() != null) {
                        aux = aux.getHermano_izquierdo();
                    } else {
                        aux.setHermano_izquierdo(new NodoArbolBinario(informacion));
                        return "Información ingresada";
                    }

                }
                if (comparacion > 0) {
                    if (aux.getHermano_derecho() != null) {
                        aux = aux.getHermano_derecho();
                    } else {
                        aux.setHermano_derecho(new NodoArbolBinario(informacion));
                        return "Información ingresada";
                    }
                }
                
                if(comparacion==0) {
                    return "-";
                }

            }
        }
    }

    /**
     * Metodo preOrder recursivo.
     *
     * @param nodo referencia de nodo del arbol binario
     * @return retorna una cadena
     */
    public String PreOrder(NodoArbolBinario nodo) {
        String resultado = "";
        if (nodo != null) {
            resultado += (nodo.getInformacion()).toString() + "\n\n";
            resultado += PreOrder(nodo.getHermano_izquierdo());
            resultado += PreOrder(nodo.getHermano_derecho());
        }
        return resultado;
    }

    /**
     * Metodo inOrder recursivo
     *
     * @param nodo referencia de nodo del arbol binario
     * @return retorna una cadena
     */
    public String InOrder(NodoArbolBinario nodo) {
        String resultado = "";
        if (nodo != null) {
            resultado += InOrder(nodo.getHermano_izquierdo());
            resultado += (nodo.getInformacion()).toString() + "\n\n";
            resultado += InOrder(nodo.getHermano_derecho());
        }
        return resultado;
    }

    /**
     * Metodo postOrder recursivo
     *
     * @param nodo referencia de nodo del arbol binario
     * @return retorna una cadena
     */
    public String PostOrder(NodoArbolBinario nodo) {
        String resultado = "";
        if (nodo != null) {
            resultado += PostOrder(nodo.getHermano_izquierdo());
            resultado += PostOrder(nodo.getHermano_derecho());
            resultado += (nodo.getInformacion()).toString() + "\n\n";
        }
        return resultado;
    }

    public String BuscarCedula(String cedula, ArbolBinarioDeBusqueda arbol_binario) {

        NodoArbolBinario aux = arbol_binario.getRaiz();
        boolean bandera = true;
        int comparacion;

        while (bandera) {
            comparacion = cedula.compareTo(((Persona) aux.getInformacion()).getNumero_cedula());
            if (comparacion < 0) {
                if (aux.getHermano_izquierdo() != null) {
                    aux = aux.getHermano_izquierdo();
                } else {
                    return "No existe este numero de cedula";
                }
            }

            if (comparacion > 0) {
                if (aux.getHermano_derecho() != null) {
                    aux = aux.getHermano_derecho();
                } else {
                    return "No existe este numero de cedula";
                }
            }
            if (comparacion == 0) {
                return (aux.getInformacion()).toString();
            }

        }

        return "No se ejecuto ninguna busqueda";
    }

    /**
     * Metodo recursivo para btner el tamanio del arbol
     * @param raiz recibe como parametro una direccion de memoria de un objeto tipo nodo arbol binario
     * @return Retorna la suma de sus hijos mas uno o nulo si el arbol no tiene nada.
     */
    public int TamnioArbol(NodoArbolBinario raiz) {

        if (raiz == null) {
            return 0;
        } else {

            return TamnioArbol(raiz.getHermano_derecho()) + TamnioArbol(raiz.getHermano_izquierdo()) + 1;

        }

    }

}
