/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expresionesRegulares;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import readData.SepararCaracteres;

/**
 *
 * @author juan pasillas
 */
public class Digitos {
    public static void main(String[] args) throws IOException {
      SepararCaracteres s= new SepararCaracteres("C:\\Users\\juan pasillas\\Desktop\\compilador-2016-02-12\\compilador\\src\\archivos\\fichero.txt"," ");
       String cadena[] = s.cadenaSeparada();
         String cadenaUno = "1234";
 
if (cadena[2].matches("[0-9]*"))
  System.out.println("Es un número");
else
  System.out.println("No es un número");
    }
}
