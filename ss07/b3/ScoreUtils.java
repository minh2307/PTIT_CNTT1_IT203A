package ss07.b3;

public class ScoreUtils {
    private static boolean isScore = true;
    private static double avgScore = 8.0;

    public static void main(String[] args) {
        boolean isScore = ScoreUtils.isScore;
        double avg = ScoreUtils.avgScore;

        System.out.println("isScore: "+ isScore);
        System.out.println("avg: "+ avg);
    }

}
