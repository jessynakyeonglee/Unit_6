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
            if (list[count] < 0) {
                count++;
                return true;
            }
        }
        return false;??????????????????????
    }

    public static void main (String[]args){
        int[] list1 = {-2, -9, -6, -8, -9, -3, -1};
        System.out.println(printArray(list1));
        int[] list2 = {-2, -9, -6, -8, -9, -3, -1};
        int[] list3 = {-2, -9, -6, -8, -9, -3, 1};
        System.out.println(checkForAllNegatives(list2));
        System.out.println(checkForAllNegatives(list3));
        System.out.println();
        System.out.println();

    }
}
