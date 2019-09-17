

public class ControlFlowExercises {
    public static void main(String[] args) {
//       int i = 5;
//       while (i <= 15){
//           System.out.println(i);
//           i++;
//       }
//
//
//       int a = 0;
//
//       do {
//           System.out.println(a*2);
//           a++;
//       } while (a <= 50);

//               int a = 105;
//
//       do {
//           System.out.println(a-=5);
//
//       } while (a > - 10);
//
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

//        for (byte i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }

        for (byte i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else if (i % 3 == 0 ) {

                System.out.println("Fiz");

            } else {
                System.out.println(i);

            }

        }


    }
}
