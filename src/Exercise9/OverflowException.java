package Exercise9;

/**
 * Created by nicasandra on 10/27/2016.
 */
public class OverflowException extends Exception {
    public String message;

    public OverflowException(String message) {
        this.message = message;
    }

}
