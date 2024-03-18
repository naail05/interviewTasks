package eugenie_solutions.week5;

public class String_Reverse {
    public static void main(String[] args) {

        String str = "ABCD";
        System.out.println(strReverse(str));

    }

    /**
     * reverse String
     * @param str
     * @return
     */
    public static String strReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        return reverse;
    }
}
 /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */