import java.util.Arrays;

public class ArraysExercises {
       static Person[] people = new Person[3];

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
//        it returns the UID
        System.out.println(Arrays.toString(numbers));
//        returns the actual numbers and not the UID

/**        Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array.
 *
 */
        people[0] = new Person("Felipe");
        people[1] = new Person("Victor");
        people[2] = new Person("Jesus");

        for(Person person : people) {
            person.sayHello();
        }
        addPerson(people, new Person("Bob"));

    }

  public static void addPerson(Person[] people, Person newPerson) {
      Person[] newList = Arrays.copyOf(people, people.length + 1);
      newList[newList.length - 1] = newPerson;
      for (Person Person : newList) {
          System.out.println(Person.getName());
      }
  }
//        Person[] newPerson = new Person[person.length+1];
//    newPerson[4] = new Person("Bob");
/**
 * Justins walkthrough
 *
 */
//    Person[] people = {
//        new Person ("John");
//        new Person("Bob");
//        new Person ("Joe");
//    };
//    }
//    public static Person[] addPerson(Person[] people, Person p){
//        Person[]output=new Person[people.length+1];
//        for(int i=0;i<people.length;i+=1){
//        output[i]=people[i];
//        }
//        output[output.length-1] =p;
//        return output;
//        }


}
