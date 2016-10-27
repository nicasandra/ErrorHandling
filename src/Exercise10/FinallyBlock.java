package Exercise10;

/**
 * Created by nicasandra on 10/27/2016.
 */
public class FinallyBlock {

    public static void main(String[] args) {
        try {
            throw new Exception("A new exception!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block called!");
        }
    }
}
