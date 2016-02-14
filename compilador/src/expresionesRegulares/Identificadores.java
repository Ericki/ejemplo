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
 * @author usuario
 */
public class Identificadores {
private  String [] palabrasReservadas ={"autonomo","doble","entero","estructura",
"romper","ademas","largo","interuptor",
"caso","enumerar","registrar","tipode",
"letra","externo","devuelve","unir"
,"constante","flotante","corto","sinsigno",
"continua","para","signo","vacio",
"defaulto","vea","piezade","volatil",
"hacer","si","estatico","mientras"};  

    public Identificadores() {
    }

    public String[] getPalabrasReservadas() {
        return palabrasReservadas;
    }
    
 public static void main(String[] args) throws IOException {
      SepararCaracteres s= new SepararCaracteres("C:\\Users\\juan pasillas\\Desktop\\compilador-2016-02-12\\compilador\\src\\archivos\\fichero.txt"," ");
       String cadena[] = s.cadenaSeparada();
          Identificadores ide = new Identificadores();
         String comparador[] = ide.getPalabrasReservadas();
      Pattern pat = Pattern.compile(comparador[1]);
     Matcher mat = pat.matcher(cadena[0]);
     // SepararCaracteres s= new SepararCaracteres("C:\\Users\\usuario\\Desktop\\texto.txt"," ");
       // s.cadenaSeparada();

     if (mat.matches()) {
         System.out.println("SI");
     } else {
         System.out.println("NO");
     }  
        
    }
 
    	
    
}
