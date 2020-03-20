/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String apellido;
    private String nombre;
    private int edad;

    public Persona(String apellido, String nombre, int edad) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void Imprimir(String apellido,String nombre, int edad){
        System.out.println("Apellido="+apellido+"\n"+"Nombre="+nombre+"\n"+"Edad="+edad+"\n");
    }
    
    public static void main(String[] args){
        String cargar[]={"Aranda","Cesar","20","Soledad","Laura","19","Picapiedra","Pedro","3000"};
        int a=0;
        for(int i=0;i<3;i++){
            Persona p=new Persona(cargar[0+a],cargar[1+a],Integer.parseInt(cargar[2+a]));
            p.Imprimir(cargar[0+a],cargar[1],Integer.parseInt(cargar[2]));
            a=a+3;
        }
        
    }
}
