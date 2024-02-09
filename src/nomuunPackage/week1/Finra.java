package src.nomuunPackage.week1;

public class Finra {
    public static void finra(int number){
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0){
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else if (i % 15 == 0) {
                System.out.println("FINRA");
            }else {
                System.out.println(i+", ");
            }
        }
    }
}
