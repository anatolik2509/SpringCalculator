package ru.itis.antonov;

public class IncorrectSyntaxException extends RuntimeException{
    public IncorrectSyntaxException() {
    }

    public IncorrectSyntaxException(String message) {
        super(message);
    }

    public IncorrectSyntaxException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectSyntaxException(Throwable cause) {
        super(cause);
    }
}
