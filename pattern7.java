import java.util.Scanner;
public class pattern7 {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        for(int i=0; i<=rows; i++){

            //  space
            for(int j=0; j<=rows-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=2*i+1; j++){
                System.out.print("*");
            }
            // space
             for(int j=0; j<=rows-i; j++){
                System.out.print(" ");
            }


            System.out.println();
        }


    }
    
}
