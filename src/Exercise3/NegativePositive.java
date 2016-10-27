package Exercise3;

/**
 * Created by nicasandra on 10/27/2016.
 */
public class NegativePositive {

    public static boolean posNeg(int a, int b, boolean negative) {
        if (a < 0 && b > 0 && !negative) {
            return true;
        } else if (a > 0 && b < 0 && !negative) {
            return true;
        } else if (a < 0 && b < 0 && negative) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(NegativePositive.posNeg(1, -1, false));
        System.out.println(NegativePositive.posNeg(-1, 1, false));
        System.out.println(NegativePositive.posNeg(-4, -5, true));
        System.out.println(NegativePositive.posNeg(4, -5, true));
    }
}
