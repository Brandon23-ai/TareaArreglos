/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.edu.gt.desarrollo.estructuradedatos2025;

import java.util.Arrays;
import umg.edu.gt.desarrollo.estructuradedatos2025.clases.ClaseVectores;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioVectores;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author wcordova
 */


public class EstructuraDeDatos2025 {
    private static final Logger logger = LogManager.getLogger(EstructuraDeDatos2025.class);
    
    
    public static void main(String[] args) {

        
        ///////////////////////////////////
        logger.info("Ejecutando la aplicación...");

        int[][] cuentas = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int maxRiqueza = EjercicioArrays.riquezaCliente(cuentas);
        logger.info("El cliente con mayor riqueza tiene: {}", maxRiqueza);
        
        
        ///////////////////////////////////
        //logger.info("Ejecutando metodo Ordenar matrices...");
        int[][] mat = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };

       
        EjercicioArrays.imprimirMatriz(mat);
        //logger.info("Matriz original contiene: {}", mat);

        int[][] matrizOrdenada = EjercicioArrays.ordenarMatriz(mat);

        EjercicioArrays.imprimirMatriz(matrizOrdenada);
        //logger.info("Matriz ordenada: {}", matrizOrdenada);
        
        
        ///////////////////////////////////
        
        int[] [] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        System.out.println(EjercicioArrays.sumarElementosMatriz(matriz));
        
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
