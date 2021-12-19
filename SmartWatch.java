package com.example;

public class SmartWatch extends SmartDevice {

    // 1. Atributos

    String modelo;
    String materialCorrea;
    boolean pantallaColor;

    // 2. Constructores

    public SmartWatch(){

    }
    public SmartWatch(String modelo,String materialCorrea,boolean pantallaColor){
        this.modelo = modelo;
        this.materialCorrea = materialCorrea;
        this.pantallaColor = pantallaColor;

    }
}
