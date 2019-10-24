import java.util.Scanner;


import java.util.Scanner;
  /*
      . make the user number not greater than 250 to check the program
      a number that is only divisable  by it self and 1 is a prime number
      . a number that is an intger, that are divisable by 1, itself and other numbers are non prime number
      .print the number is either prime or not
      .make sure the class is accessable for any kind of users
      .note that prime number does not include any number below 1
      .represnet 'R' as any positive intger
        . make the user number not greater than 250 to check the program
*/


public class PrimeorNot {
    private static Scanner sc;

    public static void main(String[] args) {


        int R, userno, count = 0;
        sc = new Scanner(System.in);
        System.out.println("any number divisable only by 1 and it`s number is a prime no");
        System.out.println("any number divisable by 2 or else is a non prime no");
        System.out.print(" Please Enter any Number : ");
        userno = sc.nextInt();


        for (R = 2; R <= userno / 2; R++) {
            if (userno % R == 0) {
                count++;
                break;
            }
        }
        if (count == 0 && userno != 1) {
            System.out.println(userno + " is a Prime Number");
        } else {
            System.out.println(userno + " is Not a Prime Number");
        }
    }
}