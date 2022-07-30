package fucntionalinterface;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
       var dilma = new Customer("Dilma", "057985422");
       
       //normal Java function
       greetCustomer(dilma);
       //Consumer Functional interface
       greetCustomerConsumer.accept(dilma);
       
    }

    static void greetCustomer(Customer customer) {
        System.out.printf("Hello %s, thanks for registering phone number %s\n", customer.customerName, customer.customerPhoneNumber);
    }
    
    static Consumer<Customer> greetCustomerConsumer = customer ->
             System.out.println(
                    "Hello " + customer.customerName
                    + ", thanks for registering phone number "
                    + customer.customerPhoneNumber);
            

    static class Customer {

        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}
