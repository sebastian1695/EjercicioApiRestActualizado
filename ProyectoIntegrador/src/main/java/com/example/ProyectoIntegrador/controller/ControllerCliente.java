package com.example.ProyectoIntegrador.controller;

import com.example.ProyectoIntegrador.Cliente;
import com.example.ProyectoIntegrador.service.ServicioCliente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("api/v1")
public class ControllerCliente {
    @PostMapping ("/cliente")
    public Cliente crearCliente (@RequestBody Cliente cliente){
        return this.servicioCliente.crearCliente(cliente);
    }
    private ServicioCliente servicioCliente;
    public ControllerCliente(){

        this.servicioCliente = new ServicioCliente();
    }

    @GetMapping("/cliente")
    public List<Cliente> obtenerClientes(){

        return this.servicioCliente.ObtenerClientes();
    }
    @DeleteMapping ("/cliente")
    public List<Cliente> borrarCliente(){
        return this.servicioCliente.BorrarCliente();
    }
    @PutMapping ("/cliente")
    public List<Cliente> editarCliente(){
        return this.servicioCliente.EditarCliente();

    }

}
