public class swichcase {
    public static void main(String [] args){  
        int day=3;
        String dayTime;
        switch(day){
            case 1: dayTime="Monday";
            break;
            case 2: dayTime="Tuesday";
            break;
            case 3: dayTime="Wednesday";
            break;
            case 4: dayTime="Thursday";
            break;
            case 5: dayTime="Friday";
            break;
            case 6: dayTime="Saturday";
            break;
            case 7: dayTime="Sunday";
            break;
            default: dayTime="Invalid day";
        }  

        System.out.println(dayTime);


    }
    
}
