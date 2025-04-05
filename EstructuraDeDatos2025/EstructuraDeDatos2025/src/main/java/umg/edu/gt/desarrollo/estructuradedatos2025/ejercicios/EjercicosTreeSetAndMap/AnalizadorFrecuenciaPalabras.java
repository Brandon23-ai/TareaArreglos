/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicosTreeSetAndMap;

import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author btmor
 */
public class AnalizadorFrecuenciaPalabras {

    /**
     * INSTRUCCIONES Escriba el algoritmo que resuelve el problema en esta
     * clase. Debe crear un package llamado umg.edu.gt.test.EjercicioTree que
     * corresponda al Test de esta clase. Genere un Test por cada ejemplo y
     * fuerce que uno de esos Test falle, puede implementar retornar un
     * resultado y compararlo con el esperado.
     */

    /* EJERCICIO 1: Análisis de Frecuencia de Palabras (TreeMap)
	 * 📜 Descripción: Escriba un programa que lea un texto de un archivo y cuente la frecuencia de cada palabra, ordenándolas alfabéticamente.
		🔹 Instrucciones:
			Leer un archivo de texto (.txt).			
			Dividir el texto en palabras (ignorando puntuaciones y convirtiéndolas a minúsculas).
			Almacenar cada palabra en un TreeMap<String, Integer>, donde la clave es la palabra y el valor es el número de veces que aparece.
			Imprimir las palabras en orden alfabético junto con su frecuencia.
     */
    
    public static TreeMap<String, Integer> contarPalabras(String rutaArchivo) {
        TreeMap<String, Integer> frecuenciaPalabras = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                // Convertir a minúsculas y eliminar puntuaciones (dejando solo letras y espacios)
                linea = linea.toLowerCase().replaceAll("[^a-zA-Z ]", " ");
                String[] palabras = linea.split("\\s+"); // Dividir en palabras usando espacios

                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) { // Evitar agregar palabras vacías
                        frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return frecuenciaPalabras;
    }

    public static void imprimirFrecuencia(TreeMap<String, Integer> frecuencia) {
        System.out.println("Frecuencia de palabras en el archivo:");
        for (var entry : frecuencia.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }    
 
}
