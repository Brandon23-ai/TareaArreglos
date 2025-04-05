/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.test.EjercicioTree;
import umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicosTreeSetAndMap.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author btmor
 */
public class GestorEventosTest {
     @Test
    public void testAgregarYProximoEvento() {
        GestorEventos gestor = new GestorEventos();

        Evento evento1 = new Evento(LocalDateTime.of(2025, 5, 10, 10, 0), "Conferencia de Java", "Auditorio A");
        Evento evento2 = new Evento(LocalDateTime.of(2025, 4, 15, 14, 0), "Taller de Machine Learning", "Sala 3");

        gestor.agregarEvento(evento1);
        gestor.agregarEvento(evento2);

        Evento proximo = gestor.obtenerProximoEvento();
        assertEquals("Taller de Machine Learning", proximo.getNombre());
    }

    @Test
    public void testEliminarEventosPasados() {
        GestorEventos gestor = new GestorEventos();

        Evento pasado = new Evento(LocalDateTime.of(2020, 1, 1, 10, 0), "Viejo Evento", "Salón viejo");
        Evento futuro = new Evento(LocalDateTime.now().plusDays(1), "Evento Futuro", "Salón nuevo");

        gestor.agregarEvento(pasado);
        gestor.agregarEvento(futuro);

        Evento proximo = gestor.obtenerProximoEvento();
        assertEquals("Evento Futuro", proximo.getNombre());
        assertEquals(1, gestor.getEventos().size());
    }
    
}
