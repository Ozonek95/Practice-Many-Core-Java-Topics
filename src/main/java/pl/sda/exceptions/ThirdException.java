package pl.sda.exceptions;

public class ThirdException extends Exception {
    private int errorCode;

    public ThirdException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
