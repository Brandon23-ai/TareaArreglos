/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.edu.gt.desarrollo.estructuradedatos2025;

import java.util.Arrays;
import umg.edu.gt.desarrollo.estructuradedatos2025.clases.ClaseVectores;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioVectores;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays;

/**
 *
 * @author wcordova
 */
public class EstructuraDeDatos2025 {

    public static void main(String[] args) {
        ///////////////////////////////////
        EjercicioArrays Ej1 = new EjercicioArrays();
        
        int[][] cuentas1 = { {1, 2, 3}, {3, 2, 1} };
        int[][] cuentas2 = { {1, 5}, {7, 3}, {3, 5} };
        int[][] cuentas3 = { {2, 8, 7}, {7, 1, 3}, {1, 9, 5} };

        System.out.println(Ej1.riquezaCliente(cuentas1)); 
        System.out.println(Ej1.riquezaCliente(cuentas2)); 
        System.out.println(Ej1.riquezaCliente(cuentas3)); 
        
        
        ///////////////////////////////////
        int[][] mat = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };

        System.out.println("Matriz original:");
        Ej1.imprimirMatriz(mat);

        int[][] matrizOrdenada = Ej1.ordenarMatriz(mat);

        System.out.println("\nMatriz ordenada diagonalmente:");
        Ej1.imprimirMatriz(matrizOrdenada);
        
        ///////////////////////////////////
        
        int[] [] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        System.out.println("\nSumatoria: ");
        System.out.println(Ej1.sumarElementosMatriz(matriz));
        
    }
    
    
    public static void testTribonacci() {  
        EjercicioVectores ejercicio1 = new EjercicioVectores();
        int[] signature = {0, 0, 1};
        int n = 9;
        System.out.println(Arrays.toString(ejercicio1.tribonacci(signature, n)));
    }
    
    public static void testFindTotal() { 
        EjercicioVectores ejercicio1 = new EjercicioVectores();
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {17, 19, 21};
        int[] numbers3 = {5, 5, 5};
        
        System.out.println("Puntuación: " + ejercicio1.findTotal(numbers1));
        System.out.println("Puntuación: " + ejercicio1.findTotal(numbers2));
        System.out.println("Puntuación: " + ejercicio1.findTotal(numbers3));
    }
    
    
}
