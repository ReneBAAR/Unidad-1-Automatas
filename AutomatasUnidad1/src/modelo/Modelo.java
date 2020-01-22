/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author rfls_
 */
public class Modelo {
    private String cadenaNueva = "";
    private String cadenaGenerada = "";
    public String cadenaConcatenada ;
    public String cadenaExtra = "";
    
    private int contadorLinea = 0;
    public ArrayList cadenas =  new ArrayList();
    public ArrayList concatenadas = new ArrayList();

    public String getCadenaNueva() {
        return cadenaNueva;
    }

    public void setCadenaNueva(String cadenaNueva) {
        this.cadenaNueva += cadenaNueva +"\n";
    }

    public int getContadorLinea() {
        return contadorLinea;
    }

    public void setContadorLinea(int contadorLinea) {
        this.contadorLinea = contadorLinea;
    }

    public String getCadenaGenerada() {
        return cadenaGenerada;
    }

    public void setCadenaGenerada(String cadenaGenerada) {
        this.cadenaGenerada += cadenaGenerada;
    }

    public String getCadenaExtra() {
        return cadenaExtra;
    }

    public void setCadenaExtra(String cadenaExtra) {
        this.cadenaExtra += cadenaExtra +"\n";
    }
    
    
    
    
}
