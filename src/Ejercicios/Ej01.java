/*
 Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author SDMok
 */
public class Ej01 {

    
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese el primer número");
        int numero1 = scanner.nextInt();
                
        System.out.println("Por favor ingrese el segundo número");
        int numero2 = scanner.nextInt();
        
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        double resto = numero1 % numero2;
        
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicacion es " + multiplicacion);
        System.out.println("El resultado de la division es " + division);
        System.out.println("El rest es " + resto);
             
    }   
    }
    

