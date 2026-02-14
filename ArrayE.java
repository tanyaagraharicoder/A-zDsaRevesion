import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    // check if the array is sorted and rotated or not
     public boolean check(int[] nums) {
        int n= nums.length;
        int count = 0;

        //  find the turning point 

        for(int i=0; i<n; i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }

        if(count<=1){
            return true;
        }

        return false;
        
    }

    // Remove Duplicates from Sorted Array


    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        int idx=1;
        for(int i=1; i< n; i++){

            if(nums[i]!=nums[i-1]){
                nums[idx]= nums[i];
                idx++;
            }

        }
        return idx;
        
    }

    // Rotate Array

     public void rotate(int[] nums, int k) {
        int n= nums.length;
        k= k%n;

        reverse( nums,0, n-1);
        reverse( nums,0, k-1);
        reverse( nums,k, n-1);
        
    }

    public void reverse( int [] nums ,int left, int right){
        while(left<right){
            int temp= nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    // Move Zeroes


     public void moveZeroes(int[] nums) {
        int idx=0;
        int n= nums.length;
        for(int i=0; i< n ; i++){
            if(nums[i]!=0){
                nums[idx]= nums[i];
                idx++;
            }
        }
        while(idx< n){
            nums[idx++]= 0;
        }
        
    }

    //  Linear search in an array
    public int linearSearch(int arr[], int target){
        for(int i=0; i< arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // union of two sorted arrays without duplicates

    public int[] unionArray(int[] nums1, int[] nums2) {

    int i = 0, j = 0;
    int n1 = nums1.length, n2 = nums2.length;

    List<Integer> result = new ArrayList<>();

    while (i < n1 && j < n2) {

        if (nums1[i] == nums2[j]) {
            addIfNotExists(result, nums1[i]);
            i++;
            j++;
        }
        else if (nums1[i] < nums2[j]) {
            addIfNotExists(result, nums1[i]);
            i++;
        }
        else {
            addIfNotExists(result, nums2[j]);
            j++;
        }
    }

    while (i < n1) {
        addIfNotExists(result, nums1[i]);
        i++;
    }

    while (j < n2) {
        addIfNotExists(result, nums2[j]);
        j++;
    }

    return result.stream().mapToInt(Integer::intValue).toArray();
}

private void addIfNotExists(List<Integer> list, int val) {
    if (list.isEmpty() || list.get(list.size() - 1) != val) {
        list.add(val);
    }
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

        ArrayE obj = new ArrayE();
        System.out.println(obj.check(arr));
        System.out.println(obj.check(arr2));


        System.out.println(obj.removeDuplicates(new int[]{1,1,2}));
        System.out.println(obj.removeDuplicates(new int []{0,0,1,1,1,2,2,3,3,4}));

        int arr3[] = {1,2,3,4,5,6,7};
        obj.rotate(arr3, 3);
        System.out.println("Rotated Array is: " + Arrays.toString(arr3));

        int arr4[] = {0,1,0,3,12};
        obj.moveZeroes(arr4);
        System.out.println("Array after moving zeroes: " + Arrays.toString(arr4));
        int target = 3;
        System.out.println("Target found at index: " + obj.linearSearch(arr, target));
        System.out.println("Target found at index: " + obj.linearSearch(arr2, target));

        obj.unionArray(arr, arr2);
        System.out.println("Union of two arrays: " + Arrays.toString(obj.unionArray(arr, arr2)));





    }
    
}
