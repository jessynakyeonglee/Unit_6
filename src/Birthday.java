//Jessy Lee
//1/22/20
//This program will show the birthday paradox. and it runs 1000 times to show how many times the same birthday occurs
public class Birthday {
    public static int[] dates(int num){
        int []blank= new int[num];
        for (int a=0;a<num;a++){
            blank[a]=(int)(Math.random()*365);
        }
        return blank;
    }//this method will create a random
    public static boolean hasDupes(int[] birthdays) {
        for (int count = 0; count < birthdays.length; count++) {
            for (int count2 = count + 1; count2 < birthdays.length; count2++) {
                if (birthdays[count] == birthdays[count2]) {
                    return true;
                }
            }
        }
        return false;
    }
//this method will check if there are two of the same day
    public static void main (String[]args){
        int correct = 0;
        for (int count = 0; count<1000;count++){//this part will run hasdupes 1000 times and will count how many times there are birthday duplicates
            int[]array=dates(23);
            if (hasDupes(array)){
                correct++;
            }
        }
        double answer = (double)correct/10;//this part will calculate the percentage of the same birthdays
        System.out.println("The percent of times there were same birthdays is "+answer+"%.");
    }
}
