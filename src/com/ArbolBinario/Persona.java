/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ArbolBinario;

/**
 *
 * @author SebasCarlosama
 */
public class Persona {

   
    private String numero_cedula;
    private String nombre;
    private String apellido;
    private int codigo_provincia;
    private int codigo_canton;
    private int codigo_parroquia;
    private String fecha_nacimiento;
    
    /**
     * Constructor
     * @param numero_cedula valor del numero de cedula de la persona
     * @param nombre valore del nombre de la persona
     * @param apellido valor del apellido de la persona
     * @param codigo_provincia valor del codigo de la provincia de la persona
     * @param codigo_canton valor del codigo del canton de la persona
     * @param codigo_parroquia valor del codigo de la parroquia de la persona
     * @param fecha_nacimiento  valor de la fecha de nacimiento de la persona
     */
    public Persona(String numero_cedula, String nombre, String apellido, int codigo_provincia, int codigo_canton, int codigo_parroquia, String fecha_nacimiento) {
        this.numero_cedula = numero_cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo_provincia = codigo_provincia;
        this.codigo_canton = codigo_canton;
        this.codigo_parroquia = codigo_parroquia;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    /**
     * Propiedades get y set
     */
    
    public String getNumero_cedula() {
        return numero_cedula;
    }

    public void setNumero_cedula(String numero_cedula) {
        this.numero_cedula = numero_cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo_provincia() {
        return codigo_provincia;
    }

    public void setCodigo_provincia(int codigo_provincia) {
        this.codigo_provincia = codigo_provincia;
    }

    public int getCodigo_canton() {
        return codigo_canton;
    }

    public void setCodigo_canton(int codigo_canton) {
        this.codigo_canton = codigo_canton;
    }

    public int getCodigo_parroquia() {
        return codigo_parroquia;
    }

    public void setCodigo_parroquia(int codigo_parroquia) {
        this.codigo_parroquia = codigo_parroquia;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    @Override
    public String toString() {
        return "Numero de cédula: "+this.numero_cedula+"\nNombre: "+this.nombre+" "+this.apellido+"\nCódigo provincial: "+this.codigo_provincia+"\nCódigo cantón: "+this.codigo_canton+"\nCódigo parroquia: "+this.codigo_parroquia+"\nFecha nacimiento: "+this.fecha_nacimiento;
    }
    
    
}
