package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class _Optional {
    public static void main(String[] args) {
      Supplier<IllegalStateException> exception = ()
               -> new IllegalStateException("exception");
       
      Optional.ofNullable("dilma@gmail.com")
              .ifPresentOrElse(
                      email -> System.out.printf("Sending email to %s\n",email), 
                      () -> System.out.println("Cannot send email"));
               //.ifPresent(email -> System.out.printf("Sending email to %s\n",email));
                //.orElseThrow(exception);//lançar caso seja nulo
                //.orElseGet(()-> "default value");
       
        
    }
}
