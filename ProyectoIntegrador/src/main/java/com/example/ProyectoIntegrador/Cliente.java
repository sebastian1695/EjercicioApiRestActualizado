package com.example.ProyectoIntegrador;

public class Cliente {

    private int cedula;
    private String nombre;
    private String apellido;
    private int celular;
    private String correo;
    private String direccion;
    private String ciudad;

    public Cliente(int cedula, String nombre, String apellido, int celular, String correo, String direccion, String ciudad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }
}
