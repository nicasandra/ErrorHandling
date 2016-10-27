package Exercise1;

/**
 * Created by nicasandra on 10/27/2016.
 */
public class Monkey {
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        } else if (!aSmile && !bSmile) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(Monkey.monkeyTrouble(false, false));
    }
}
