package combinatorpattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                    "Dilma",
                    "dilma@opressora.net",
                    "+0556398752431",
                    LocalDate.of(1952, 8, 17)
         );
        
        System.out.println(new CustomerValidatorService().isValid(customer));
        //if valid We can store customer in db
    }
}
