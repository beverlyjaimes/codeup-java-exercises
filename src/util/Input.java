package util;

import java.io.OutputStream;
import java.util.Scanner;

public class Input {
    private Scanner scanner;


    public Input(){
    this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {

        Input keyboard = new Input();

        System.out.println(keyboard.getString());
        System.out.println(keyboard.yesNo());
        System.out.println(keyboard.getInt( 1 ,10));
        System.out.println(keyboard.getInt());
        System.out.println(keyboard.getDouble(1,10));
        System.out.println(keyboard.getDouble());

    }

    public String getString(){
        System.out.println("Please enter a sentence: ");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Want to continue? (y/n)");
        String answer =this.scanner.nextLine();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");

//
//        if ((scanner.nextLine().equalsIgnoreCase("y") || (scanner.nextLine().equalsIgnoreCase("yes") ))) {
//            return true;
//        } else {
//            return false;
//        }

    }


       public int getInt(int min, int max) {
//        System.out.println("Enter a number between 1 and 10: ");
//        if (scanner.hasNextLine()) {
//            int numInput = Integer.parseInt(this.scanner.nextLine());
//            if (numInput >= min && numInput <= max) {
//                System.out.println(numInput + " is between 1 & 10!");
//            } else if (numInput < min || numInput > max) {
//                System.out.println("This number is not valid, enter another number: ");
//                return getInt(min, max);
//            }
//        } else {
//            System.out.println("Not a valid input! Enter a valid number: ");
//            return getInt(min, max);
//        }
//        return getInt(min, max);
/**
 *FERNANDOS WAY
 */
           System.out.println("Enter a number");
           int number = Integer.parseInt(this.scanner.nextLine());
           if(number >=min && number <= max) {
               return number;
           } else {
               System.out.println("Out of range");
           }
           return getInt(min, max);

    }

    public int getInt() {
        System.out.println("Enter a number:");
        return scanner.nextInt();
    }


    public double getDouble(double min, double max) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
//        if (input.hasNextDouble()) {
//            int numInput = input.nextInt();
//            if (numInput >= min && numInput <= max) {
//                System.out.println(numInput + " is between 1 & 10!");
//            } else if (numInput < min || numInput > max) {
//                System.out.println("This number is not valid, enter another number: ");
//                return getDouble(min, max);
//            }
//        } else {
//            System.out.println("Not a valid input! Enter a valid number: ");
//            return getDouble(min, max);
//        }
//        return getDouble(min, max);
        /**
         *FERNANDOS WAY
         */
        System.out.println("Enter a decimal:");
        Double number = Double.parseDouble(this.scanner.nextLine());
        if(number >=min && number <= max) {
            return number;
        } else {
            System.out.println("Out of range");
        }
        return getDouble(min, max);

    }

    public int getDouble() {
        System.out.println("Enter a decimal:");
        return scanner.nextInt();
    }

}
