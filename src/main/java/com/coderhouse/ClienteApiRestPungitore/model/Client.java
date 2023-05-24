package com.coderhouse.ClienteApiRestPungitore.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;

    //Getters y setters y override de toString
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;

        if (getId() != client.getId()) return false;
        if (getNombre() != null ? !getNombre().equals(client.getNombre()) : client.getNombre() != null) return false;
        if (getApellido() != null ? !getApellido().equals(client.getApellido()) : client.getApellido() != null)
            return false;
        return getFechaNacimiento() != null ? getFechaNacimiento().equals(client.getFechaNacimiento()) : client.getFechaNacimiento() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getNombre() != null ? getNombre().hashCode() : 0);
        result = 31 * result + (getApellido() != null ? getApellido().hashCode() : 0);
        result = 31 * result + (getFechaNacimiento() != null ? getFechaNacimiento().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
