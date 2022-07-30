package fucntionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        var phone1 = "07257913708";
        var phone2 = "03006358097";
        
        System.out.println("\nSem predicado");
        System.out.println(isPhoneNumberValid(phone1));
        System.out.println(isPhoneNumberValid(phone2));
       
        System.out.println("\nCom predicado");
        System.out.println(isPhoneNumberValidPredicate.test(phone1));
        System.out.println(isPhoneNumberValidPredicate.test(phone2));
        
        System.out.println(
                "Is phone number valid and contains 3 = " 
                + isPhoneNumberValidPredicate.and(containsNumber3).test(phone1)
        );
        
        System.out.println(
                "Is phone number valid and contains 3 = " 
                + isPhoneNumberValidPredicate.and(containsNumber3).test(phone2)
        );
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
    
    static Predicate<String> isPhoneNumberValidPredicate = 
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    
    static Predicate<String> containsNumber3 = 
            phoneNumber -> phoneNumber.contains("3");
}
