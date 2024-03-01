package week5;

public class UniqueCharacters {
    public static void main(String[] args) {
      //  Write a return method that can find the unique characters from the String
      //  Ex: unique("AAABBBCCCDEF") ==> "DEF";
//                  01234567891011
        String str="AAABBBCCCDEF";
        String unique="";//that will store the unique characters found in the str variable.
        for (int i=0;i<str.length(); i++){//i:index numbers of str
            char each = str.charAt(i);//This line retrieves the character at index i from the str variable and stores it in the each variable.

            if(str.indexOf(each) == str.lastIndexOf(each) ){//if the character is not appear in a string more then once
                //then it's a unique character
                unique+=each;
            }
        }
        System.out.println(unique);
//first index of character a is 0, last character of a in a string is 2.a not equal 0, then it's not unuque
//if the first time when the character is appeared and the last time when the character is appeared is aquvalent then this is character is unique
        //first time index of character d is 9 and the last time is 9. 9=9, then this character is unique
    }}



