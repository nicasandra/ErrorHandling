package Exercise7;

/**
 * Created by nicasandra on 10/27/2016.
 */
public class Heights {
    public static int sumHeights(int[] heights, int start, int end) throws Exception {
        if (start < 0 || end < 0 || start > end) {
            throw new Exception("Start or end invalid!");
        }
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] heights = {5, 3, 6, 7, 2};
        try {
            System.out.println(Heights.sumHeights(heights, 2, 4));
            System.out.println(Heights.sumHeights(heights, 0, 1));
            System.out.println(Heights.sumHeights(heights, 0, 4));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
