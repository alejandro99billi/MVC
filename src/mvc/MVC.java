/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc;

import Controlador.CONTROLADOR;
import Modelo.MODELO;
import Vista.VISTA;

/**
 *
 * @author alejandro
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MODELO mod = new MODELO();
        VISTA view = new VISTA();
        CONTROLADOR crtl = new CONTROLADOR(view ,mod);
        crtl.iniciar();
        view.setVisible(true);
    }
    
}
