/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Persona { 
    private String id,nombre,tel,correo;
    private Fecha fNac;

    public Persona(String id, String nombre, String tel, String correo, Fecha fNac) {
        this.id = id;
        this.nombre = nombre;
        this.tel = tel;
        this.correo = correo;
        this.fNac = fNac;
    }
public Persona() {
        this.id = " ";
        this.nombre = " ";
        this.tel = " ";
        this.correo = " ";
        this.fNac = new Fecha();
    }
   
  public int edadExacta() {
    Calendar hoy = Calendar.getInstance();

    int anio = hoy.get(Calendar.YEAR);
    int mes = hoy.get(Calendar.MONTH) + 1; 
    int dia = hoy.get(Calendar.DAY_OF_MONTH);

    int edad = anio - this.fNac.getAa();

    if (mes < this.fNac.getMm() || 
       (mes == this.fNac.getMm() && dia < this.fNac.getDd())) {
        edad--;
    }

    return edad;
}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Fecha getfNac() {
        return fNac;
    }

    public void setfNac(Fecha fNac) {
        this.fNac = fNac;
    }

    @Override
public String toString() {
    return  "Identificación: " + id + "\n" +
            "Nombre: " + nombre + "\n" +
            "Teléfono: " + tel + "\n" +
            "Correo: " + correo + "\n" +
            "Fecha de nacimiento: " + fNac.toString();
}
}
