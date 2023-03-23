package com.example.ProyectoIntegrador.service;

import com.example.ProyectoIntegrador.Cliente;
import org.thymeleaf.exceptions.TemplateProcessingException;

import java.util.ArrayList;
import java.util.List;

public class ServicioCliente {
    private List<Cliente> clientes;
    public ServicioCliente(){
        this.clientes=new ArrayList<>();
    }
    public List<Cliente> ObtenerClientes(){
        return this.clientes;
    }
    public Cliente crearCliente (Cliente cliente){
        this.clientes.add(cliente);
        return cliente;
    }

    public List<Cliente> BorrarCliente() {return this.clientes;
    }

    public List<Cliente> EditarCliente() {return this.clientes;
    }
}
