/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestEjercicios;

/**
 *
 * @author rodol
 */
import com.beesion.ms.test.service.FibonacciGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonacciGeneratorTest {
    
    @Test
    public void testStandardFibonacci() {
        int[] result = FibonacciGenerator.generate(new int[]{0, 1}, 9);
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21}, result);
    }
    
    @Test
    public void testCustomSignature() {
        int[] result = FibonacciGenerator.generate(new int[]{2, 3}, 5);
        assertArrayEquals(new int[]{2, 3, 5, 8, 13}, result);
    }
    
    @Test
    public void testZeroElements() {
        int[] result = FibonacciGenerator.generate(new int[]{0, 1}, 0);
        assertArrayEquals(new int[0], result);
    }
    
    @Test
    public void testOneElement() {
        int[] result = FibonacciGenerator.generate(new int[]{0, 1}, 1);
        assertArrayEquals(new int[]{0}, result);
    }
    
    @Test
    public void testTwoElements() {
        int[] result = FibonacciGenerator.generate(new int[]{5, 7}, 2);
        assertArrayEquals(new int[]{5, 7}, result);
    }
    
    @Test
    public void testLargeN() {
        int[] result = FibonacciGenerator.generate(new int[]{0, 1}, 15);
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377}, result);
    }
    
    @Test
    public void testDifferentInitialValues() {
        int[] result = FibonacciGenerator.generate(new int[]{1, 1}, 8);
        assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8, 13, 21}, result);
    }
}