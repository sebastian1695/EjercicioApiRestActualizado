package com.example.ProyectoIntegrador.controller;

import com.example.ProyectoIntegrador.Empleado;
import com.example.ProyectoIntegrador.service.ServicioEmpleado;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v1")
public class ControllerEmpleado {
    @PostMapping ("/empleado")
    public Empleado crearEmpleado (@RequestBody Empleado empleado){

        return this.servicioEmpleado.crearEmpleado(empleado);
    }
    private ServicioEmpleado servicioEmpleado;
    public ControllerEmpleado(){
        this.servicioEmpleado= new ServicioEmpleado();
    }
    @GetMapping ("/empleado")
    public List<Empleado> obtenerEmpleados(){
        return this.servicioEmpleado.obtenerEmpleados();

    }
    @DeleteMapping ("/empleado")
    public List<Empleado> borrarEmpleado(){
        return this.servicioEmpleado.borrarEmpleados();

    }
    @PutMapping("/empleado")
    public List<Empleado> editarEmpleado(){

        return this.servicioEmpleado.editarEmpleado();
    }

}
