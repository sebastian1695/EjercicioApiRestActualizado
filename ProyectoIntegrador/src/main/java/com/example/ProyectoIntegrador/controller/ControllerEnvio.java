package com.example.ProyectoIntegrador.controller;

import com.example.ProyectoIntegrador.Empleado;
import com.example.ProyectoIntegrador.Envio;
import com.example.ProyectoIntegrador.service.ServicioEnvio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v1")
public class ControllerEnvio {
    @PostMapping ("envío")
    public Envio crearEnvio (@RequestBody Envio envio){
       return this.servicioEnvio.crearEnvio(envio);
    }
    private ServicioEnvio servicioEnvio;
    public ControllerEnvio(){
        this.servicioEnvio = new ServicioEnvio();
    }

    @GetMapping("/envío")
    public List<Envio> obtenerEnvios(){
        return this.servicioEnvio.ObtenerEnvios();
    }
}
