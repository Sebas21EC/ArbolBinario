/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArbolBinario;

/**
 *
 * @author SebasCarlosama
 */
public class NodoArbolBinario {

    private NodoArbolBinario hermano_derecho;
    private NodoArbolBinario hermano_izquierdo;
    private Object informacion;

    /**
     * Constructor
     * @param informacion referencia de objeto
     */
    public NodoArbolBinario(Object informacion) {
        this.informacion = informacion;
        this.hermano_derecho = null;
        this.hermano_izquierdo = null;
    }

    
    /**
     * Propiedades Get y Set
     */
    
    public NodoArbolBinario getHermano_derecho() {
        return hermano_derecho;
    }

    public void setHermano_derecho(NodoArbolBinario hermano_derecho) {
        this.hermano_derecho = hermano_derecho;
    }

    public NodoArbolBinario getHermano_izquierdo() {
        return hermano_izquierdo;
    }

    public void setHermano_izquierdo(NodoArbolBinario hermano_izquierdo) {
        this.hermano_izquierdo = hermano_izquierdo;
    }

    public Object getInformacion() {
        return informacion;
    }

    public void setInformacion(Object informacion) {
        this.informacion = informacion;
    }
}
