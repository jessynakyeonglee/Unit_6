public class ArrayCreation {
    public static double getAverage(double[] numbers){
        double array_average;
    if (numbers.length<3){
        return 0.0;
    }
    else{
        array_average = (numbers[0]+numbers[numbers.length/2])+numbers[numbers.length-1];
        array_average/=3;
        array_average=(int)((array_average*100+0.5)/100);
        return array_average;
    }
    }
    public static String stringArray(String[] friends){
        String output ="";
        if (friends.length!=5){
            return output;
        }
        else{
            output+=(friends[0].length())+" "+(friends[1].length())+" "+(friends[2].length())+" "+(friends[3].length())+" "+(friends[4].length());
        }
        return output;
    }
    public static String countryData(){
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana", "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi", "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi", "Swahili", "Spanish", "English", "French", "English"};
        int random = (int)(Math.random()*13);
        return "The capital of "+(countries[random])+" is "+(capitals[random])+" and the primary language is "+(languages[random]);
    }
    public static void main (String[]args){
        double[] numbers={89,75,100};
        System.out.println(getAverage(numbers));
        String[] names = {"Fred","Barney","Betty","Wilma","Pebbles"};
        System.out.println(stringArray(names));
        System.out.println(countryData());



    }

}
