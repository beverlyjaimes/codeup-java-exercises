import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        1-------------------------------------------
//        Scanner sc = new Scanner(System.in);
//        System.out.println(addition(5, 2));
//        System.out.println(subtraction(5, 2));
//        System.out.println(multiplication(5, 2));
//        System.out.println(division(10, 2));
//        System.out.println(modulus(10, 3));
//        System.out.println(multiplyNoOp(2, 3));
//
//        String yesOrNo = "y";
//        do {
//            factorial();
//            System.out.println("Would you like to try another number? Y/N");
//            yesOrNo = sc.nextLine();
//        } while (yesOrNo.equalsIgnoreCase("Y"));

//        diceRoll();

    }
//// 1----------------------------------------------------------------------
//    public static double addition(double num1, double num2) {
//        return num1 + num2;
//    }
//
//    public static double subtraction(double num1, double num2) {
//        return num1 - num2;
//    }
//
//    public static double multiplication(double num1, double num2) {
//        return num1 * num2;
//    }
//
//    public static double division(double num1, double num2) {
//        return num1 / num2;
//    }
//
//    public static int modulus(int num1, int num2) {
////        returns the remainder
//        return num1 % num2;
//    }
//
//    public static int multiplyNoOp(int x, int y) {
//        if (y == 0) {
//            return 0;
//        }
//        return (x + multiplyNoOp(x, y - 1));
//    }
//
//// 2----------------------------------------------------------------------//
//     public static int getInteger(int min, int max) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
//        if (input.hasNextInt()) {
//            int numInput = input.nextInt();
//            if (numInput >= min && numInput <= max) {
//                System.out.println(numInput + " is between 1 & 10!");
//                return numInput;
//            } else if (numInput < min || numInput > max) {
//                System.out.println("This number is not valid, enter another number: ");
//                return getInteger(min, max);
//            }
//        } else {
//            System.out.println("Not a valid input! Enter a valid number: ");
//            return getInteger(min, max);
//        }
//        return getInteger(min, max);
//
//    }
////// 3----------------------------------------------------------------------
//    public static long factorial() {
//        int number = getInteger(1, 10);
//        long Factorial = 1;
//        String middleString = "";
//        for (int i = 1; i <= number; i++) {
//            Factorial *= i;
//            if (middleString.isEmpty()) {
//                middleString += i;
//            } else {
//                middleString += " X " + i;
//            }
//            System.out.println(i + "! = " + middleString + " = " + Factorial);
//        }
//        return 0;
//
//    }
//// 4----------------------------------------------------------------------
//        public static void diceRoll() {
//        System.out.print("How many sides should the dice have? ");
//        Scanner userReply = new Scanner(System.in);
//        int diceSides = Integer.parseInt(userReply.nextLine());
//        double randomGen = (Math.random()*(diceSides)) + 1;
//        int random = (int) randomGen;
//        double randomGen2 = (Math.random()*(diceSides)) + 1;
//        int random2 = (int) randomGen2;
//        int dice1 = random;
//        int dice2 = random2;
//        System.out.printf("Your rolled a %d on dice one, and a %d on dice two.\n", dice1, dice2);
//        System.out.print("Want to roll again? Y/N");
//        String answer = userReply.nextLine();
//        if(answer.equals("y")) {
//            diceRoll();
//        }
//    }



}

