import java.util.Scanner;

public class patter8 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for(int i=0; i<= rows; i++){
            for(int j=0; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j=0 ; j<2*rows-(2*i+1); j++){
                System.out.print("*");
            }
                for(int j=0; j<=rows-i; j++){
                    System.out.print(" ");
                }
        }
    }
    
}
