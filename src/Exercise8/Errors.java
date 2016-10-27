package Exercise8;

/**
 * Created by nicasandra on 10/27/2016.
 */
public class Errors { /* The program will not work after throwing these exceptions */
    public static void firstError() {
        throw new OutOfMemoryError();
    }

    public static void secondError() {
        throw new StackOverflowError();
    }

    public static void main(String []args) {
        Errors.firstError();
        Errors.secondError();
        System.out.println("...running or not");
    }
}
