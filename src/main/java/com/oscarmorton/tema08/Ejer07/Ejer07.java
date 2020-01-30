package com.oscarmorton.tema08.Ejer07;


import java.util.Scanner;

public class Ejer07 {

    private Scanner lector;
    private String[] nombres = {"Juan", "Isabel", "Pablo", "Sergio", "Rubén", "Alicia", "Ana", "María", "José", "Fernando", "Germán"};

    public Ejer07(int numPacientes){
        lector = new Scanner(System.in);
        Paciente pacientes[] = new Paciente[numPacientes];

        int input;
        input = imprimirMenuPrincipal();


    }
    public void nuevoPaciente(){
        boolean valido = false;
        int sip;
        String nombre;
        int edad;
        char sexo;
        do{
            System.out.println("Introduce el SIP: ");
            sip = Integer.parseInt(lector.nextLine());
            if(sip > 99999999 || sip < 10000000){
                valido = false;
                System.out.println("El sip tiene que estar entre 10000000 y 99999999");
            }else{
                valido = true;
            }

        }while(!valido);


    }

    public int imprimirMenuPrincipal() {
        int input;
        do {
            input = -1;

            System.out.println("********************");
            System.out.println("**\t" + "URGENCIAS\t" + "**");
            System.out.println("********************");
            System.out.println("1. Nuevo paciente ...");
            System.out.println("2. Atender paciente ...");
            System.out.println("3. Consultas ...");
            System.out.println("4. Alta médica ...");
            System.out.println("-----------------------------");
            System.out.println("0. Salir");
            input = Integer.parseInt(lector.nextLine());
            if(input > 5 || input < 0){
                System.out.println("Por favor, introduce una opcion valido");
            }

        }while(input > 5 || input < 0);
        return input;

    }


}
