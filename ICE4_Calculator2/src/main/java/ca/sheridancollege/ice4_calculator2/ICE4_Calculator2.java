/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ca.sheridancollege.ice4_calculator2;

/**
 *
 * @author navro
 */
public class ICE4_Calculator2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return (double) a / b;
    }
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
