package hw3.working_with_exceptions.exception;

public class InputPhoneException extends RuntimeException{
    public InputPhoneException() {
        super("В номере телефона могут быть только цифры");
    }
}
