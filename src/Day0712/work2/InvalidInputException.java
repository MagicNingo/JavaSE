package Day0712.work2;

public class InvalidInputException extends Exception {
    public InvalidInputException() {
        super("Your input was invalid");
    }

    public InvalidInputException(String message) {

        super(message);
    }

}
