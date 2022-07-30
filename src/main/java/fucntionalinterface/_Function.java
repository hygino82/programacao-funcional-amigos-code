package fucntionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int value = incrementByOne(1);
        System.out.println(value);

        int value2 = incrementByOneFunction.apply(1);
        System.out.println(value2);

        int multiply = multipleBy10Function.apply(value2);
        System.out.println(multiply);
        
        Function<Integer,Integer> addBy1AndThenMultiplyBy10 =
                incrementByOneFunction.andThen(multipleBy10Function);
        
        var addOneMultiplyBy10 = addBy1AndThenMultiplyBy10.apply(4);
        System.out.println(addOneMultiplyBy10);
        
        //BiFunction dois argumentos para um retorno
        System.out.println("\n------------------------------\n");
        System.out.println("BiFunction dois argumentos para um retorno");
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
        
    }

    static int incrementByOne(int number) {
        return number + 1;
    }
    
    static int incrementByOneAndMultiply(int number,int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

    static Function<Integer, Integer> incrementByOneFunction
            = number -> number + 1;

    static Function<Integer, Integer> multipleBy10Function
            = number -> number * 10;
    
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numToMultiplyBy) 
                    -> (numberToIncrementByOne + 1) * numToMultiplyBy;
}
