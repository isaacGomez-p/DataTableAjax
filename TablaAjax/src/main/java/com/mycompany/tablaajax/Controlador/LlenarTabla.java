/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablaajax.Controlador;

import Utilitarios.Carro;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;


/**
 *
 * @author ISAACELEAZAR
 */
@Named(value = "llenarTabla")
@SessionScoped
public class LlenarTabla {
    
    public String nombre;
    
    public String marca;
    
    public int anio;
    
    public List<String> marcas;
    
    public List<Carro> listaCarros;

    public List<Carro> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(List<Carro> listaCarros) {
        this.listaCarros = listaCarros;
    }

    public List<String> getMarcas() {
        return marcas;
    }

    public void setMarcas(List<String> marcas) {
        this.marcas = marcas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    
    
    /**
     * Creates a new instance of LlenarTabla
     */
    @PostConstruct
    void init(){
        marcas = new ArrayList<>();
        marcas.add("BMW");
        marcas.add("Mercedes");
        marcas.add("Volvo");
        marcas.add("Audi");
        marcas.add("Renault");
        marcas.add("Fiat");
        marcas.add("Volkswagen");
        marcas.add("Honda");
        marcas.add("Jaguar");
        marcas.add("Ford");
    }
    
    public void accionBoton(){
        Carro ca = new Carro();
        ca.setNombre(this.getNombre());
        ca.setMarca(this.getMarca());
        ca.setAnio(this.getAnio());
        
        listaCarros.add(ca);
    }
    
}
