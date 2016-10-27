package Exercise5;

/**
 * Created by nicasandra on 10/27/2016.
 */
public class StringOp {
    public static String everyNth(String str, int n) throws Exception {
        if (n < 1) {
            throw new Exception("Invalid n!");
        }
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + n) {
            build.append(str.charAt(i));
        }
        return build.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.println(StringOp.everyNth("abcdefg", 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
