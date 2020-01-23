package com.oscarmorton.tema08.Ejer06;
import java.util.GregorianCalendar;


public class Bicicleta {

    private int referencia;
    private String marca;
    private String modelo;
    private double kg;
    private double ruedas;
    private boolean contieneMotor;
    private String fechaFabricacion;
    private double precio;
    private int nExistencias;

    public Bicicleta(int referencia, String marca, String modelo, double kg, double ruedas, boolean contieneMotor, String fechaFabricacion, double precio, int nExistencias) {
        this.referencia = referencia;
        this.marca = marca;
        this.modelo = modelo;
        this.kg = kg;
        this.ruedas = ruedas;
        this.contieneMotor = contieneMotor;
        this.fechaFabricacion = fechaFabricacion;
        this.precio = precio;
        this.nExistencias = nExistencias;
    }

    public int getReferencia() {
        return referencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKg() {
        return kg;
    }

    public double getRuedas() {
        return ruedas;
    }

    public boolean isContieneMotor() {
        return contieneMotor;
    }

    public String getFechaFabricacion() {
        return fechaFabricacion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getnExistencias() {
        return nExistencias;
    }
}
