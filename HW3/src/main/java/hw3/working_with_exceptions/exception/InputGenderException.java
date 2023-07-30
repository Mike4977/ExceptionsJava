package hw3.working_with_exceptions.exception;

public class InputGenderException extends RuntimeException{
    public InputGenderException() {
        super("Неверно введен пол");
    }
}
