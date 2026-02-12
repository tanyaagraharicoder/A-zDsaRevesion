public class learnBasicRecursion {

    // print something n times using recursion
    public static void printNTimes(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello, World!");
        printNTimes(n-1);
    } 

    // print 1 to n using recursion
    public static void printOneToN(int n){
        if(n==0){
            return;
        }
        printOneToN(n-1);
        System.out.println(n);
    }

    //  print n to 1 using recursion
    public static void printNto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }

    //  sum of first n numbers using recursion
    public static int sumOfFirstN(int n){
        if(n==0){
            return 0;
        }
        return n + sumOfFirstN(n-1);
    }
    // factorial of a number using recursion

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n * fact(n-1);

    }

    public static int fib(int n){
        if(n==0){
            return 1;
        }

        if(n==1){
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    public static void main(String args[]){
        printNTimes(5);
        printOneToN(5);
        printNto1(5);
        System.out.println("Sum of first 5 numbers: " + sumOfFirstN(5));
        System.out.println("Factorial of 5: " + fact(5));
        System.out.println("Fibonacci of 5: " + fib(5));
    }

    


}
