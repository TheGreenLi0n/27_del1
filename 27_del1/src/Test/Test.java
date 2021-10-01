package Test;

import Models.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {
        int doubles = 0;
        int[] intarray = new int[1000];
        int[] countarray = new int[11];
        int[] doublearray = new int[6];

        // Main loop that puts all the sums into an array called intarray.
        for (int z = 0; z < 1000; z++) {
            Die dice1 = new Die();
            Die dice2 = new Die();
            dice1.rolldice();
            dice2.rolldice();
            int sum = dice1.getFacevalue()+dice2.getFacevalue();
            intarray[z]=sum;
            
            //This if-statement sees if the facevalues are equal, and if then count up all the occurrences of doubles
            //and then puts them into an array, called doublearray.
            if (dice1.getFacevalue()==dice2.getFacevalue()){

                doubles++;
                switch (dice1.getFacevalue()){
                    case (1): doublearray[0]++;break;
                    case (2): doublearray[1]++;break;
                    case (3): doublearray[2]++;break;
                    case (4): doublearray[3]++;break;
                    case (5): doublearray[4]++;break;
                    case (6): doublearray[5]++;break;
                }

            }
        }
        //this nested for-loop, counts up how many of the different outcomes occurred.
        for (int i = 0; i < countarray.length; i++) {
            for (int e: intarray) {
                if (e==i+2){
                    countarray[i]++;
                }
            }
        }

        Arrays.sort(intarray);
        System.out.println("1000 throws");
        //System.out.println("This is the array sorted: "+Arrays.toString(intarray)); // include this line to print the sorted array
        System.out.println("occurrences: two="+countarray[0]+" three="+countarray[1]+" four="+countarray[2]+" five="+countarray[3]+" six="+countarray[4]+" seven="+countarray[5]+" eight="+countarray[6]+" nine="+countarray[7]+" ten="+countarray[8]+" eleven="+countarray[9]+" twelve="+countarray[10]);
        System.out.println("\nAmount of doubles:"+doubles);
        System.out.println("occurrences of doubles: one="+doublearray[0]+" two="+doublearray[1]+" three="+doublearray[2]+" four="+doublearray[3]+" five="+doublearray[4]+" six="+doublearray[5]+"\n");

        System.out.println(Arrays.stream(intarray).summaryStatistics());

    }
}

