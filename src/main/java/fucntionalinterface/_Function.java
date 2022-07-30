package fucntionalinterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int value = incrementByOne(1);
        System.out.println(value);

        int value2 = incrementByOneFunction.apply(1);
        System.out.println(value2);

        int multiply = multipleBy10Function.apply(value2);
        System.out.println(multiply);
        
        Function<Integer,Integer>addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multipleBy10Function);
        
        var addOneMultiplyBy10 = addBy1AndThenMultiplyBy10.apply(4);
        System.out.println(addOneMultiplyBy10);
        

    }

    static int incrementByOne(int number) {
        return number + 1;
    }

    static Function<Integer, Integer> incrementByOneFunction
            = number -> number + 1;

    static Function<Integer, Integer> multipleBy10Function
            = number -> number * 10;
}
