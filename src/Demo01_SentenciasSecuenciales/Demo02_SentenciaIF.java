/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo01_SentenciasSecuenciales;
import java.util.Scanner;
/**
 *
 * @author Gerardo Fac
 */
public class Demo02_SentenciaIF{
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        
        String nombre;
        System.out.println("Ingrese su nombre: ");
        
       nombre = entrada.nextLine();
       //equalsIgnoreCase(nombre) es para que pueda leer todas las mayusculas y minusculas
       //toUpperCase() los convierte a mayusculas
       //toLowerCase() los convierte a minusculas
        if ("gustavo".equalsIgnoreCase(nombre)){
            //out da la salida de dato
        System.out.println("hola "+ nombre.toUpperCase());    
    }
        else{
            //err marca en color rojo la salida por error
            System.err.println("introduce tu nombre real");
        }
    }
}
