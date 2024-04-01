/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaclase2;

/**
 *
 * @author amito
 */
public class JavaClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final float PI = 3.141592f;
        
        //Datos del cilindro 1
        float radioCilindro1 = 4.0f;
        float alturaCilindro1 = 2.5f;
        float areaCilindro1;
        
        //Datos del cilindro 2
        float radioCilindro2 = 2.0f;
        float alturaCilindro2 = 5.0f;
        float areaCilindro2;
        
        areaCilindro1 = 2.0f*PI*(radioCilindro1*alturaCilindro1 + (float)Math.pow((float)radioCilindro1,2.0));
        areaCilindro2 = 2.0f*PI*(radioCilindro2*alturaCilindro2 + (float)Math.pow((float)radioCilindro2,2.0));
        
        System.out.println("El area del cilindro 1 es: "+areaCilindro1+ "metros cuadrados");
        System.out.println("El area del cilindro 2 es: "+areaCilindro2+ "metros cuadrados");
    }
    
}
