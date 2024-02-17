package week2;

public class PrintConsecutiveNumbers {

public static void main(String[] args) {
    printNumbers(15);
}
public static void printNumbers(int N) {
    for (int i = 1; i <= N; i++) {
        if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
            System.out.println("CodilityTestCoders");
        } else if (i % 2 == 0 && i % 3 == 0) {
            System.out.println("CodilityTest");
        } else if (i % 2 == 0 && i % 5 == 0) {
            System.out.println("CodilityCoders");
        } else if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("TestCoders");
        } else if (i % 2 == 0) {
            System.out.println("Codility");
        } else if (i % 3 == 0) {
            System.out.println("Test");
        } else if (i % 5 == 0) {
            System.out.println("Coders");
        } else {
            System.out.println(i);
        }
    }

}}
/*
Consecutive numbers are numbers that follow each other in order,
with a difference of 1 between each pair of numbers. For example, 1, 2, 3, 4, 5
are consecutive numbers because each number is one more than the previous number.
 */

/*
User
write a function that, given a positive integer N,
 prints the consecutive numbers from 1 to N, each on a separate line.
  However, any number divisible by 2,3,or 5 should be raplace by the word Codility,
   Test or Coders respectively. If a number is divisible by more than one of the numbers:2,3,or5,
    it should be replaced by a concatenation of the rrspective words Codility,  Test and Codes in this given order.
 */