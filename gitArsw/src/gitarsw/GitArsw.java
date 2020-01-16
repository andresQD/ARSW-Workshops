/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitarsw;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 2131381
 */
public class GitArsw {
    
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        String cadena1;
        String minCadena1;
        String cadena2;
        String minCadena2;
        Scanner objt = new Scanner (System.in); 
        System.out.println("Ingrese la cadena 1: ");
       
        cadena1 = objt.nextLine();
        //System.out.println ("La cadena 1 es: " + cadena1);
        
        Scanner objt1 = new Scanner (System.in); 
        System.out.println("Ingrese la cadena 2: ");
       
        cadena2 = objt.nextLine();
        //System.out.println ("La cadena 1 es: " + cadena2);
        
        minCadena1 = cadena1.toLowerCase();
        minCadena2 = cadena2.toLowerCase();
        
        char a [] = new char [minCadena1.length()];
        
        for ( int i = 0; i<minCadena1.length(); i++){
            a[i]=minCadena1.charAt(i);
        }
        Arrays.sort(a);
        for (int i = 0; i<minCadena1.length(); i++){
            
            //System.out.println(a[i]);
        }
        char b [] = new char [minCadena2.length()];
        for ( int i = 0; i<minCadena2.length(); i++){
            b[i]=minCadena2.charAt(i);
        }
        Arrays.sort(b);
        for (int i = 0; i<minCadena2.length(); i++){
            
            //System.out.println(a[i]);
        }
        //System.out.println(a);
        //System.out.println(b);
           
        if (Arrays.equals(b, a)){
            System.out.println("Anagrams");
            
        } else {
           System.out.println("Not Anagram");
        }
    }
}
