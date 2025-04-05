/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicosTreeSetAndMap;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.TreeSet;
/**
 *
 * @author btmor
 */
public class GestorEventos {
     /**
     * EJERCICIO 3: Sistema de Gestión de Eventos (TreeSet) 📜 Descripción:
     * Implemente un sistema para administrar eventos ordenados
     * cronológicamente. 🔹 Instrucciones: Utilice un TreeSet<Evento>, donde
     * cada Evento debe contener: fecha (LocalDateTime) nombre (String)
     * ubicación (String) Los eventos deben ordenarse automáticamente por fecha
     * y hora. Debe permitir: Agregar un nuevo evento. Mostrar la lista de
     * eventos en orden cronológico. Obtener el próximo evento a ocurrir.
     * Eliminar un evento pasado automáticamente después de una consulta.
     *
     * Salida: Próximo evento: "Conferencia de Java", 2025-05-10 10:00,
     * Auditorio A Lista de eventos: 1. "Taller de Machine Learning", 2025-04-15
     * 14:00, Sala 3 2. "Conferencia de Java", 2025-05-10 10:00, Auditorio A      *
     */
    
    private TreeSet<Evento> eventos;

    public GestorEventos() {
        eventos = new TreeSet<>();
    }

    // Agregar evento
    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    // Obtener próximo evento
    public Evento obtenerProximoEvento() {
        eliminarEventosPasados(); // Limpieza automática
        return eventos.isEmpty() ? null : eventos.first();
    }

    // Mostrar lista de eventos
    public void mostrarEventos() {
        eliminarEventosPasados();
        System.out.println("Lista de eventos:");
        int i = 1;
        for (Evento e : eventos) {
            System.out.println(i++ + ". " + e);
        }
    }

    // Eliminar eventos pasados
    private void eliminarEventosPasados() {
        Iterator<Evento> it = eventos.iterator();
        LocalDateTime ahora = LocalDateTime.now();
        while (it.hasNext()) {
            if (it.next().getFecha().isBefore(ahora)) {
                it.remove();
            }
        }
    }

    public TreeSet<Evento> getEventos() {
        return eventos;
    }
    
}
