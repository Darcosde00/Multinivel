/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.PortafolioSEV;
import Vista.frmRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Controlador implements ActionListener {/*1. agregar gestor de eventos
                                                      2.*/
    private frmRegistro frmReg;
    private PortafolioSEV objport;

    public Controlador(frmRegistro frmReg, PortafolioSEV objport) {
        this.frmReg = frmReg;
        this.objport = objport;
    }

    public Controlador() {
        this.frmReg = new frmRegistro();
        this.objport = new PortafolioSEV();
    }

    public void iniciar() {
        frmReg.setTitle("Registro Portafolio");
        frmReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //2
        frmReg.getBtnReg().addActionListener(this);
        frmReg.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //3 desarrollar el codigo para el control activado
        if (e.getSource().equals(frmReg.getBtnReg())) {
            //vista al modelo
            objport.getCliente().setId(frmReg.getTxtID().getText());
            objport.getCliente().setNombre(frmReg.getTxtNom().getText());
            JOptionPane.showMessageDialog(frmReg, objport.toString());

        }
    }
    
    public frmRegistro getFrmReg() {
        return frmReg;
    }

    public void setFrmReg(frmRegistro frmReg) {
        this.frmReg = frmReg;
    }

    public PortafolioSEV getObjport() {
        return objport;
    }

    public void setObjport(PortafolioSEV objport) {
        this.objport = objport;
    }

    

}
