package unit18.arraylists;

import java.util.*;

public class MyArraylists {
    public static void main(String[] args) {
        
        List<Integer> numbers = new LinkedList<>(List.of(1, 2, 3, 4));
        Stack<Double> stack = new Stack<>();
        
       // int[] array = new int[100];
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i)); //[i]
        }
        
        for (Integer number : numbers) {
            System.out.println(number);
        }
      

    }
}
