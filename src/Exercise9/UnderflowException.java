package Exercise9;

/**
 * Created by nicasandra on 10/27/2016.
 */
public class UnderflowException extends Exception {
    public String message;

    public UnderflowException(String message) {
        this.message = message;
    }


}
