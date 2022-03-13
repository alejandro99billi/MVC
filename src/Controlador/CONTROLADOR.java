/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.MODELO;
import Vista.VISTA;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alejandro
 */
public class CONTROLADOR implements ActionListener{
    
 private VISTA view;
 private MODELO model;
 
 
 public CONTROLADOR(VISTA view, MODELO model){
  this.view = view;
  this.model=model;
  this.view.btnmultiplicar.addActionListener(this);
  }
   
  public void iniciar()
  {
   view.setTitle("MVC Multiplicar");
   view.setLocationRelativeTo(null);
   
   }
    public void actionPerformed(ActionEvent e){
        
        model.setNumeroUno(Integer.parseInt(view.txtnumero1.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtnumero2.getText()));
        model.mulplicar();
        view.txtresultado.setText(String.valueOf(model.getResultado()));
    }
  
  
  
  
  
}
