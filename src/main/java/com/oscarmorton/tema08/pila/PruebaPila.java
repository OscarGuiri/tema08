package com.oscarmorton.tema08.pila;

public class PruebaPila {

    public PruebaPila(){
        Pila pila = new Pila(20);
        pila.push(20);
        System.out.println(pila.pop());
        if(pila.empty()){
            System.out.println("la pila está vacia");

        }else{
            System.out.println("La pila no está vacia");

        }
        pila.push(10);
        pila.push((20));
        System.out.println("El tamaño es: " + pila.size());
        if(pila.empty()){
            System.out.println("la pila está vacia");

        }else{
            System.out.println("La pila no está vacia");

        }
    }
}
