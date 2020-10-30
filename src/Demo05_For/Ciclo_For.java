/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo05_For;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class Ciclo_For {

    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        int b;

        System.out.println("ingresa 1 para serie numerica de 1 al 10 y 2 para cuadrado de *");
        b = T.nextInt();

        switch (b) {
            case 1:
                /**
                 * for(inicializacion;expresion condicional;expresion de
                 * incremento/declaracion;){ sentencias }
                 */
                int a = 1;
                for (a = 1; a <= 10; a++) {
                    System.out.println(a);
                }
                break;
            case 2:
                int n,
                 i,
                 j;
                System.out.println("ingrese el valor de n");
                n = T.nextInt();

                for (i = 1; i <= n; i++) {
                    for (j = 0; j < n; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
        }
    }
}
