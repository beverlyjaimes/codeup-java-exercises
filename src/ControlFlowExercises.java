import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//       int i = 5;
//       while (i <= 15){
//           System.out.print(i + " ");
//           i++;
//       }
//
//
//       int a = 0;
//
//      do {
//            System.out.println(a*2);
//            a++;
//        } while (a <= 50);

//       do {
//           System.out.println(a);
//           a += 2;
//       }while (a <= 100);


//               int a = 105;
//
//       do {
//           System.out.println(a-=5);
//
//       } while (a > - 10);
//
//       int a = 100;
//
//       do{
//           System.out.println(a);
//           a -= 5;
//       } while(a >= -10);

//        for(byte i = 105;i >= - 10;i-=5) {
//
//
//            System.out.println("i = " + i);
//        }

//        long k = 2;
//        do {
//            System.out.println(k);
//            k *= k;
//        } while(k < 1000000);


//        for(long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

        /**
         * for a for loop ( how you start; how you stop; how you proceed)
         */

//        for (byte i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//
//        for (byte i = 1; i <= 100; i++) {
//            if ((i % 5 == 0) && (i % 3 ==0)) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0 ) {
//                System.out.println("Fiz");
//            } else {
//                System.out.println(i);
//
//            }
//
//        }


//        Scanner input = new Scanner(System.in);
////        System.out.println("Enter a number");
////        int startValue = 1;
////        int num = input.nextInt();
////        for (int row =0; row < num; row++){
////            int y = 1;
////            for (int col = startValue; col < startValue+3; col ++)
////            {
////                y = y *startValue;
////                System.out.print(y + " " );
////            }
////            System.out.println();
////            startValue++;
////        }

//        int grade;
//
//
//        Scanner grade = new Scanner(System.in);
//        System.out.printf("Entered the numbered grade you received");
//        int grades = grade.nextInt();
//
//        if(70>=grade>=60)
//            System.out.println("Your grade is a D"); //java code tells you that your letter grade is a D if you input a score that is between  60 and 70
//        if(80>=grade>=70)
//            System.out.println("You received a C letter grade");//java code tells you that your letter grade is a C if you input a score that is between and includes 70 and 80
//        if(90>=grade>=80)
//            System.out.println("You received a B letter grade");//java code tells you that your letter grade is a B if you input a score that is between and includes 90 and 80
//        if(100>=grade>=90)
//            System.out.println("You received an A letter grade");//java code tells you that your letter grade is a A if you input a score that is between and includes 100 and 90
//        if(60>grade)
//            System.out.println("You received an F letter grade"); //java code tells you that your letter grade is an F is you input a score that is below 60
//

//
//        String yesNo = "Y";
//
//        while(yesNo.equalsIgnoreCase("y")){
//            System.out.println("What number would you like to go up to?");
//            int answer = Integer.parseInt(input.nextLine());
//            System.out.println("Here is your table!");
//
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//
//            for(int counter = 1; counter <= answer; counter++){
//                System.out.println(String.format("%-6d | %-7d | %-6d", counter, (int) Math.pow(counter, 2), (int) Math.pow(counter, 3)));
//            }
//
//            System.out.println("Would you like to test another number Y/N");
//            yesNo = input.nextLine();
//        }
//
//        System.out.println("Ok, have a good day");
//
//        do {
//            System.out.println("Give me a grade number:");
//            int grade = Integer.parseInt(input.nextLine());
//
//            String gradeLetter = "";
//            if (grade <= 100 && grade >= 88) {
//                gradeLetter = "A";
//            } else if (grade <= 87 && grade >= 80) {
//                gradeLetter = "B";
//            } else if (grade <= 79 && grade >= 67) {
//                gradeLetter = "C";
//            } else if (grade <= 66 && grade >= 60) {
//                gradeLetter = "D";
//            } else if (grade <= 59 && grade >= 0) {
//                gradeLetter = "F";
//            }
//
//            System.out.println(gradeLetter);
//            System.out.println("Would you like to test another grade Y/N");
//
//        }while(input.nextLine().equalsIgnoreCase("y"));


    }//end method
}//end class grades



