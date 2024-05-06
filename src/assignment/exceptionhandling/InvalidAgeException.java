package assignment.exceptionhandling;

public class InvalidAgeException extends RuntimeException {
    InvalidAgeException(String message){
        super(message);
    }
}
