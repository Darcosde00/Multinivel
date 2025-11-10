/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class bolsillo {
    private String nombreBolsillo;
    private double saldo;
    private boolean activo;

    public bolsillo(String nombreBolsillo, double saldo, boolean activo) {
        this.nombreBolsillo = nombreBolsillo;
        this.saldo = saldo;
        this.activo = activo;
    }
       public bolsillo() {
        this.nombreBolsillo = " ";
        this.saldo = 0.0;
        this.activo = activo;
        
    }

    public String getNombreBolsillo() {
        return nombreBolsillo;
    }

    public void setNombreBolsillo(String nombreBolsillo) {
        this.nombreBolsillo = nombreBolsillo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
       
    
    
}
