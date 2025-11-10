/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Modelo.Fecha;
/**
 *
 * @author Estudiante
 */
public class Transaccion {
    private Fecha fechaT;
    private int valorTRA;
    private String Concepto, codT, tipT;

    public Transaccion(Fecha fechaT, int valorTRA, String Descripcion, String codT, String tipT) {
        this.fechaT = fechaT;
        this.valorTRA = valorTRA;
        this.Concepto = Descripcion;
        this.codT = codT;
        this.tipT = tipT;
    }
    
    public Transaccion() {
         int val = (int) (Math.random() * 999) + 100;
        this.fechaT = new Fecha();
        this.valorTRA = 0;
        this.Concepto = Concepto;
        this.codT = "304-" + val;;
        this.tipT = " ";
    }

    public Fecha getFechaT() {
        return fechaT;
    }

    public void setFechaT(Fecha fechaT) {
        this.fechaT = fechaT;
    }

    public int getValorTRA() {
        return valorTRA;
    }

    public void setValorTRA(int valorTRA) {
        this.valorTRA = valorTRA;
    }

    public String getDescripcion() {
        return Concepto;
    }

    public void setDescripcion(String Descripcion) {
        this.Concepto = Descripcion;
    }

    public String getCodT() {
        return codT;
    }

    public void setCodT(String codT) {
        this.codT = codT;
    }

    public String getTipT() {
        return tipT;
    }

    public void setTipT(String tipT) {
        this.tipT = tipT;
    }

    @Override
    public String toString() {
        return  "\n fecha Transaccion" + fechaT +  
                "\n valor Transaccion " + valorTRA + 
                "\n Concepto" + Concepto + 
                "\n codigo" + codT + 
                "\n tipo " + tipT ;
    }
    

    
    
}
