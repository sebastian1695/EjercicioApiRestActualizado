package com.example.ProyectoIntegrador.service;

import com.example.ProyectoIntegrador.Empleado;

import java.util.ArrayList;
import java.util.List;

public class ServicioEmpleado {
    private List<Empleado> empleados;

    public ServicioEmpleado() {
        this.empleados = new ArrayList<>();
    }
    public List<Empleado> obtenerEmpleados(){
        return this.empleados;
    }
    public Empleado crearEmpleado(Empleado empleado){
        this.empleados.add(empleado);
        return empleado;
    }

    public List<Empleado> borrarEmpleados() { return this.empleados;
    }

    public List<Empleado> editarEmpleado() { return this.empleados;
    }
}
