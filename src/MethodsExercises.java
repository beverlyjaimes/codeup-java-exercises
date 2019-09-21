import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(addition(5, 2));
        System.out.println(subtraction(5, 2));
        System.out.println(multiplication(5, 2));
        System.out.println(division(10, 2));
        System.out.println(modulus(10, 3));
        System.out.println(multiplyNoOp(2, 3));

//        Scanner input = new Scanner(System.in);
//        int numInput = sc.nextInt();
//        System.out.println(Integer.parseInt(numInput));
//
//        int userInput = (getInteger(1, 10));

//        System.out.println(factorial(getInteger(1,10)));
        String yesOrNo = "y";
        do {
            factorial(0, sc);
            System.out.println("Would you like to try another number? Y/N");
            yesOrNo = sc.nextLine();
        } while (yesOrNo.equalsIgnoreCase("Y"));


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
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
//        returns the remainder
        return num1 % num2;
    }

    public static int multiplyNoOp(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (x + multiplyNoOp(x, y - 1));
    }
//   public static int userInput(int inp) {
//        return inp;
//   }

    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
//        System.out.println(input.hasNextInt());
        if (input.hasNextInt()) {
            int numInput = input.nextInt();

            if (numInput >= min && numInput <= max) {
                System.out.println(numInput + " is between 1 & 10!");
                return numInput;
            } else if (numInput < min || numInput > max) {
                System.out.println("This number is not valid, enter another number: ");
                return getInteger(min, max);
            }
//        getInteger(1,10); if you leave it here it continues to run
        } else {
            System.out.println("Not a valid input! Enter a valid number: ");
            return getInteger(min, max);

        }
        return getInteger(min, max);

    }

    public static long factorial(int num, Scanner sc) {
//        return userInput;
        int input = getInteger(1, 10);

        long Factorial = 1;
        for (int i = 1; i <= num; i++) {
            Factorial *= i;

        }
        System.out.printf("\n%d! = %d\n", input, Factorial);
        return Factorial;
    }

//    public static long diceRoll() {
//        Scanner input = new Scanner(System.in);
//        while (true) {
//            int dice1 = (int) (Math.random() * 6 + 1);
//            int dice2 = (int) (Math.random() * 6 + 1);
//            int sum = dice1 + dice2;
//
//            System.out.println("Roll: total = " + sum);
//
//            if (sum == 2 || sum == 3 || sum == 12) {
//                System.out.println("Sorry with a " + sum + " You LOSE :(");
//                break;
//            } else if (sum == 7 || sum == 11) {
//                System.out.println("Woah!!! With a " + sum + " You WIN!!!!!!!");
//                break;
//
//
//            }
//
//
//        }
//        return 0;
//    }

}
