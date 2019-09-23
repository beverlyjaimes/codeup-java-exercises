import java.util.*;
import java.lang.*;
public class HighLow {
    public static void main(String[] args) {

        randNum(1, 100);
    }

    public static double randNum(double max, double min) {
        Scanner inputs = new Scanner(System.in);


        max = 100;
        min = 1;
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        boolean found = false;

        System.out.println(x);
     while (!found) {
         System.out.println("Enter a number between 1 and 100: ");
         int input = inputs.nextInt();
         if (input > x) {
             System.out.println("Lower!");
         } else if (input < x) {
             System.out.println("Higher!");
         } else {
             System.out.println("Good Guess!");
             found = true;
         }
     }

            return randNum(max, min);
    }
}