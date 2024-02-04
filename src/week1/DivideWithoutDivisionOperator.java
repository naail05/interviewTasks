package week1;

public class DivideWithoutDivisionOperator {

    public static void main(String[] args) {
     divide(10,2);
     divide(6,2);
     divide(9,3);
    }

   public static void divide(int n1, int n2 ){

        if(n2 == 0){
            System.out.println("Can not divide by zero");
            return;
        }

        int count = 0;
        String result = n1 + "/" + n2 + " is ";
        while(n1 >= n2){
            count++;
            n1 -= n2;
        }
       System.out.println(result + count);
   }

}
