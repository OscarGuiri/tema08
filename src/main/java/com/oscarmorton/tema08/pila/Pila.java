package com.oscarmorton.tema08.pila;

import org.omg.CORBA.INTERNAL;

import java.sql.SQLOutput;

public class Pila {

    private int[] array = new int[10];
    private static final int INITIAL_SIZE = 10;
    private int nElementos;

    public Pila(int size){
        array = new int[size];
        nElementos = 0;


    }



      public Pila(){
        this(INITIAL_SIZE);
      }


    //Añado un elemento a la pila. DUDA!!
    public void push(int elemento){
        if(nElementos == array.length){
            array = duplicarArray(array);

        }
        array[nElementos] = elemento;
        nElementos++;

    }
    //  Lee y retira el elemento superior de la pila.
    public int pop(){
        int resultado = Integer.MIN_VALUE;
        if(!empty()){
            resultado = array[nElementos -1];
            nElementos--;
        }
        return  resultado;
    }
    //Devuelve el número de elementos que hay a la pila.
    public int size(){
        return nElementos;
    }


    // Lee el elemento superior de la pila sin retirarlo.
    public  int top(){
        int resultado = Integer.MIN_VALUE;
        if(!empty()){
            resultado = array[nElementos -1];

        }
        return  resultado;
    }
    // Devuelve verdadero si la pila está vacía o falso en caso de que contenga algún elemento.
    public boolean empty(){
        return nElementos == 0;

    }

    public int[] duplicarArray(int[] datos){
        int segundoArray[] = new int[datos.length*2];
        for(int i = 0; i < datos.length; i++){
            segundoArray[i] = datos[i];
        }
        return segundoArray;

    }


}
