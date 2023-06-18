package unit18.myexceptions.ownexceptions;

public class StringLengthException extends RuntimeException{


    public StringLengthException(String message) {
        super(message);
    }

    public StringLengthException() {
        System.out.println("Your string is too long");
    }

}
