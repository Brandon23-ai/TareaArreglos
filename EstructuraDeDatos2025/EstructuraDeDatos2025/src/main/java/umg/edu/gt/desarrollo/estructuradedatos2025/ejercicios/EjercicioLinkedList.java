/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author btmor
 */
public class EjercicioLinkedList {
    
    /** INSTRUCCIONES
 	Escriba el algoritmo que resuelve el problema en esta clase.
	Debe crear un package llamado umg.edu.gt.test.EjercicioLinkedList que corresponda al Test de esta clase.
	Genere un Test por cada ejemplo y fuerce que uno de esos Test falle, puede implementar retornar un resultado
	y compararlo con el esperado.
	 */
	
	// Usando LinkedList de Java Collections, resuelva los siguientes problemas
	// Problema 1: Dada una LinkedList<Integer>, escribir un método que elimine los valores duplicados, dejando solo la primera aparición de cada número.
	// Problema 2: Implementar un método que invierta los elementos de una LinkedList<String> sin usar otra lista o ArrayList.
	// Problema 3: Dadas dos listas enlazadas ordenadas de enteros, escribir un método que devuelva una nueva LinkedList<Integer> con los elementos de ambas listas intercalados en orden
    
        public static void eliminarDuplicados(LinkedList<Integer> lista) {
            HashSet<Integer> seen = new HashSet<>();
            lista.removeIf(n -> !seen.add(n));
            
        }
        
        public static void invertirLista(LinkedList<String> lista) {
            ListIterator<String> itInicio = lista.listIterator();
            ListIterator<String> itFin = lista.listIterator(lista.size());

            int n = lista.size() / 2; 
            for (int i = 0; i < n; i++) {
                String temp = itInicio.next();
                itInicio.set(itFin.previous());
                itFin.set(temp);
            }
        }
    
        
        public static LinkedList<Integer> intercalarListas(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {
            LinkedList<Integer> resultado = new LinkedList<>();
            ListIterator<Integer> it1 = lista1.listIterator();
            ListIterator<Integer> it2 = lista2.listIterator();

            while (it1.hasNext() && it2.hasNext()) {
                int num1 = it1.next();
                int num2 = it2.next();

                if (num1 <= num2) {
                    resultado.add(num1);
                    it2.previous(); 
                } else {
                    resultado.add(num2);
                    it1.previous(); 
                }
            }
        
            while (it1.hasNext()) resultado.add(it1.next());
            while (it2.hasNext()) resultado.add(it2.next());

            return resultado;
        }
    
    
}
