package src.nomuunPackage.week2;

public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 9;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("variable of num1 is " + num1 + " variable of num2 is " + num2);
    }
}
