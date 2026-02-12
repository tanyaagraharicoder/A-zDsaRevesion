public class countAllDigits {
    public static int countDigits(int n){
        if(n == 0){
            return 0;
        }
        return 1 + countDigits(n / 10);
    }
    public static void main(String [] args){
        int number = 12345;
        int count = countDigits(number);
        System.out.println("The number of digits in " + number + " is: " + count);

    }
    
}
