/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import Modelo.Persona;
/**
 *
 * @author PC
 */
public class PortafolioSEV {

    private ArrayList<Servicios> ListaServ;
    private Persona cliente;
    private String NroRef;

    public PortafolioSEV(ArrayList<Servicios> ListaServ, Persona cliente, String NroRef) {
        this.ListaServ = ListaServ;
        this.cliente = cliente;
        this.NroRef = NroRef;
    }
     
     public PortafolioSEV() {
        int val = (int) (Math.random() * 999) + 100;
        this.NroRef ="001-" + val; ;
        this.ListaServ = new ArrayList<Servicios>();
        this.cliente = new Persona();
    
    }

    public ArrayList<Servicios> getListaServ() {
        return ListaServ;
    }

    public void setListaServ(ArrayList<Servicios> ListaServ) {
        this.ListaServ = ListaServ;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public String getNroRef() {
        return NroRef;
    }

    public void setNroRef(String NroRef) {
        this.NroRef = NroRef;
    }
private String datosListaTS(){
        String datos="";
        for (Servicios SERV:ListaServ) {
            datos+= SERV.toString()+"\n";
            
        }
        return datos;
    }
    
    @Override
    public String toString() {
        return  "ListaServ=" + ListaServ + 
                ", cliente=" + cliente + 
                ", NroRef=" + NroRef +
                " Lista servicios" + datosListaTS();
    }

    

    
}
