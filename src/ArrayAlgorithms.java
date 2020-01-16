public class ArrayAlgorithms {
    public static String printArray(int[] nums){
        String output = "";
        for (int count=0;count<nums.length;count++){
            output+=nums[count]+" ";
        }
        return output;
    }
    public static boolean checkForAllNegatives(int[] list) {
        int count = 0;
        while (count < list.length) {
            if (list[count] > 0) {
                return false;
            }
            count++;
        }
        return true;
    }
    public static boolean hasDupes(int[] list){
        for (int count=0;count<list.length;count++){
            for (int count2=count+1;count2<list.length;count2++){
                if (list[count]==list[count2]){
                    return true;
                }
            }
        }
        return false;
    }
    public static int countEvens(int[] arr){
        int output = 0;
        for (int count=0;count<arr.length;count++){
            if (arr[count]%2==0){
                output++;
            }
        }
        return output;
    }
    public static int[] leftShift(int[] nums, int shift){
        int []output=new int[nums.length+shift];
        for (int count=0;count<nums.length;count++){
            output[count]=nums[count];
        }
        for (int num=nums.length;num<output.length;num++){
            output[num]=0;
        }
        return output;
    }
    public static void main (String[]args){
        int[] list1 = {-2, -9, -6, -8, -9, -3, -1};
        System.out.println(printArray(list1));
        int[] list2 = {-2, -9, -6, -8, -9, -3, -1};
        int[] list3 = {-2, -9, -6, -8, -9, -3, 1};
        System.out.println(checkForAllNegatives(list2));
        System.out.println(checkForAllNegatives(list3));
        int[] list4 = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 5};
        int[] list5 = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 11};
        System.out.println(hasDupes(list4));
        System.out.println(hasDupes(list5));
        int[] list6 = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 5};
        int[] list7 = {12, 3, 72, 16, 47, 46, 92, 12, 18, 36, 76, 51, 99, 101, 42, 42};
        System.out.println(countEvens(list6));
        System.out.println(countEvens(list7));
        int[] list8 = {1, 0, 1, 1, 0, 1, 0, 1};
        System.out.println(printArray(leftShift(list8,6)));
    }
}
