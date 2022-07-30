package fucntionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
       var dilma = new Customer("Dilma", "057985422");
       
       //normal Java function
       greetCustomer(dilma);
       greetCustomerV2(dilma, false);
       //Consumer Functional interface
       greetCustomerConsumer.accept(dilma);
       greetCustomerConsumerV2.accept(dilma, false);
       
       
    }

    static void greetCustomer(Customer customer) {
        System.out.printf("Hello %s, thanks for registering phone number %s\n", customer.customerName, customer.customerPhoneNumber);
    }
    
    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println(
                    "Hello " + customer.customerName
                    + ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "******"));
    }
    
    static Consumer<Customer> greetCustomerConsumer = customer ->
             System.out.println(
                    "Hello " + customer.customerName
                    + ", thanks for registering phone number "
                    + customer.customerPhoneNumber);
    
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
             System.out.println(
                    "Hello " + customer.customerName
                    + ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "******"));
            

    static class Customer {

        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}
