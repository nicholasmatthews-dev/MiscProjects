import java.util.ArrayList;
import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        /*
        3 0 2 3 1 4 2
        5 1 0 2 1 1 1
        6 8 2 1 2 0 2
        1 2 3 4 5 6 1
        0 1 9 2 1 0 6
         */
        int data[][] = {
                {3, 0, 2, 3, 1, 4, 2},
                {5, 1, 0, 7, 1, 1, 1},
                {6, 8, 2, 1, 2, 0, 2},
                {1, 2, 3, 4, 5, 9, 1},
                {0, 1, 9, 2, 1, 0, 6}
        };
        double threshold = 3.5;

        // write your code below here
        double[] averages = new double[data.length];
        for (int i = 0; i < averages.length; i++) {
        	averages[i] = 0;
        }
        
        for (int i = 0; i < data.length; i++) {
        	for (int j = 0; j < data[0].length; j++) {
        		averages[i] += data[i][j];
        	}
        	averages[i] /= data[i].length; 
        }
        
        System.out.println("Your averages are: ");
        for (int i = 0; i < averages.length; i++) {
        	if (averages[i] > threshold) {
        		System.out.println(averages[i]+"***");
        	}
        	else {
        		System.out.println(averages[i]);
        	}
        }


    }
}
