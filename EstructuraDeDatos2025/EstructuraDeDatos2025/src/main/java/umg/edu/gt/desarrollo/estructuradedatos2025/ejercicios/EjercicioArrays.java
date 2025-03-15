package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EjercicioArrays {
    private static final Logger logger = LogManager.getLogger(EjercicioArrays.class);
	
	/** INSTRUCCIONES
	 	Escriba el algoritmo que resuelve el problema en esta clase.
		Debe crear un package llamado umg.edu.gt.test.ClaseArrays que corresponda al Test de esta clase.
		Genere un Test por cada ejemplo y fuerce que uno de esos Test falle, puede implementar retornar un resultado
		y compararlo con el esperado.
	 */

    
        public static int riquezaCliente(int[][] cuentas){
             logger.info("Iniciando cálculo de riqueza...");

            int maxRiqueza = 0;
            for (int i = 0; i < cuentas.length; i++) {
                int riquezaCliente = 0;
                for (int banco : cuentas[i]) {
                    riquezaCliente += banco;
                }
                logger.debug("Cliente {}: Riqueza = {}", i, riquezaCliente);
                maxRiqueza = Math.max(maxRiqueza, riquezaCliente);
            }

            logger.info("Riqueza máxima encontrada: {}", maxRiqueza);
            return maxRiqueza;
        }    
    

        public static int[][] ordenarMatriz(int[][] mat) {
            logger.info("Iniciando ordenamiento de la matriz. . .");
            
            int m = mat.length;    // Filas
            int n = mat[0].length; // Columnas

            // Ordenar todas las diagonales que comienzan en la primera fila
            for (int j = 0; j < n; j++) {
                logger.debug("Ordenando diagonal que comienza en (0,{})",j);
                
                ordenarDiagonal(mat, 0, j, m, n);
            }

            // Ordenar todas las diagonales que comienzan en la primera columna (evitar [0,0] que ya fue ordenada)
            for (int i = 1; i < m; i++) {
                logger.debug("Ordenando diagonal que comienza en ({},0)",i);
                ordenarDiagonal(mat, i, 0, m, n);
            }
            logger.info("Matriz ordenada correctamente.");
            return mat; // Retornar la matriz ordenada
        }
        
        
        private static void ordenarDiagonal(int[][] mat, int i, int j, int m, int n) {
            List<Integer> diagonal = new ArrayList<>();
            int x = i, y = j;

            // Extraer los elementos de la diagonal
            while (x < m && y < n) {
                diagonal.add(mat[x][y]);
                x++;
                y++;
            }

            // Ordenar la diagonal
            Collections.sort(diagonal);

            // Colocar los elementos ordenados de vuelta en la matriz
            x = i;
            y = j;
            int index = 0;
            while (x < m && y < n) {
                mat[x][y] = diagonal.get(index++);
                x++;
                y++;
            }
            logger.debug("Diagonal comenzando en ({},{}) ordenada.", i, j); 
        }
        
        // Método para imprimir la matriz
        public static void imprimirMatriz(int[][] mat) {
            logger.info("Imprimiendo matriz...");
            for (int[] fila : mat) {
                System.out.println(Arrays.toString(fila));
            }
            logger.info("Matriz impresa.");

        }
     
	
    public static int sumarElementosMatriz(int[][] mat) {
        logger.info("Iniciando la suma de los elementos de la matriz...");

        int suma = 0;
        for (int[] fila : mat) {
            for (int num : fila) {
                suma += num;
            }
        }
        logger.info("Suma total de los elementos: {}",suma);
        return suma;
    }


}
