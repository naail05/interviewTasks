package week4;


public class StringRemoveDuplicates {
    public static void main(String[] args) {
        String str = "ABCABCABC";
        String result = "";
        for (int i = 0; i<str.length();i++){
        String ch = ""+ str.charAt(i);
        System.out.println(ch);
        if(result.contains(ch) ){
            continue;
        }
        result = result+ch;
        }
        System.out.println(result);
    }

}






