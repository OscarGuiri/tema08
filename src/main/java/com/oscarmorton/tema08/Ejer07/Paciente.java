package com.oscarmorton.tema08.Ejer07;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Paciente {
    private int sip;
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;
    private String sintomas;
    private boolean siendoAtendido;
    private boolean alta;
    private double[] preRev = new double[4];

    public String getApellido() {
        return apellido;
    }

    public Paciente(int sip, String nombre, String apellido, int edad, char sexo, GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida, String sintomas, boolean siendoAtendido, boolean alta, double[] preRev) {
        this.sip = sip;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.sintomas = sintomas;
        this.siendoAtendido = siendoAtendido;
        this.alta = alta;
        this.preRev = preRev;
    }

    /**
     * Contructor por defecto
     */


    //GETTES

    public int getSip() {
        return sip;
    }

    public char getSexo() {
        return sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public String getSintomas() {
        return sintomas;
    }

    public boolean isSiendoAtendido() {
        return siendoAtendido;
    }

    public boolean isAlta() {
        return alta;
    }

    public double[] getPreRev() {
        return preRev;
    }
}
