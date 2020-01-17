public class Birthday {
    public static int[] dates(int num){
        int []blank= new int[num];
        for (int a=0;a<num;a++){
            blank[a]=(int)(Math.random()*365);
        }
        return blank;
    }
    public static void main (String[]args){
        System.out.println(dates(23));
    }
}
