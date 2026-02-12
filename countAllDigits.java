import java.util.ArrayList;
import java.util.List;

public class countAllDigits {
    public static int countDigits(int n){
        if(n == 0){
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    //  reverse a number 
    // You are given an integer n. Return the integer formed by placing the digits of n in reverse order.

    public static int reverseDigits(int n){
        int reversed=0;
        while(n>0){
            int lastDigit = n%10;
            reversed= reversed*10+lastDigit;
            n=n/10;
        }
        return reversed;
    }

    // Palindrome Number
    public static boolean isPalindrome(int n){
        int reversed = reverseDigits(n);
        return n == reversed;
    }

    // GCD of a number
    public static int gcd(int a, int b) {
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }

    // check if the number is armstrong number or not
    public static boolean isArmstrong(int n){
        int originalNumber= n ;
        int sum =0;
        //  count the number of digits
        int numberOfDigits = countDigits(n);
        while(n>0){
            int lastDigit= n%10;
            sum += Math.pow(lastDigit, numberOfDigits);
            n=n/10;
        }
            return sum == originalNumber;

        //  get all all digits of the number and calculate the sum of the cubes of the digits


    }

    //  print all the divisors of a number

    public static List<Integer> printDivisors(int n){
        List<Integer> divisors = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                divisors.add(i);
            }
        }
        return divisors;

    }

    //  prime number
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }







    public static void main(String [] args){
        int number = 12345;
        int count = countDigits(number);
        System.out.println("The number of digits in " + number + " is: " + count);

        int reversedNumber = reverseDigits(number);
        System.out.println("The reverse of " + number + " is: " + reversedNumber);

        int palindromeNumber = 12321;
        boolean isPalindrome = isPalindrome(palindromeNumber);
        System.out.println(palindromeNumber + " is a palindrome: " + isPalindrome);

        int a = 48;
        int b = 18;
int gcdResult = gcd(a, b); System.out.println("The GCD of " + a + " and " + b + " is: " + gcdResult);

        int armstrongNumber = 153;
        boolean isArmstrong = isArmstrong(armstrongNumber);
        System.out.println(armstrongNumber + " is an Armstrong number: " + isArmstrong);

        // for divisors
        int divisorNumber = 28;
     
        System.out.println("The divisors of " + divisorNumber + " are: " + printDivisors(divisorNumber));
        int primeNumber = 29;
        boolean isPrime = isPrime(primeNumber);
        System.out.println(primeNumber + " is a prime number: " + isPrime);


    }
    
}
