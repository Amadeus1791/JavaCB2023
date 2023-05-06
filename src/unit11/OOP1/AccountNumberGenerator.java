package unit11.OOP1;

import java.util.Random;

public class AccountNumberGenerator {

    private String bankNumber;

    public AccountNumberGenerator(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String generateNumber(int length) {
        String newString = "" + bankNumber;
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomNumber = random.nextInt(256);
            char c = (char) randomNumber;
            newString += c;
        }
        return newString;
    }
}
