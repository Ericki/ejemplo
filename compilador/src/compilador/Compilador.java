/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import expresionesRegulares.Identificadores;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static readData.LeerFichero.muestraContenido;

/**
 *
 * @author Alumno
 */
public class Compilador {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) throws IOException {
      String cadena="abc";
          Identificadores ide = new Identificadores();
          ide.getPalabrasReservadas();
      Pattern pat = Pattern.compile("abc");
     Matcher mat = pat.matcher(cadena);
     // SepararCaracteres s= new SepararCaracteres("C:\\Users\\usuario\\Desktop\\texto.txt"," ");
       // s.cadenaSeparada();

     if (mat.matches()) {
         System.out.println("SI");
     } else {
         System.out.println("NO");
     }  
        
    }
 
}
