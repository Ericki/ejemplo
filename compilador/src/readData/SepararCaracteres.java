/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package readData;

import java.io.IOException;
import java.util.StringTokenizer;
import static readData.LeerFichero.muestraContenido;

/**
 *
 * @author Alumno
 */
public class SepararCaracteres {
private String[] almacenCaracteres; 
private  int num=20;
private String archivo;
private String dato;
    public SepararCaracteres(String archivo,String dato) throws IOException {
        this.archivo=archivo;
        this.dato=dato;
        
    }
    public String[] cadenaSeparada( ) throws IOException{
       // int n = contadorFrases();
        String [] almacenCaracteres = new String[10] ;
        int x=0;
        StringTokenizer st = new StringTokenizer( muestraContenido(this.archivo), this.dato); 
        while(st.hasMoreTokens()){
            almacenCaracteres[x]=st.nextToken();
         //System.out.println(almacenCaracteres[x]);   
         
         x++;
        }
         String [] almacenCaracteresC=new String [x];
         int o=0;
        for(int i = 0;i<x;i++){
            
       almacenCaracteresC[i]=almacenCaracteres[i];
         System.out.println(almacenCaracteresC[i]);
         // almacenCaracteresC[o]=almacenCaracteres[i];
        }
        return almacenCaracteresC;
    }
     
   public static void main(String[] args) throws IOException {
        SepararCaracteres s= new SepararCaracteres("C:\\Users\\juan pasillas\\Desktop\\compilador-2016-02-12\\compilador\\src\\archivos\\fichero.txt"," ");
        s.cadenaSeparada();
    }
}
 