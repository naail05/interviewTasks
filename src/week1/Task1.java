package week1;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(EvenOrOdd(0.0));
        System.out.println(EvenOdd(13));
        System.out.println(EvenOROdd(13));


    }

    public static String EvenOrOdd(double num) {

        String result = "";
        if (num != 0) {
            if (num % 2 == 0) {
                result = "Even";
            } else {
                result = "Odd";
            }

        } else {
            result = "Given digit is zero";
        }
        return result;


    }


    public static String EvenOROdd(int num2) {
        String result1 = "";
        if (num2 != 0) {
            switch (num2 % 2) {

                case 0:
                    result1 = "Even";
                    break;

                case 1:
                    result1 = "Odd";
                    break;
            }
        } else {
            result1 = "Zero";
        }
        return result1;

    }

    public static String EvenOdd(double num1) {
        return (num1 == 0) ? "Zero" : (num1 != 0 && num1 % 2 == 0) ? "Even" : "Odd";
    }

}
/*

write a method which can identify aa given number if it even or odd
Ex:
    identify(5) -> "Odd"
    identify(6) -> "Even"
 */