package com.example.ProyectoIntegrador.service;

import com.example.ProyectoIntegrador.Envio;

import java.util.ArrayList;
import java.util.List;

public class ServicioEnvio {
    private List<Envio> envios;
    public ServicioEnvio(){
        this.envios= new ArrayList<>();
    }
    public List<Envio> ObtenerEnvios(){
        return this.envios;
    }
    public Envio crearEnvio (Envio envio){
        this.envios.add(envio);
        return envio;
    }
}
