import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {

            System.out.println("Tell Bob something: ");
            String userInput = input.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure");

            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");

            } else if (userInput.isEmpty()) {
                System.out.println("Fine. Be that way!");

            } else {

                System.out.println("Whatever.");
            }
            System.out.println("do you want to say something to bob? y/n");
            System.out.println("do you want to say something to bob? y/n");
        } while (input.nextLine().equalsIgnoreCase("y"));
            System.out.println("bye");
        }

}





//command B