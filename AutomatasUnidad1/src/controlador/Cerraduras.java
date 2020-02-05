/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.InterfaceCerraduras;

/**
 *
 * @author rfls_
 */
public class Cerraduras  implements InterfaceCerraduras {

    @Override
    public String positiva(int k, char[] a) {//metodod de la cerradura de Kleene
        if (k == 0) {
            JOptionPane.showMessageDialog(null, "No se puede dejar en 0");
            return "";
        } else {
            return "" + potencia(k, a);
        }
    }

    @Override
    public String kleene(int k, char[] a) {//metodod de la cerradura de Kleene
        if (k == 0) {
            return "Λ";
        } else {

            return "Λ\n" + potencia(k, a);
        }
    }

    @Override
    public String potencia(int valor, char[] a) {//metodo para sacar la potencia
        String poten = "";//declaracion de la String que guardara el resultado 
        if (valor == 0) {//condicion si la potencia es 0
            poten = "Λ";
        } else if (valor == 1) {//condicion si la potencia es 1
            for (int j = 0; j < a.length; j++) {
                poten += a[j] + "\n";
            }
        } else {//condicion para que se genere la potencia cuadrada
            for (int i = 0; i < a.length; i++) {//ciclo para hacer la potencia 2
                for (int j = 0; j < a.length; j++) {
                    poten += a[i];
                    poten += a[j];
                    poten += ",";//ingreso de Valores en la String

                }

            }
            String mpotencia[] = poten.split(",");//arreglo que separa la String
            while (valor > 2) {//ciclo para las potencias mayores a 2 partiendo desde la potencia 2
                poten = "";//vaciamos la String para que no se acumulen los datos
                for (int i = 0; i < mpotencia.length; i++) {//ciclo que ingresa los valores de forma ordenada
                    for (int j = 0; j < a.length; j++) {
                        poten += mpotencia[i];
                        poten += a[j];
                        poten += ",";

                    }
                }
                mpotencia = poten.split(",");//reestablecer el valor de la String pero con la nueva potencia
                valor--;//decremento para terminar el ciclo while
            }
            poten = "";//vaciado de la String que mostrara en el text area
            for (int i = 0; i < mpotencia.length; i++) {//ciclo que llena la String para mostrar en el text area de forma ordenada
                poten += (i + 1) + ".- " + mpotencia[i] + "\n";
            }

        }
        return poten;//regresa el valor de la String
    }
}
