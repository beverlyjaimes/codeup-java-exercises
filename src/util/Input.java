package util;

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
        System.out.println("Want to continue? (y)");
        if ((scanner.nextLine().equalsIgnoreCase("y") || (scanner.nextLine().equalsIgnoreCase("yes") ))) {
            return true;
        } else {
            return false;
        }

    }

//    public int getInt(int min, int max){
//        System.out.println("Enter a maximum value:");
//         scanner.nextInt();
//        System.out.println("Enter a maximum value:");
//      scanner.nextInt();
//
//    }

       public int getInt(int min, int max) {
//        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        if (scanner.hasNextInt()) {
            int numInput = scanner.nextInt();
            if (numInput >= min && numInput <= max) {
                System.out.println(numInput + " is between 1 & 10!");
            } else if (numInput < min || numInput > max) {
                System.out.println("This number is not valid, enter another number: ");
                return getInt(min, max);
            }
        } else {
            System.out.println("Not a valid input! Enter a valid number: ");
            return getInt(min, max);
        }
        return getInt(min, max);

    }

    public int getInt() {
        System.out.println("Enter a number:");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        if (input.hasNextDouble()) {
            int numInput = input.nextInt();
            if (numInput >= min && numInput <= max) {
                System.out.println(numInput + " is between 1 & 10!");
            } else if (numInput < min || numInput > max) {
                System.out.println("This number is not valid, enter another number: ");
                return getDouble(min, max);
            }
        } else {
            System.out.println("Not a valid input! Enter a valid number: ");
            return getDouble(min, max);
        }
        return getDouble(min, max);

    }

    public int getDouble() {
        System.out.println("Enter a number with a decimal:");
        return scanner.nextInt();
    }

}
