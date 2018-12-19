package pl.sda.exceptions;

public class FirstException extends Exception {
    private int errorCode;
    public FirstException(String message, int errorCode){
        super(message);
        this.errorCode=errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
