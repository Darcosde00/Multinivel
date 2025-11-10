/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class cuentaC extends Servicios {
    public cuentaC(String NrOSev, int claveDi, double saldo, double tasaINT, ArrayList<Transaccion> listTran) {
        super(NrOSev, claveDi, saldo, tasaINT, listTran);
    }

    public cuentaC(){
        super();
    }


    @Override
    public void abono(double monto) {
    }

    @Override
    public void cargos(double monto) {
    }

    @Override
    public void descuentos(double monto) {
    }

    @Override
    public void pago(double monto) {
    }
}   
