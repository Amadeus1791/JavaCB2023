package unit02;

public class AgeChecker {
    public static void main(String[] args) {
/*
        1. REQUIREMENTS
        please type in your age:
         you are allowed to do the following stuff:
         -voting
         -allowed to work
         -drink
         -drive car

         -- male and female
         -> military male and age
         -> driving: need license
         -> OR: female and >25 = military is OK


         2. DATA TYPES
         int age;
         String option;
         boolean female;
         boolean hasLicense;

         3. ALGORITHM
         if (age== ....)
         (age == ....)
         else ....

         */
        int age = 1;
        String option = "";
        boolean female = true;
        boolean hasLicense = false;
        System.out.println("you are allowed to do the following stuff");
        if (age >= 16) {
            System.out.println("you are allowed to vote");
        }
        if (age > 14 && age <= 65) {
            System.out.println("You are allowed to work");
        }
        if (age >= 18) {
            System.out.println("You are allowed to drink");
        }

        if ((!female && age >= 18) || (female && age>=25)) {
            System.out.println("You are allowed to the military");
        }
        if (hasLicense && age >= 17) {
            System.out.println("You are allowed to drive");

        } else {
            System.out.println("You can do nothing");
        }








    }
}
