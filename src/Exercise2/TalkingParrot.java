package Exercise2;

/**
 * Created by nicasandra on 10/27/2016.
 */
public class TalkingParrot {
    public static boolean parrotTrouble(boolean talking, int hour) throws Exception {
        if (talking && hour > 7 && hour < 20) {
            return true;
        } else if (hour < 0 || hour > 24) {
            throw new Exception("Invalid hour!");
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        try {
            boolean status = TalkingParrot.parrotTrouble(true, 8);
            System.out.println("In trouble: " + status);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
