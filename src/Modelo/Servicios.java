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
public  abstract class Servicios {

    protected String NrOSev;
    protected int claveDi;
    protected double saldo, tasaINT;
    protected ArrayList <Transaccion> listaT;
    protected Fecha Fcrea;

    public Servicios(String NrOSev, int claveDi, double saldo, double tasaINT, ArrayList<Transaccion> listaT) {
        this.NrOSev = NrOSev;
        this.claveDi = claveDi;
        this.saldo = saldo;
        this.tasaINT = tasaINT;
        this.listaT = listaT;
    }

   
    public Servicios() {
        //generar automaticamente el numero de cuenta
        int val = (int) (Math.random() * 999) + 100;
        this.NrOSev = "001-" + val;
        this.tasaINT = 0.0;
        this.claveDi = 0;
        this.saldo = 0.0;
        this.listaT = new ArrayList<Transaccion>();
    }

    public String getNrOSev() {
        return NrOSev;
    }

    public void setNrOSev(String NrOSev) {
        this.NrOSev = NrOSev;
    }

    public int getClaveDi() {
        return claveDi;
    }

    public void setClaveDi(int claveDi) {
        this.claveDi = claveDi;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTasaINT() {
        return tasaINT;
    }

    public void setTasaINT(double tasaINT) {
        this.tasaINT = tasaINT;
    }

    public ArrayList<Transaccion> getListTran() {
        return listaT;
    }

    public void setListTran(ArrayList<Transaccion> listTran) {
        this.listaT = listTran;
    }

    public abstract void abono(double monto);//cambio del metodo consignar
    public abstract void cargos(double monto);//
    public abstract void descuentos(double monto);//
    public abstract void pago(double monto);//
    
    private String datosListaT(){
        String datos="";
        for (Transaccion trans : listaT) {
            datos+= trans.toString()+"\n";
            
        }
        return datos;
    }
    @Override
    public String toString() {
        return "\n Numero de la cuenta  :" + NrOSev  
                + "\n saldo   :" + saldo +
                "\n Transacciones \n" + datosListaT();
    }

}
/*
cast convertir tipos de datos primitivos
int x;
double d =10.5;
-----> x=(int)d;
*/
