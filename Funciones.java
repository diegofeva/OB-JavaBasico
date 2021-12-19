package com.prueba;

public class Funciones {

    public static void main(String[] args) {

        double resultado = getPrice(pvp);

        System.out.println(resultado);


    }

    static double pvp = 2.0;
    static double getPrice(double precio){
        double iva = precio * 0.1;
        double precioIva = precio + iva;
        return precioIva;
    }



    }

