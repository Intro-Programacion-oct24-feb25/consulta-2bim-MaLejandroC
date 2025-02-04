/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_java;
/**
 *
 * @author Alejandro
 */
public class Ejemplo_java {

    // Función recursiva para calcular el factorial
    public static int factorial(int n) {
        if (n == 0) { // Caso base
            return 1;
        } else { // Caso recursivo
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
    }
}
    
    

