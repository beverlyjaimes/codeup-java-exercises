public class InheritanceTest {

    public static void main(String[] args) {
        Animal cat = new Animal(4,"feline", true);

        Dog myDog = new Dog(2, "canine",true, "mutt", "Luna");

        System.out.println(cat.getAge());
        System.out.println(myDog.getName());
    }
}
