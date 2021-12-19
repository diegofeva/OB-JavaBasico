package com.example;

public class main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {


        cocheCRUD.save(new Coche());
        cocheCRUD.delete(new Coche());
        cocheCRUD.findAll();





    }
}
