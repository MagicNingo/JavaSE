package Day0712.work;

public class InvalidInputException extends Exception{

    public InvalidInputException(){
        super("Your input was invalid");
    }
    public InvalidInputException(String str){
        super(str);
    }
}
