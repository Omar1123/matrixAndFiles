/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author jake
 */
public class Vectors {


    private File NUMBERS = new File("/Users/jake/NetBeansProjects/Vectors/src/vectors/values.txt");
    private int content[] = new int[15];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Vectors vector = new Vectors();
            vector.run();
        } catch(Exception ex) {
            
        }
    }
    
    private void run() {
        getNumbersFromFile();
        //orderAsc(content);
        ordenamientoBurbujaDescendente(content);
        getNumbers();
    }
    
    private void getNumbers() {
            
       for (int columna = 0; columna < content.length; columna++) {
            System.out.println(content[columna]);
        }
    }
 
    private void getNumbersFromFile() {
        
        try {            
                
            BufferedReader buffer = new BufferedReader(new FileReader(NUMBERS));                
            String lines;
            int value;

            for (int index = 0; index < content.length; index++) {
                while((lines = buffer.readLine())!= null) {
                    
                    value = Integer.parseInt(lines);

                    content[index] = value;
                    index++;
                }                    
            }
               
                
            buffer.close();
        } catch (Exception ex) {
            /*Captura un posible error y le imprime en pantalla*/ 
            System.out.println(ex.getMessage());
        }
    }
    
    public static void orderInAscMode(int sortarray []){
  
        int temp=0;
 
        for (int index= 0; index < sortarray.length-1; index++) {
            for (int compare = 0; compare< sortarray.length-1; compare++) {   
                
                if (sortarray[compare]<sortarray[compare+1]){
     
                    temp = sortarray[compare];
                    sortarray[compare]=sortarray[compare+1];
                    sortarray[compare+1]=temp;     
                }
            }
        }
    }
    
    public static void orderInDescMode(int sortarray []){
  
        int temp=0;
 
        for (int index= 0; index < sortarray.length-1; index++) {
            for (int compare = 0; compare< sortarray.length-1; compare++) {

                if (sortarray[compare]>sortarray[compare+1]){

                    temp = sortarray[compare];
                    sortarray[compare]=sortarray[compare+1];
                    sortarray[compare+1]=temp;
                }
            }
        }
    }
}
