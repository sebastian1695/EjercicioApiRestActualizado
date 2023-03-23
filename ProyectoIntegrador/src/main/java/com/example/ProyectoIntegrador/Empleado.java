package com.example.ProyectoIntegrador;

public class Empleado {

    private int cedula;
    private String nombre;
    private String apellido;
    private int celular;
    private String correo;
    private String direccion;
    private String ciudad;
    private String antiguedadEmpresa;
    private String rh;
    private String tipoEmpleado;

    public Empleado(int cedula, String nombre, String apellido, int celular, String correo, String direccion, String ciudad, String antiguedadEmpresa, String rh, String tipoEmpleado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.antiguedadEmpresa = antiguedadEmpresa;
        this.rh = rh;
        this.tipoEmpleado = tipoEmpleado;
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

    public String getAntiguedadEmpresa() {
        return antiguedadEmpresa;
    }

    public String getRh() {
        return rh;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }
}

