package finalsection;

import java.util.function.BiFunction;

public class Lambdas {

    public static void main(String[] args) {

        String upperCasedName = upperCaseName.apply("Dilma", 57);
        System.out.println(upperCasedName);
    }

    static BiFunction<String, Integer, String> upperCaseName = (name, age) -> {
        if (name.isBlank()) {
            throw new IllegalStateException("está vazio");
        }
        System.out.println(age);
        return name.toUpperCase();
    };
}
