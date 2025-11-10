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
public class cuentaH extends Servicios {

    public cuentaH(String NrOSev, int claveDi, double saldo, double tasaINT, ArrayList<Transaccion> listaT) {
        super(NrOSev, claveDi, saldo, tasaINT, listaT);
    }

    public cuentaH() {
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
