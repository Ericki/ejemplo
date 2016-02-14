/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Alumno
 */
public class LeerFichero {
private String cadena;
  
public  static String muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        String s = "";
                
        int x=0;
        char letra[] = null;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
       
     while((cadena = b.readLine())!=null) {
          
            s=s+" "+cadena;
        }
     
       System.out.println(s);
        b.close();
        return s;
    }
   

}
