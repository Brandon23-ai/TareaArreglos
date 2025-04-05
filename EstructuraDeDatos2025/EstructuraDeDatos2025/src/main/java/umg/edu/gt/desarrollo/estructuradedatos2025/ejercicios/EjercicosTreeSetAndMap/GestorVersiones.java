/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios.EjercicosTreeSetAndMap;

import java.util.TreeMap;

/**
 *
 * @author btmor
 */
public class GestorVersiones {
    
    /* EJERCICIO 2: Rastreador de Versiones de Código (TreeMap)
		📜 Descripción: Desarrolle un programa que simule un rastreador de versiones de archivos en un sistema de control de versiones.
		🔹 Instrucciones:
			Utilice un TreeMap<Integer, String>, donde la clave representa el número de versión y el valor es el contenido de esa versión del código.			
			Debe permitir:			
			Agregar una nueva versión con una clave autoincrementada.			
			Obtener una versión específica dada su clave.			
			Obtener la última versión disponible.			
			Eliminar una versión específica si es necesario.
			
			Salida:
				Agregar versión 1: "System.out.println('Hola Mundo');"
				Agregar versión 2: "System.out.println('Hola Java');"
				Última versión: "System.out.println('Hola Java');"
				Versión 1: "System.out.println('Hola Mundo');"

	 * 
     */
    
    private TreeMap<Integer, String> versiones;
    private int contadorVersiones;
    
    public GestorVersiones() {
        versiones = new TreeMap<>();
        contadorVersiones = 0;
    }
    
    //Agregar nueva version
    public void agregarNuevaVersion (String contenido){
        contadorVersiones ++;
        versiones.put(contadorVersiones, contenido);
    }
    
    //Obtener unva version especifica dada su clave
    public String obtenerVersion (int numVersion){
       return versiones.getOrDefault(numVersion, "version no encontrada");
    }
    
    // Retorna el contenido de la última versión
    public String obtenerUltimaVersion() {
        if (versiones.isEmpty()) {
            return "No hay versiones disponibles";
        }
        return versiones.get(versiones.lastKey());
    }

    // Elimina una versión específica
    public boolean eliminarVersion(int numero) {
        return versiones.remove(numero) != null;
    }

    // Devuelve el mapa completo (por si querés recorrerlo)
    public TreeMap<Integer, String> obtenerTodasLasVersiones() {
        return versiones;
    }
}
