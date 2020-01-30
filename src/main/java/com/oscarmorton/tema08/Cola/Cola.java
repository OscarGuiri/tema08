package com.oscarmorton.tema08.Cola;

public class Cola {
    private int[] array = new int[10];
    private static final int INITIAL_SIZE = 10;
    private int nElementos;

    public Cola(int size){
        array = new int[size];
        nElementos = 0;


    }

    public Cola(){
        this(INITIAL_SIZE);
    }

    public void add(int dato) {
            array[nElementos] = dato;
            nElementos++;
    }

    public int remove(){
        int aux = Integer.MIN_VALUE;
        if(!empty()){
            aux = array[0];
            desplazarIzquierda(array);
            nElementos--;
        }
        return aux;
    }
    public void desplazarIzquierda(int[] cola){
        for (int i = 0; i < nElementos; i++){
            cola[i] = cola[i+1];
        }
    }
    public int size(){
        return nElementos;

    }
    public int peek(){
        return array[0];

    }
    public boolean empty(){
        return nElementos == 0;

    }

}
