/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;

import java.util.Arrays;

/**
 *
 * @author wcordova
 */
public class EjercicioVectores {
    
    public int[] tribonacci(int[] signature, int n) {
        if (n == 0) {
            return new int[0];
        }
        
        if (n <= 3) {
            return Arrays.copyOf(signature, n);
        }
        
        int[] result = new int[n];
        System.arraycopy(signature, 0, result, 0, 3);
        
        for (int i = 3; i < n; i++) {
            result[i] = result[i - 1] + result[i - 2] + result[i - 3];
        }
        
        return result;
    }
    
    public static int findTotal(int[] numbers) {
        int score = 0;
        for (int num : numbers) {
            if (num == 5) {
                score += 5;
            } else if (num % 2 == 0) {
                score += 1;
            } else {
                score += 3;
            }
        }
        return score;
    }
    
    
}
