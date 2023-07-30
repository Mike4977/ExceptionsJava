package hw3.working_with_exceptions.exception;

public class InputDateException extends RuntimeException{
    public InputDateException() {
        super("Дата введена не корректно");
    }
}
