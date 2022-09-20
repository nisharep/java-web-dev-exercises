package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {

    public static void main (String[] args){

        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(15);
        numbersList.add(8);
        numbersList.add(5);
        numbersList.add(56);
        numbersList.add(23);
        numbersList.add(30);
        numbersList.add(81);
        numbersList.add(90);
        numbersList.add(2);
        System.out.println(numbersList);
        System.out.println("Sum of even nos: " + sumEven(numbersList));

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("First");
        stringArrayList.add("Fist");
        stringArrayList.add("Three");
        stringArrayList.add("Two");
        stringArrayList.add("Nimal");
        stringArrayList.add("Nidhu");
        stringArrayList.add("On");
        System.out.println(stringArrayList);
        System.out.println("Words with 5 letters: " + fiveLetterWords(stringArrayList));

    }
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static String fiveLetterWords(ArrayList<String> arrstr)
    {
        String[] returnArr=new String[5];
        int k=0;
        for (String word : arrstr) {
            System.out.println(word);
            if (word.length()==5) {
                returnArr[k] = word;
                System.out.println(returnArr[k]);
                k++;
                System.out.println(k);

            }
        }
        return Arrays.toString(returnArr);
    }
}
