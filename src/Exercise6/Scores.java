package Exercise6;

/**
 * Created by nicasandra on 10/27/2016.
 */
public class Scores {
    public static boolean scoresIncreasing(int[] scores) throws Exception {
        if (scores.length < 2) {
            throw new Exception("Invalid array!");
        }
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] scores = {1, 2, 1};
        try {
            System.out.println(Scores.scoresIncreasing(scores));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
