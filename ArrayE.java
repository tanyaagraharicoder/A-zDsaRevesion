import java.util.Arrays;
public class ArrayE {
    // Largest Number in an Array

    public static void largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println("Largest Number is: " + largest);
    }

    // second largest element in an array
    public static void  secondLargest(int arr[]){
        Arrays.sort(arr);
        for(int i=0; i< arr.length; i++){
            if(arr[i] != arr[arr.length-1]){
                System.out.println("Second Largest Number is: " + arr[i]);
                break;
            }
        }

     


    }



    public static void main(String args[]){
        int arr[] = {3,3,6,1};
        int arr2[] = {3,3,0,99,-40};
        largest(arr);
        largest(arr2);
        secondLargest(arr);
        secondLargest(arr2);





    }
    
}
