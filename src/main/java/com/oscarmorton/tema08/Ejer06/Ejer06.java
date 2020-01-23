package com.oscarmorton.tema08.Ejer06;
import java.util.Scanner;
public class Ejer06 {
    public static Scanner lector = new Scanner(System.in);
    private Bicicleta[] bicicletas;
    private int contadorBicicletas;


    public Ejer06(int maxBicicletas){
        contadorBicicletas = 0;
        int opcion;

        bicicletas = new Bicicleta[maxBicicletas];


        do {
            opcion = menuPrincipal();
            switch (opcion) {
                case 1:
                    if (contadorBicicletas > bicicletas.length) {
                        System.out.println("El numero de bicicletas está al maximo");

                    } else {
                        anyadirBicicleta();
                    }
                    break;
                case 2:
                    venderBicicleta();
                    break;
                case 3:
                    //consultarBicicleta();
                    break;
                case 4:
                    //mostrarStock();
                case 0:
                    System.out.println("Good bye!");
                    break;
            }

        }while(opcion != 0);
    }
    public void anyadirBicicleta(){
        boolean valido = true;
        boolean referenciaExiste = false;
        int referencia;
        String marca;
        String modelo;
        double kg;
        double ruedas;
        boolean contieneMotor = false;
        char comprobrarTieneMotor;
        String fechaFabricante;
        double precio;
        int nExistencias = 0;
        int posicionReferencia = 0;

        System.out.println("*** NUEVA BICICLETA ***");
        do{
            System.out.println("Referencia: ");
            referencia = Integer.parseInt(lector.nextLine());
            if(buscarBicicletaPorReferencia(referencia) >= 0){
                referenciaExiste = true;
                posicionReferencia = buscarBicicletaPorReferencia(referencia); //Ya se la que existe, así que pongo la referencia en un variable para luego lamarlo
            }
        }while(!valido);

        if(!referenciaExiste){
            do{
                System.out.println("Introduce la marca: ");
                marca = lector.nextLine();
                if(marca.length() < 2){
                    valido = false;
                    System.out.println("la longitud de la marca tiene que ser minimo 2 caracteres");
                }else{
                    valido = true;
                }

            }while(!valido);
            do{
                System.out.println("Introduce la Modelo: ");
                modelo = lector.nextLine();
                if(marca.length() < 2){
                    valido = false;
                    System.out.println("la longitud del modelo tiene que ser minimo 2 caracteres");
                }else{
                    valido = true;
                }

            }while(!valido);
            do{
                System.out.println("Introduce el peso en Kg: ");
                kg = lector.nextDouble();
                lector.nextLine();
                if(kg <= 0 ){
                    valido = false;
                    System.out.println("Por favor introduce una opcion superior a cero");
                }else{
                    valido = true;
                }

            }while(!valido);
            do{
                System.out.println("Introduce el tamaño de las ruedas en pulgadas: ");
                ruedas = lector.nextDouble();
                lector.nextLine();
                if(ruedas <= 0 ){
                    valido = false;
                    System.out.println("Por favor introduce una opcion superior a cero");
                }else{
                    valido = true;
                }

            }while(!valido);
            do {
                System.out.println("Tiene motor?");
                comprobrarTieneMotor = lector.next().charAt(0);
                lector.nextLine();
                if (comprobrarTieneMotor == 'y' || comprobrarTieneMotor == 's') {
                    contieneMotor = true;


                } else {
                    contieneMotor = false;
                    System.out.println("Por favor introduce una opcion valida");
                }
            }while(!valido);
            do{
                System.out.println("Introduce la fecha en formato dd-mm-yyyy: ");
                fechaFabricante = lector.nextLine();
                if(fechaFabricante == ""){
                    valido = false;
                    System.out.println("Por favor, introduce la fecha");
                }else{
                    valido = true;
                }
            }while(!valido);
            do{
                System.out.println("Precio: ");
                precio = lector.nextDouble();
                lector.nextLine();
                if(precio <= 0){
                    valido = false;
                    System.out.println("Por favor introduce un valor valido");
                }else {
                    valido = true;

                }

            }while(!valido);

            bicicletas[contadorBicicletas] = new Bicicleta(referencia,marca, modelo, kg, ruedas, contieneMotor, fechaFabricante, precio, 0);
            contadorBicicletas++;
            System.out.println("Bicicleta creada correctamente");

        }else{
            //Voy por todas las bicicletas contando cuantas de la misma referencia existen
            for(int i = 0; i < contadorBicicletas; i++) {
                if (bicicletas[i].getReferencia() == referencia) {
                    nExistencias++;
                }
            }
            bicicletas[contadorBicicletas] = new Bicicleta(referencia,   bicicletas[posicionReferencia].getMarca(),
                                                                        bicicletas[posicionReferencia].getModelo(),
                                                                        bicicletas[posicionReferencia].getKg(),
                                                                        bicicletas[posicionReferencia].getRuedas(),
                                                                        bicicletas[posicionReferencia].isContieneMotor(),
                                                                        bicicletas[posicionReferencia].getFechaFabricacion(),
                                                                        bicicletas[posicionReferencia].getPrecio(),
                                                                        bicicletas[posicionReferencia].getnExistencias());

            contadorBicicletas++;
            System.out.println("Bicicleta creada correctamente");

        }




    }

