import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args){
        Scanner ac=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=ac.nextInt();

        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
