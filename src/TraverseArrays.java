public class TraverseArrays {

    public static int countEven(int[] nums){
        int evens=0;
        int count=0;
        while (count<=nums.length){
            if (nums[count]%2==0){
                evens++;
                count++;
            }
            else{
                count++;
            }
        }
        return evens;
    }
    public static void main (String[]args){
        System.out.print(countEven( [2, 1,
    }
}
