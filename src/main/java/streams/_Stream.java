package streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;
import static streams._Stream.Gender.PREFER_NOT_SAY;

public class _Stream {
    public static void main(String[] args) {
         List<Person> people = List.of(
                new Person("Gorete", FEMALE),
                new Person("Godofredo", MALE),
                new Person("Tenorio", MALE),
                new Person("Jupira", FEMALE),
                new Person("Dilma", FEMALE),
                new Person("Juliete", PREFER_NOT_SAY)
        );
        
        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> lenght = String::length;
    
        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)//name -> name.length()
                //.collect(Collectors.toSet())
                .forEach(System.out::println);
        
        //System.out.println(genders);
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
        MALE, FEMALE, PREFER_NOT_SAY;
    }
}
