
public class ServerNameGenerator {
    static String[] adjectives = {"Bitter", "Fluffy", "Fuzzy", "Sharp", "Soft", "Quiet", "Loud", "Yellow", "Little", "Small"};
    static String[] nouns = {"Lion", "Mother", "Baby", "Puppy", "Computer", "Dragon", "Dog", "Monster", "Woman", "Student"};

    public static void main(String[] args) {
        random();

    }
    public static int getRandom(int max){
        return(int) (Math.random()*max);
    }
    public static void random(){
        System.out.println("Here is your server name: ");
        System.out.println(adjectives[getRandom(10)] + " " + nouns[getRandom(10)]);

    }
}
