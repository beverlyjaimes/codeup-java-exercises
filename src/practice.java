public class practice {
    public static void main(String[] args) {

        String[] names = {"Rick", "Stacey", "Brad", "Becca"};
        String x;
        try {
            x = names[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }
    }
//    public static void main(String[] args) {
//        fizzBuzzLoop(1);
////        fizzBuzzLoop2();
//    }
//
//        public static int fizzBuzzLoop(int i) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//            if (i == 100) {
//                return 0;
//            } else {
//                return fizzBuzzLoop( i+ 1);
//
//            }
//        }

}


//    public static void fizzBuzzLoop2() {
//        int i = 1;
//        while (true) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//            if (i == 100) {
//                break;
//            }
//            i++;
//        }
//    }


