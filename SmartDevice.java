package com.example;

public class SmartDevice {

    //1.Atributos

    String modelo;
    double screenSize;
    double capacidadBateria;
    boolean tactil;
    String tipoDeCargador;
    String sistemaOperativo;
    double version;



    //2.Constructores

    public SmartDevice(){

    }

    public SmartDevice(String modelo,double screenSize,double capacidadBateria,boolean tactil,String tipoDeCargador, String sistemaOperativo, double version){
        this.modelo = modelo;
        this.screenSize = screenSize;
        this.capacidadBateria = capacidadBateria;
        this.tactil = tactil;
        this.tipoDeCargador = tipoDeCargador;
        this.sistemaOperativo = sistemaOperativo;
        this.version = version;

    }

    public SmartDevice(String modelo, String sistemaOperativo, double version) {
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.version = version;
    }

    //3.Métodos

    public void actualizar(double actualizacion){

        this.version = actualizacion;

    }

}
