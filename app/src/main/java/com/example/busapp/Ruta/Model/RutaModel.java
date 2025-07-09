package com.example.busapp.Ruta.Model;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public class RutaModel {
    private String nombre;
    private List<Paradero> paraderos;
    private List<LatLng> puntosRuta; // Para el trazado en mapa

    public RutaModel() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Paradero> getParaderos() {
        return paraderos;
    }

    public void setParaderos(List<Paradero> paraderos) {
        this.paraderos = paraderos;
    }

    public List<LatLng> getPuntosRuta() {
        return puntosRuta;
    }

    public void setPuntosRuta(List<LatLng> puntosRuta) {
        this.puntosRuta = puntosRuta;
    }
}
