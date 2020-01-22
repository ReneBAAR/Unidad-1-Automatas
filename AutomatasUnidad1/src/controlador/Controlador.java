package controlador;

import javax.swing.JOptionPane;
import modelo.InterfaceCadenas;
import modelo.Modelo;

/**
 *
 * @author Romario Fabian y Rene Ivan
 * Descripcion:
 * Este programa 
 */
public class Controlador extends Modelo implements InterfaceCadenas{
   
    //concatena las cadenas ya existentes
    public void numeroDeCadenas(int numeros){
         String cadenaNuevaConcatenada = "";
        int numCadena;
        for (int i = 0; i < numeros; i++) {
            numCadena = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el numero de la cadena"));
            cadenaNuevaConcatenada += cadenas.get(numCadena).toString();
        }
       cadenaConcatenada = cadenaNuevaConcatenada;
       concatenadas.add(cadenaConcatenada);
        setCadenaExtra(cadenaConcatenada);
    }
    //
    public void vaciarCadena(){
        setCadenaGenerada("");
    }
    
    //saca la longitud de cada una de las cadenas guardadas en el ArrayList
    public int longitudCadena(int numCadena){
        String cadena;
        int num;
        cadena = (String) cadenas.get(numCadena);
        
        return num = cadena.length();
    }

    //Muestra las cadenas guardadas
    @Override
    public void numeroLinea() {
        for (int i = 0; i < cadenas.size(); i++) {
            System.out.println(cadenas.get(i));
        }
    }
    
    //Muestra las cadenas guardadas concatenadas en la consola
    public void verConcatenadas()
    {
        for (int i = 0; i < concatenadas.size(); i++) {
            System.out.println(concatenadas.get(i));
        }
    }
    
    //se verifica que la cadena que se ingresa no sea la misma
    public boolean verificarCadena(String cadena){
        for (int i = 0; i < cadenas.size(); i++) {
            if (cadena.equals(cadenas.get(i))) {
                System.out.println(cadena);
                return true;
            }else{
            
            }
            
        }
        return false;
    }
   
}