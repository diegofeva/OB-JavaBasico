package com.example;

public class SmartPhone extends SmartDevice {

    // 1. Atributos

    String modelo;
    int numeroBotones;
    int cantidadCamaras;
    double megaPixeles;

    // 2.Constructor

    public SmartPhone(){

    }

    public SmartPhone(String modelo,int numeroBotones, int cantidadCamaras,double megaPixeles){
        this.modelo = modelo;
        this.numeroBotones = numeroBotones;
        this.cantidadCamaras = cantidadCamaras;
        this.megaPixeles = megaPixeles;


    }
}
