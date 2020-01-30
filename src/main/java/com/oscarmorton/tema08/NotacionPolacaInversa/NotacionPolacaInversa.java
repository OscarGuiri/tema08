package com.oscarmorton.tema08.NotacionPolacaInversa;

public class NotacionPolacaInversa {
    private final int MAX_ELEMENTOS = 50;
    private String[] elementos;
    private Pila pila;

    public NotacionPolacaInversa(){
       pila = new Pila();

    }



    public boolean isNumeric(String str){

        try{
            double d = Double.parseDouble(str);

        }catch (NumberFormatException nfe){
            return false;
        }

        return true;
    }

}
