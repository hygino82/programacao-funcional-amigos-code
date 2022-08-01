package combinatorpattern;

import java.time.LocalDate;
import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                    "Dilma",
                    "dilma@opressora.net",
                    "+0556398752431",
                    LocalDate.of(2001, 8, 17)
         );
        
        //System.out.println(new CustomerValidatorService().isValid(customer));
        //if valid We can store customer in db
        
        //using combinator pattern
        ValidationResult result = isEmailValid()
            .and(isPhoneNumberValid())
            .and(isAnAdult())
            .apply(customer);
        
        System.out.println(result);
        
        if (result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        } 
    }
}
