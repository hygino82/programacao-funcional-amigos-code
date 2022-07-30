package fucntionalinterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int value = incrementByOne(0);
        System.out.println(value);

        int value2 = incrementByFunction.apply(0);
        System.out.println(value2);
        
    }

    static int incrementByOne(int number) {
        return number + 1;
    }

    static Function<Integer, Integer> incrementByFunction
            = number -> number++;
}
