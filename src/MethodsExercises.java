import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(addition(5, 2));
        System.out.println(subtraction(5,2));
        System.out.println(multiplication(5,2));
        System.out.println(division(10,2));
        System.out.println(modulus(10,3));
        System.out.println(multiplyNoOp(2,3));

//        Scanner input = new Scanner(System.in);
//        int numInput = sc.nextInt();
//        System.out.println(Integer.parseInt(numInput));
//
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
//has next int
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
    public static double division(double num1, double num2) {
        return num1/num2;
    }
    public static int modulus(int num1, int num2) {
//        returns the remainder
        return num1 % num2;
    }
    public static int multiplyNoOp(int x, int y){
        if(y == 0){
            return 0;
        }
        return (x + multiplyNoOp(x, y - 1));
    }
//   public static int userInput(int inp) {
//        return inp;
//   }

    public static int getInteger(int min, int max){
        Scanner input = new Scanner(System.in);

//        System.out.println(input.hasNextInt());

        int numInput = input.nextInt();
        if (numInput >= min && numInput <= max) {
        System.out.println(numInput + " is between 1 & 10");
        } else if (numInput < min || numInput > max) {
            System.out.println("This number is not valid, enter another number: ");
        getInteger(1,10);

        }
//        getInteger(1,10); if you leave it here it continues to run

        return min + max;


//        if (input.hasNextInt() && !input.hasNextDouble() && !input.hasNextFloat()) {
//            System.out.println("that's a valid number");
//        } else {
//            System.out.println("NOPE");
//        }



//put in do while loop that will check if number is valid then
    }

}
