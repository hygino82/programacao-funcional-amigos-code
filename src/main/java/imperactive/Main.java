package imperactive;

import static imperactive.Main.Gender.FEMALE;
import static imperactive.Main.Gender.MALE;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Gorete", FEMALE),
                new Person("Godofredo", MALE),
                new Person("Tenorio", MALE),
                new Person("Jupira", FEMALE),
                new Person("Dilma", FEMALE)
        );

        //imperative approach
        System.out.println("Imperative Approach");
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        //declarative approach
        System.out.println("\nDeclarative Approach");
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        
        var females2 = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        females2.forEach(System.out::println);
    }

    static class Person {

        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" + "name=" + name + ", gender=" + gender + '}';
        }
    }

    enum Gender {
        MALE, FEMALE;
    }
}
