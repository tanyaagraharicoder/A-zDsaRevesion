import java.util.HashMap;
public class learnBasicHashing {
    //  counting frequency of elements in an array using hashing    
    public static void countFreq( int [] nums){
        HashMap<Integer, Integer>map= new HashMap<>();
        for(int i=0; i<nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
             }
            else{
                 map.put(nums[i], 1);
                 


            }
        }

    }
    public static void main(String args []){
        int [] nums = {1,2,3,4,5,1,2,3,4,5};
        countFreq(nums);


    }
} 

