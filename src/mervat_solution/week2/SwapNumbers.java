package mervat_solution.week2;

public class SwapNumbers {
    public static void main(String[] args) {
        int m = 2;
        int b = 12;

        System.out.println("Before swapping:");
        System.out.println("m = " + m);
        System.out.println("b = " + b);
        m = m+ b;
        b = m - b;
        m = m - b;


        System.out.println("After swapping:");
        System.out.println("m = " + m);
        System.out.println("b = " + b);
    }
}


