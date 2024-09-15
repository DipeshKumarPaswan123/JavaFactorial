package com.anonymous.p1;

/**
 * Factorial of n number.
 *
 * @author DIPESH
 * @date 9/9/2024
 */
public class Factorial {
    public static int factorial(int n) {
        int f = 1;
        for(int i = 1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int add(int a, int b) {
        int add = a + b;
        return add;
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));

//        Factorial fac = new Factorial();
        System.out.println(add(10,5));
        System.out.println(add(10.9,5.1));
    }


}
