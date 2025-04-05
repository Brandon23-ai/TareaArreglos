/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.EjercicioTree;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicosTreeSetAndMap.AnalizadorFrecuenciaPalabras;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.TreeMap;
/**
 *
 * @author btmor
 */
public class AnalizadorFrecuenciaPalabrasTest {
    
        @Test
    public void testContarPalabras() {
        // Crear archivo temporal con contenido de prueba
        File archivoPrueba = null;
        try {
            archivoPrueba = File.createTempFile("prueba", ".txt");
            FileWriter writer = new FileWriter(archivoPrueba);
            writer.write("Hola mundo, hola Java. Mundo!");
            writer.close();

            // Ejecutar el método
            TreeMap<String, Integer> resultado = AnalizadorFrecuenciaPalabras .contarPalabras(archivoPrueba.getAbsolutePath());

            // Verificaciones
            assertEquals(2, resultado.get("hola"));
            assertEquals(2, resultado.get("mundo"));
            assertEquals(1, resultado.get("java"));

        } catch (IOException e) {
            fail("No se pudo crear el archivo de prueba: " + e.getMessage());
        } finally {
            if (archivoPrueba != null && archivoPrueba.exists()) {
                archivoPrueba.delete(); // Eliminar archivo temporal después del test
            }
        }
    }
    
}