    /**
     * Utilizo el algorithmo de desplazamieto para eliminar las bicicletas
     */
    public void venderBicicleta(){
        int refernecia;
        int pos;
        System.out.println("Cual es el numero de referencia de la bicicleta que quieres vender:");
        refernecia = Integer.parseInt(lector.nextLine());
            pos = buscarBicicletaPorReferencia(refernecia);
        if( pos < 0){
            System.out.println("La referencia introducida no existe");

        }else{
            bicicletas[pos] = null;
            contadorBicicletas--;
            desplazar(bicicletas, pos+1);
            System.out.println("Bici borrado correctamente");


        }



    }
    /**
     * Desplaza los elementos del array una posición a partir de la posición pos
     * @param
     * @param pos Posición a partir de la cual se desplazarán los elementos
     */
    private void desplazar(Bicicleta[] biciletas, int pos) {
        int i = pos;
        boolean fin = false;
        while(i < biciletas.length && !fin) {
            fin = biciletas[i] == null;
            if(!fin) {
                biciletas[i-1] = biciletas[i];
                biciletas[i] = null;
            }
            i++;
        }
    }
    public void consultarBicicleta(){



    }

    /**
     * Imprime el menu de consultas bicicletas
     * @return
     */
    public int imprimerMenuConsultas(){
        System.out.println("***********************");
        System.out.println("** CONSULTA BICICLETA **");
        System.out.println("***********************");
        System.out.println("1.- Consultar por referencia ...");
        System.out.println("2.- Consultar por marca ...");
        System.out.println("3.- Consultar por modelo ...");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");

        return Integer.parseInt(lector.nextLine());


    }

    /**
     * Devuelve la posicion del bicicleta, sino devuelve -1
     * @param referencia
     * @return
     */
    private int buscarBicicletaPorReferencia(int referencia) {
        for(int i = 0; i < contadorBicicletas; i++) {
            if (bicicletas[i].getReferencia() == referencia) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Imprime el menu principal
     * @return
     */
    private int menuPrincipal() {
        int opcion = -1;
        do {

            System.out.println("*************************");
            System.out.println("** GESTIÓN DE BICICLETAS **");
            System.out.println("*************************");
            System.out.println("1.- Añadir bicicleta …");
            System.out.println("2.- Vender bicicleta ...");
            System.out.println("3.- Consultar bicicleta …(En desarollo)");
            System.out.println("4.- Mostrar stock(En desarollo)");
            System.out.println("------------------------------------");
            System.out.println("0. Salir\n");
            System.out.println("Elija una opción: ");
            opcion = Integer.parseInt(lector.nextLine());
            if(opcion < 0 || opcion > 3) {
                System.out.println("Elija una opción del menú [0-3]");

            }
        } while (opcion < 0 || opcion > 3);
        return opcion;
    }
}
