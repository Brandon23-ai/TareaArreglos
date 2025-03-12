/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.ClaseArrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicioArrays;
/**
 *
 * @author btmor
 */
public class EjercicioArraysTest {
    
    @DisplayName("")
    
    @Test
    public void testRiquezaCliente(){
        
        EjercicioArrays Ej1 = new EjercicioArrays();

        int[][] cuentas1 = { {1, 2, 3}, {3, 2, 1} };
        int[][] cuentas2 = { {1, 5}, {7, 3}, {3, 5} };
        Ej1.riquezaCliente(cuentas1); 
        var totalCuenta = Ej1.riquezaCliente(cuentas1);
        Ej1.riquezaCliente(cuentas2);
        
        assertEquals(6, totalCuenta);
       
    }
    
    
    @Test
    void testMatrizVacia() {
        EjercicioArrays Ej1 = new EjercicioArrays();

        int[][] cuentas = {}; // Matriz vacía

        // Se espera que lance una excepción porque no hay clientes
        assertThrows(IllegalArgumentException.class, () -> {
            Ej1.riquezaCliente(cuentas);
        });
    }
    
    //@Test
    //public void testMatrizOrdenada (){
        //EjercicioArrays Ej1 = new EjercicioArrays();

        //int[][] entrada = {
            //{3, 3, 1, 1},
            //{2, 2, 1, 2},
            //{1, 1, 1, 2}
        //};
        
        //int[][] esperado = {
            //{1, 1, 1, 2},
            //{1, 2, 2, 2},
            //{1, 1, 3, 3}
        //};
        
        //int[][] resultado = Ej1.ordenarMatriz(entrada);
        
        //assertArrayEquals(esperado, resultado);
        
    //}
    
    @Test
    void testOrdenarMatriz() {
        EjercicioArrays Ej1 = new EjercicioArrays();
        int[][] entrada = {
            {3, 3, 1, 1},
            {2, 2, 1, 2},
            {1, 1, 1, 2}
        };

        int[][] esperado = {
            {1, 1, 1, 2},
            {1, 2, 2, 2},
            {1, 1, 3, 3}
        };

        int[][] resultado = Ej1.ordenarMatriz(entrada); 

        // Comparar matrices fila por fila
        for (int i = 0; i < esperado.length; i++) {
            assertArrayEquals(esperado[i], resultado[i], "La fila " + i + " no coincide");
        }
    }
    
    @Test
    public void testSumarElementosMatriz() {
        EjercicioArrays Ej1 = new EjercicioArrays();

        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int resultadoEsperado = 45;
        int resultadoActual = Ej1.sumarElementosMatriz(mat);
        
        assertEquals(resultadoEsperado, resultadoActual, "La suma de los elementos de la matriz es incorrecta.");
       
    }
    
    
    
}
