package Exercise4;

/**
 * Created by nicasandra on 10/27/2016.
 */
public class StringTransform {
    public static String backAround(String str) throws Exception {
        if (str == null || str.length() < 1) {
            throw new Exception("Lenght is lower than 1!");
        }
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(str.charAt(str.length() - 1)).append(str).append(str.charAt(str.length() - 1));
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.println(StringTransform.backAround("sas"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
