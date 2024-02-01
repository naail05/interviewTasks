package bashir_solutions.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Task3 {

    public static void main(String[] args) {


        for (int i = 1; i <= 30; i++) {
            if (i% 15==0){
                System.out.print(" FINRA ");
            } else if (i % 3==0) {
                System.out.print(" FIN ");
            } else if (i % 5 ==0) {
                System.out.print(" RA ");

            }else {
                System.out.print(i+"-");
            }

        }


        System.out.println("------------Using-ArrayList--------------");

        List<String> finra = new ArrayList<>();

        for (int j = -20; j <= 100; j++) {
            String result = (j % 15 == 0) ? "FINRA" : (j % 5 == 0) ? "RA" : (j % 3 == 0) ? "FIN" :  String.valueOf(j);
            finra.add(result);
        }
        System.out.println(finra);

        System.out.println("----------------Using Map----------------");
        Map<Integer, String> Finra = new TreeMap<>();

        for (int j = 1; j <= 30; j++) {
            Finra.put(j, (j % 15 == 0) ? "FINRA" : (j % 5 == 0) ? "RA" : (j % 3 == 0) ? "FIN" : String.valueOf(j));
        }

        System.out.println(Finra.values());

        System.out.println("-----------Using Object-----------------");

        for (int j = 1; j < 30; j++) {
            Object result =(j % 15==0)? "FINRA" :(j % 5==0)? "RA" :(j % 3==0 )? "FIN" :j;
            System.out.println(result);

        }


        System.out.println("---------------Calling Methods-----------");

        Finra(17);
        System.out.println(finra(17));

        System.out.println(finra(101));
    }

    public static void Finra(int num){

        if(num>=1 && num<=30){
            if (num % 15==0){
                System.out.println("FINRA");
            }else if(num % 5==0){
                System.out.println("RA");
            }else if (num % 3==0 ){
                System.out.println("FIN");
            }else {
                System.out.println(num);}
        }else{
            System.out.println("Number is out of Range");
        }
    }

    public static Object finra(int num){
        return (num % 15==0)? "FINRA" :(num % 5==0)? "RA" :(num % 3==0 )? "FIN" : num;
    }




}
