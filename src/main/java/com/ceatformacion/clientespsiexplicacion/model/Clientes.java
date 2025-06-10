package com.ceatformacion.clientespsiexplicacion.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;


@Entity
public class Clientes {
//Toda tabla debe tener un atributo unico y clave primaria, que la referencia @Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera el valor identificativo...
    private int id; //iDCliente---> id   id_cliente

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private byte edad;

    //Para el uso de JPA e Hibernate, no hace falta el contructor completo, solo el vacio...y como el vacio se hace por defecto, no hace falta constructor..
    //Por lo cual es opcional hacerlo si crees que te hara falta.


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", edad=" + edad +
                '}';
    }
}
