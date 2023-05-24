package com.coderhouse.ClienteApiRestPungitore.model;

import jakarta.persistence.*;

import java.util.Date;


public class ClientDTO {

    private String nombre;
    private String apellido;
    private int edad;

    public ClientDTO(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //Getters y setters y override de toString
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
