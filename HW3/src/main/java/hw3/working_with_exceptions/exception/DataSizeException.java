package hw3.working_with_exceptions.exception;

public class DataSizeException extends RuntimeException{
    public DataSizeException(String s) {
        super(s);
    }
}
