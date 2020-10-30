/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo05;
import java.util.Scanner;
/**
 *
 * @author Gerardo Fac
 */
public class Cuadrado {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in); 
        int n,i,j;
                System.out.println("ingrese el valor de a");
                n = T.nextInt();
                
                for(i=1; i<=n ;i++){
                for(j=0;j<n;j++){
                    System.out.print("* ");
                }
                    System.out.println("");
                }
    }
}
