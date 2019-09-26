
public class ServerNameGenerator {
    static String[] adjectives = {"Bitter", "Fluffy", "Fuzzy", "Sharp", "Soft", "Quiet", "Loud", "Yellow", "Little", "Small"};
    static String[] nouns = {"Lion", "Mother", "Baby", "Puppy", "Computer", "Dragon", "Dog", "Monster", "Woman", "Student"};


    public static String getRandomEle(String[] arr){
        int index = (int)(Math.random() * ((arr.length - 1) + 1));
        return arr[index];
    }
    public static void main(String[] args) {

        System.out.println("Here is your server name: ");
//        System.out.println(adjectives[getRandom(10)] + " " + nouns[getRandom(10)]);
        String message = String.format("%s %s", getRandomEle(adjectives), getRandomEle(nouns));
        System.out.println(message);

    }


}
