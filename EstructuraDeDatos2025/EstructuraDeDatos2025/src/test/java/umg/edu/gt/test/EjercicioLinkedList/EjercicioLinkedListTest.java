/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.EjercicioLinkedList;

import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.Arrays;
/**
 *
 * @author btmor
 */
public class EjercicioLinkedListTest {
    
    @Test
    void testEliminarDuplicados() {
        
        LinkedList<Integer> lista = new LinkedList<>(Arrays.asList(1, 2, 3, 2, 4, 1));
        LinkedList<Integer> esperado = new LinkedList<>(Arrays.asList(1, 2, 3, 4));

        EjercicioLinkedList.eliminarDuplicados(lista);
        assertEquals(esperado, lista);
    }

    @Test
    void testInvertirListaFailed() {
        LinkedList<String> lista = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        LinkedList<String> esperado = new LinkedList<>(Arrays.asList("A", "A", "A", "A", "A"));

        EjercicioLinkedList.invertirLista(lista);
        assertEquals(esperado, lista);
    }

    @Test
    void testIntercalarListas() {
        LinkedList<Integer> lista1 = new LinkedList<>(Arrays.asList(1, 3, 5));
        LinkedList<Integer> lista2 = new LinkedList<>(Arrays.asList(2, 4, 6));
        LinkedList<Integer> esperado = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        LinkedList<Integer> resultado = EjercicioLinkedList.intercalarListas(lista1, lista2);
        assertEquals(esperado, resultado);
    }
    
}
