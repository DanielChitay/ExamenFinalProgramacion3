/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.beesion.ms.test.service;

/**
 *
 * @author rodol
 */
public class FibonacciGenerator {
    
    public static int[] generate(int[] signature, int n) {
        // Caso especial: si n es 0, retornar arreglo vacío
        if (n == 0) {
            return new int[0];
        }

        int[] result = new int[n];
        

        for (int i = 0; i < Math.min(signature.length, n); i++) {
            result[i] = signature[i];
        }

        if (n > signature.length) {
            for (int i = signature.length; i < n; i++) {
                result[i] = result[i-1] + result[i-2];
            }
        }
        
        return result;
    }
}