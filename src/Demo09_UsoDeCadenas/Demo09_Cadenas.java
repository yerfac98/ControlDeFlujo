/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo09_UsoDeCadenas;

import java.util.Scanner;

/**
 *
 * @author Gerardo Fac
 */
public class Demo09_Cadenas {

    public static void main(String[] args) {
        // Variable de tipo cadena
        String cadena = "Hola a todos";
        String otraCadena = " ¿Cómo están?";
        // Obtiene la longitud de la cadena
        System.out.println("Número de caracteres: " + cadena.length());
        // Obtiene una subcadena
        System.out.println("Subcadena: " + cadena.substring(7, 12));
        // Concatenación de cadenas
        String concatenando = cadena.concat(otraCadena);
        System.out.println("Concatenación: " + concatenando);
        // Otra forma de concatenación
        String concatenar = cadena + otraCadena + " Excelente, bueno no es cierto, sinceramente con un poco de sueño";
        System.out.println("Concatenación 2: " + concatenar);

        // Uso del método charAt(int index)
        String texto = "My text";
        System.out.println("Caracter: " + texto.charAt(1));
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
        System.out.println("");
        // Uso del metodo compareTo(Object o)
        String str1 = "Las cadenas son inmutables";
        String str2 = "Las cadenas son inmutables";
        String str3 = "Los enteros no son inmutables";

        int restulado1 = str1.compareTo(str2);
        System.out.println(restulado1);
        int resultado2 = str3.compareTo(str1);
        System.out.println(resultado2);

        // Uso del método compareToIgnoreCase(str)
        int r1 = str1.compareToIgnoreCase(str2);
        int r2 = str2.compareToIgnoreCase(str3);
        int r3 = str3.compareToIgnoreCase(str1);
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        // Uso el método endsWith(String suffix)
        String urlfile = "/home/manuel/Escritorio/datos.pdf";
        boolean band = urlfile.endsWith(".txt");
        System.out.println("¿El nombre del archivo finaliza con .txt? " + band);

        // Uso del método equals(String str);
        boolean igual = str1.equals(str2);
        System.out.println("¿Son cadenas iguales?: " + igual);

        // Uso del método indexOf(...)
        String str = "Fundamentos de programación";
        String substr1 = new String("programación");
        String substr2 = new String("jprogramación");

        System.out.print("Índice encontrado:");
        System.out.println(str.indexOf('t'));
        System.out.print("Índice encontrado:");
        System.out.println(str.indexOf('t', 5));
        System.out.print("Índice encontrado:");
        System.out.println(str.indexOf(substr1));
        System.out.print("Índice encontrado:");
        System.out.println(str.indexOf(substr2));

        // Uso del método toLowerCase()
        String info = "Uso de Métodos de la CLASE String";
        System.out.println("Todo a minúscula: " + info.toLowerCase());

        // Uso de método toUpperCase()
        System.out.println("Todo a mayúscula: " + info.toUpperCase());
        System.out.println("");

        // Uso del métofdo toCharArray()
        String nombre = "Karla";
        char arrayChar[] = nombre.toCharArray();
        System.out.println("Tamaño del arreglo: " + arrayChar.length);
        System.out.println("i ==> Caracter");
        for (int i = 0; i < arrayChar.length; i++) {
            System.out.println(i + " ==> " + arrayChar[i]);
        }
        System.out.println("");

    }
}
