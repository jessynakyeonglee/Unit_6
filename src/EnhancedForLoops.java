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

    public static String printEnhancedFor(String[] arr){
        String output="";
        for (String count:arr){
            output+=count+" ";
        }
        return output;
    }

    public static String printEnhancedFor(int[] arr){
        String output="";
        for (int count:arr){
            output+=count+" ";
        }
        return output;
    }

    public static String printEnhancedFor(double[] arr){
        String output="";
        for (double count:arr){
            output+=count+" ";
        }
        return output;
    }

    public static String printStandardWhile(String[] arr) {
        String output = "";
        int count = 0;
        while (count<arr.length){
            output+= arr[count]+" ";
            count++;
        }
        return output;
    }

    public static String printStandardWhile(int[] arr) {
        String output = "";
        int count = 0;
        while (count<arr.length){
            output+= arr[count]+" ";
            count++;
        }
        return output;
    }

    public static String printStandardWhile(double[] arr) {
        String output = "";
        int count = 0;
        while (count<arr.length){
            output+= arr[count]+" ";
            count++;
        }
        return output;
    }

    public static void main (String[]args){
        String []stringarray = {"jessy","lucy","juicy","wrian","bilkinson"};
        int []integerarray = {1,2,3,4,5};
        double []doublearray = {1.1,2.2,3.3,4.4,5.5};

        System.out.println(printStandardFor(stringarray));
        System.out.println(printEnhancedFor(stringarray));
        System.out.println(printStandardWhile(stringarray));
        System.out.println(printStandardFor(integerarray));
        System.out.println(printEnhancedFor(integerarray));
        System.out.println(printStandardWhile(integerarray));
        System.out.println(printStandardFor(doublearray));
        System.out.println(printEnhancedFor(doublearray));
        System.out.println(printStandardWhile(doublearray));


    }
}
