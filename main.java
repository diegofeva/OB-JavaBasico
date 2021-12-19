package com.example;

public class main {

    public static void main(String[] args) {

        SmartDevice smartDevice = new SmartDevice();
        SmartPhone smartPhone = new SmartPhone();
        SmartWatch smartWatch = new SmartWatch();

        SmartDevice galaxyTablet = new SmartDevice("Galaxy Tablet", 10.5,1500,true,"Usb C", "Android",4.5);
        SmartPhone galaxyPhone = new SmartPhone("GalaxyPhone",5,4,58);
        SmartWatch galaxyWatch = new SmartWatch("GalaxyWatch","Nilon",true);


        System.out.println(galaxyTablet.modelo);
        System.out.println(galaxyTablet.screenSize);
        System.out.println(galaxyTablet.capacidadBateria);
        System.out.println(galaxyTablet.tactil);
        System.out.println(galaxyTablet.tipoDeCargador);
        System.out.println(galaxyTablet.sistemaOperativo);
        System.out.println(galaxyTablet.version);
        System.out.println("");


        System.out.println(galaxyPhone.modelo);
        System.out.println(galaxyPhone.numeroBotones);
        System.out.println(galaxyPhone.cantidadCamaras);
        System.out.println(galaxyPhone.megaPixeles);
        System.out.println("");


        System.out.println(galaxyWatch.modelo);
        System.out.println(galaxyWatch.materialCorrea);
        System.out.println(galaxyWatch.pantallaColor);
    }
}
