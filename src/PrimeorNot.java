import java.util.Scanner;


import java.util.Scanner;
  /*
      . make the user number not greater than 250 to check the program
      .a number that is only divisable  by it self and 1 is a prime number
      . a number that is an integer, that are divisable by 1, itself and other numbers are non prime number
      .print the number is either prime or not
      .make sure the class is accessable for any kind of users
      .note that prime number does not include any number below 1
      .represent 'i' as any positive integer
        . make the user number not greater than 250 to check the program
        .generate random number
*/


public class PrimeorNot {
    private static Scanner keyboard;

    public static void main(String[] args) {


        int i, userno, count = 250;
        Scanner keybd= new Scanner(System.in);
        System.out.println("any number divisable only by 1 and it`s number is a prime no");
        System.out.println("non prime number is a number that is not prime");
        System.out.print(" Please Enter any Number : ");
        System.out.println("put any random number");
        userno = keybd.nextInt();


        for (i = 2; i <= userno / 2; i++) {     //  use "i" to proceed with random number
            if (userno % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0 && userno != 1 &&   i==250) {
            System.out.println(userno + " is a Prime Number");
            ;
        }
        else {
            System.out.println(userno + "is a non prime Number");


           userno = keybd.nextInt() ;

        }

        }



        }

