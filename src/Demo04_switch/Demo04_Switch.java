/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo04_switch;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
/**
 * crear un programa que dado un numero entre uno y 7 imprima el dia de la
 * semana por ejemplo ingrese un numero debe mostrar o imprimir el dia martes si
 * escribe cualquier si el niumero es diferente a 1 a 7 debe enviar un mensaje
 * al usuario "error numero incorrecto ingresado debe ingresar entre 1 al 7"
 */
public class Demo04_Switch {

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        int n;
        
        System.out.println("ingresa un numero entre 1 y 12");
        n = T.nextInt();

        switch (n) {

            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;

            default:
                System.out.println("Error: numero incorrecto" + "\n introdusca un numero entre 1 al 12");
        }
    }
}
