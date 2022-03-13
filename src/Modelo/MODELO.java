/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author alejandro
 */
public class MODELO {
    private int numeroUno;
    private int numeroDos;
    private int resultado;

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getNumeroUno() {
        return numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public int getResultado() {
        return resultado;
    }
    
    
    
    public int mulplicar()
    {this.resultado=this.numeroUno * this.numeroDos;
    return this.resultado;
    
    }
}
