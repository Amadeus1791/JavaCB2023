package unit05;

public class Methods {
    public static void main(String[] args) {
        int result = add(3, 6);
        System.out.println(result);
        System.out.println(add(3, 3));
       // System.out.println(dummy("Hello world"));
        printHelloWorld();
        String helloworld = returnHelloWorld();
        System.out.println(helloworld);
        String greet = greet("Wolfgang");
        System.out.println(greet);

    }

    // add(1,2) ==> 3
    static int add(int num1, int num2) {
        //return num1+num2;
        int sum = num1 + num2;
        return sum;
    }

    // dummy(3) ===> 3
    static String dummy(String input) {
        //for...
        // algo
        return input;
    }

    // addOne(3) ==> 4
    static int addOne(int num) {
     /*   int result = num+1;
        return result;*/
        return num+1;
    }

    static void printHelloWorld() {
        System.out.println("Hello world");
    }

    static String returnHelloWorld() {
        return "Hello world";
    }

    // greet("Wolfgang") ==> "hello Wolfgang"

    static String greet(String input) {
        String newString = "hello "+ input;
        return newString;
    }


}
