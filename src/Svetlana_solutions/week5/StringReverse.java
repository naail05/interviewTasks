package week5;

public class StringReverse {
    public static void main(String[] args) {

        String str = "Java";
        //"avaJ"      0123

        String reverse = " ";//"avaj"
        for (int i = str.length() - 1; i >= 0; i--) {//from the beginning of third index we will start loop
            //until i>0 we count backdown

            reverse += str.charAt(i);//Inside the loop, this line appends the character at index i of the str String to the reverse String.

            System.out.println(reverse);//avaJ
            System.out.println("__________________________________________________");
        }
    }}