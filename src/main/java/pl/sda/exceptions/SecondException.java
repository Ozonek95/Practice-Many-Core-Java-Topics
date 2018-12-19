package pl.sda.exceptions;

public class SecondException extends Exception {
    private int errorCode;

    public SecondException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
