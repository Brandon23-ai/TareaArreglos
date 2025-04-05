/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.EjercicioTree;

import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicosTreeSetAndMap.GestorVersiones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author btmor
 */
public class GestorVersionesTest {
     @Test
    public void testAgregarYObtenerVersion() {
        GestorVersiones gestor = new GestorVersiones();
        gestor.agregarNuevaVersion("System.out.println('Hola Mundo');");
        gestor.agregarNuevaVersion("System.out.println('Hola Java');");

        assertEquals("System.out.println('Hola Mundo');", gestor.obtenerVersion(1));
        assertEquals("System.out.println('Hola Java');", gestor.obtenerVersion(2));
    }

    @Test
    public void testObtenerUltimaVersion() {
        GestorVersiones gestor = new GestorVersiones();
        gestor.agregarNuevaVersion("Primera");
        gestor.agregarNuevaVersion("Segunda");
        assertEquals("Segunda", gestor.obtenerUltimaVersion());
    }

    @Test
    public void testEliminarVersion() {
        GestorVersiones gestor = new GestorVersiones();
        gestor.agregarNuevaVersion("Eliminarme");
        assertTrue(gestor.eliminarVersion(1));
        assertEquals("Versión no encontrada", gestor.obtenerVersion(1));
    }

    @Test
    public void testVersionNoExistente() {
        GestorVersiones gestor = new GestorVersiones();
        assertEquals("Versión no encontrada", gestor.obtenerVersion(99));
    }
    
}
