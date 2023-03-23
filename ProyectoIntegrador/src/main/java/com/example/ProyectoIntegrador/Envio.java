package com.example.ProyectoIntegrador;

public class Envio {
    private String numeroGuia;
    private String cliente;
    private String origen;
    private String destino;
    private String direccionDestino;
    private String personaRecibe;
    private int celularRecibe;
    private long horaRecibido;
    private String estadoEnvio;
    private int valorEnvio;

    public Envio(String numeroGuia, String cliente, String origen, String destino, String direccionDestino, String personaRecibe, int celularRecibe, long horaRecibido, String estadoEnvio, int valorEnvio) {
        this.numeroGuia = numeroGuia;
        this.cliente = cliente;
        this.origen = origen;
        this.destino = destino;
        this.direccionDestino = direccionDestino;
        this.personaRecibe = personaRecibe;
        this.celularRecibe = celularRecibe;
        this.horaRecibido = horaRecibido;
        this.estadoEnvio = estadoEnvio;
        this.valorEnvio = valorEnvio;
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public String getCliente() {
        return cliente;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public String getPersonaRecibe() {
        return personaRecibe;
    }

    public int getCelularRecibe() {
        return celularRecibe;
    }

    public long getHoraRecibido() {
        return horaRecibido;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public int getValorEnvio() {
        return valorEnvio;
    }
}
