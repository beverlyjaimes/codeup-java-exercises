public class Person {
    private String name;


    public Person(String name) {
//        this.name = name;
//        or
        setName(name);
    }

    public String getName() {
        return name;
//        GETTER**
    }
//SETTERS ARE VOIDS BECAUSE THEY SET INFO
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + this.getName());


    }


    public static void main(String[] args) {
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

/**
 * They are not the same object they just have the same name
 * (the UID is not the same)
 */
//
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);



//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
        /**
         * CLONES ^^^^^^
         */
    }
}


