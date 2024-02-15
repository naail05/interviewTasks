package mervat_solution.week2;

public class Tasks {
    public static void main(String args[]) {
        //  numbers divided by 3
        System.out.println("Divided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }

        //  numbers divided by 5
        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ", ");
        }

        //  numbers divided by 15
        System.out.println("\n\nDivided by  15: ");
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0 )
                System.out.print(i + ", ");
        }



    }
}
