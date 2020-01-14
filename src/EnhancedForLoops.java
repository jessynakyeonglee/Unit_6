public class EnhancedForLoops {
    public static String printStandardFor(String[] arr){
        String output="";
        for (int count=0; count<arr.length;count++){
            output+= arr[count]+" ";
        }
        return output;
    }

    public static String printStandardFor(int[] arr){
        String output="";
        for (int count=0; count<arr.length;count++){
            output+= arr[count]+" ";
        }
        return output;
    }

    public static String printStandardFor(double[] arr) {
        String output="";
        for (int count=0; count<arr.length;count++){
            output+= arr[count]+" ";
        }
        return output;
    }

    public static String printEnhancedFor(String[] arr){}

    public static String printEnhancedFor(int[] arr){}

    public static String printEnhancedFor(double[] arr){}

    public static String printStandardWhile(String[] arr) {}

    public static String printStandardWhile(int[] arr) {}

    public static String printStandardWhile(double[] arr) {}

    public static void main (String[]args){
        String []stringarray = {"jessy","lucy","juicy","wrian","bilkinson"};
        int []integer = {1,2,3,4,5};
        double []doublearray = {1.1,2.2,3.3,4.4,5.5};
    }
}
