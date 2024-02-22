package mervat_solution.week4;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String input = "AAABBCDD";
        int letters = input.length();
        Map<Character, Integer> alphapet = new HashMap<Character, Integer>();
        for (int j = 0; letters > j; j++) {
            int count = 0;
            for (int i = 0; letters > i; i++) {
                if (input.charAt(j) == input.charAt(i)) {
                    count++;
                }
            }
            alphapet.put(input.charAt(j), count);
        }
        StringBuffer myValue = new StringBuffer();
        String myMapKeyValue = "";
        for (Map.Entry<Character, Integer> entry : alphapet.entrySet()) {
            myMapKeyValue = Character.toString(entry.getKey()).concat(
                    Integer.toString(entry.getValue()));
            myValue.append(myMapKeyValue);
        }
        System.out.println(myValue);

        System.out.println("--------------------------------------------------");


        String str = "AAABBCDD";
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                int count = map.get(ch);
                count++;
                map.replace(ch,count);
            }else {
                map.put(ch,1);
            }
        }
        for (Character key : map.keySet()) {
            System.out.println(key + "" + map.get(key));
        }

        }
    }










/*
Write a return method that can find the frequency of characters
  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
