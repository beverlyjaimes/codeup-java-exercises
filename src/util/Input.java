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
        System.out.println(keyboard.getString("sfs"));

    }

    private String getString(){
        return this.scanner.nextLine();
    }

    public String getString(String prompt){
        if (prompt.isEmpty()){
            System.out.println("Type: ");
        } else {
        System.out.println(prompt);
        }
        return getString();
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
/**
 *FERNANDOS WAY
 */
           int number = getInt();
           if(number >=min && number <= max) {
               return number;
           } else {
               System.out.println("Out of range");
           }
           return getInt(min, max);

    }

//    public int getInt(String prompt) {
//        System.out.println(prompt);
//        return scanner.nextInt();
//    }

    public int getInt() {
        int number;
        try {
            number = Integer.valueOf(getString("Enter a number"));
        }catch(NumberFormatException e){
            System.out.println("invalid input! ");
//            e.printStackTrace();
            return getInt();
        }
        return number;
    }


    public double getDouble(double min, double max) {

        double number = getDouble();
        if(number >=min && number <= max) {
            return number;
        } else {
            System.out.println("Out of range");
        }
        return getDouble(min, max);

    }


//    public int getDouble(String prompt) {
//        System.out.println(prompt);
//        return scanner.nextInt();
//    }

    public double getDouble(){
        double number;
        try {
            number = Double.valueOf(getString("Enter a decimal"));
        }catch(NumberFormatException e){
            System.out.println("invalid input! ");
            e.printStackTrace();
            return getInt();
        }
        return number;
    }

    public int getBinary() {
        int num = Integer.valueOf(getString("Enter a binary number: "), 2);
        System.out.print("Your number is: ");
        return num;
    }
    public int getHex() {
        int num = Integer.valueOf(getString("Enter a hexadecimal number: "), 16);
        System.out.print("Your number is: ");
        return num;
    }





}
