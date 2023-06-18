package unit18.myexceptions.ownexceptions2;

import java.util.ArrayList;
import java.util.List;

public class MagicNumbers {
    private List<Integer> numbers;
    private final int MAX_BOUND = 1_000_000;

    public MagicNumbers() {
        numbers = new ArrayList<>();
    }


    public void addMagicNumber(Integer num) throws NegativeIntegerException, OutOfBoundsException, IllegalArgumentException {
        // throws NegativeIntegerException
        if (num < 0) {
            throw new NegativeIntegerException("Your integer has to be positive");
        }
        // throws OutOfBoundsException
        if (num > MAX_BOUND) {
            throw new OutOfBoundsException("Your number is not within the bounds");
        }
        if (num == 100) {
            throw new IllegalArgumentException("sorry 100 is not allowed");
        }
        numbers.add(num);

    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
