import java.util.Scanner;


public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximatley %-10.2f%n  \n",
//        pi);
////        cant get period on same line
//
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int userNumber = input.nextInt();
//        System.out.println("You entered: --> \"" + userNumber + "\" <--");
//
//        Scanner user = new Scanner(System.in);
//        System.out.println("Enter three words: ");
//        String UserInput1 = user.next();
//        String UserInput2 = user.next();
//        String UserInput3 = user.next();
//        System.out.println(UserInput1);
//        System.out.println(UserInput2);
//        System.out.println(UserInput3);
//
////        if you enter more than three words it prints them on the same line ®
//

//        Scanner userInput = new Scanner(System.in);
////        System.out.println("Enter a sentence");
////        String userSentence = userInput.nextLine();
////        System.out.println("Your sentence is: " + userSentence );

//        Scanner studentInput = new Scanner(System.in);
//        System.out.println("Enter the Length of the classroom: ");
//        String input1= studentInput.nextLine();
//        int length = Integer.parseInt(input1);
//
//
//        System.out.println("Enter the Width of the classroom: ");
//        String input2 = studentInput.next();
//        int width = Integer.parseInt(input2);
//
//        int area = length*width;
//        System.out.println("The area of the classroom is: "+ area);
//
//        int perimeter = (length *2) + (width * 2);
//        System.out.println("The perimeter of the classroom is: " + perimeter);

        Scanner studentInput = new Scanner(System.in);
        System.out.println("Enter the Length of the classroom: ");
        String input1= studentInput.nextLine();
        double length = Double.parseDouble(input1);


        System.out.println("Enter the Width of the classroom: ");
        String input2 = studentInput.next();
        double width = Double.parseDouble(input2);

        double area = length*width;
        System.out.println("The area of the classroom is: "+ area);

        double perimeter = (length * 2) + (width * 2);
        System.out.println("The perimeter of the classroom is: " + perimeter);

    }
}
