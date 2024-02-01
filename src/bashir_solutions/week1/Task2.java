package bashir_solutions.week1;

public class Task2 {

    public static void main(String[] args) {
        divideNums(250, 0);
        divideNums(240, 5);
        divideNumbers(20, 10);
        divide(240, 5);

    }
    //using assumptions
    public static void divide(int a, int b){
        //assume b (divisor is not zero) and a (dividend is larger/bigger number than b (divisor)
        int count = 0;
        int aStart = a;
        while(a>=b) {
            a -=b;
            count++;
        }
        System.out.println(aStart + " divided by "+b +" is "+count+ " with "+ a+ " reminder");
    }


//using error message

    public static void divideNums(int a, int b){
        int count = 0;
        int aStart = a;
        if (b==0){
            System.err.println("Divisor can not be zero");
        }else if (a<b){
            System.err.println(" Dividend is smaller than divisor, so can not be fully divided");}else{

            while(a>=b) {
                a -=b;
                count++;

            }
            System.out.println(aStart + " divided by "+b +" is "+count+ " with "+ a+ " reminder");
        }}


//using exceptions

    public static void divideNumbers(int a, int b){
        int count1 = 0;
        int aStart = a;
        if (b==0){
            throw new ArithmeticException();
        }else if (a<b){
            throw  new SmallerDividendException(" Dividend is smaller than divisor, so can not be fully divided");}else{

            while(a>=b) {
                a -=b;
                count1++;

            }
            System.out.println(aStart + " divided by "+b +" is "+count1+ " with "+ a+ " reminder");
        }}

}
