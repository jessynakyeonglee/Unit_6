public class TraverseArrays {

    public static int countEven(int[] nums){
        int evens = 0;
        for (int count=0;count<nums.length;count++){
            if (nums[count]%2==0){
                evens++;
            }
        }
        return evens;
    }
    public static int[] buildArray(int desiredLength){
        int []array=new int[desiredLength];
        for (int count=0;count<desiredLength;count++){
           array[count]=count;
        }
        return array;
    }
    public static boolean sum28(int[] numbers){
        int count=0;
        while (count<=numbers.length){
            if (numbers[count]==2){
                count++;
            }
            else
                count++;
        }
       if (count==4){
           return true;
       }
       else{
           return false;
       }
    }
    public static void main (String[]args){
    }
}
