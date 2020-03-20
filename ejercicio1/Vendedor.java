/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Usuario
 */
public class Vendedor {
    private String nombreVendedor;
    private String apellidoVendedor;
    private int codigo;
    private int edad;

    public Vendedor(String nombreVendedor, String apellidoVendedor, int codigo, int edad) {
        this.nombreVendedor = nombreVendedor;
        this.apellidoVendedor = apellidoVendedor;
        this.codigo = codigo;
        this.edad = edad;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public String getApellidoVendedor() {
        return apellidoVendedor;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public void setApellidoVendedor(String apellidoVendedor) {
        this.apellidoVendedor = apellidoVendedor;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
