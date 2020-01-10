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
        int []array={};
        for (int count=0;count<desiredLength;count++){
            array+=count;
        }
    }
    public static void main (String[]args){
        System.out.print(countEven(new int[] {2,1,2,3,4}));
    }
}
