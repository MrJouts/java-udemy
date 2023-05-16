public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(1000));
        displayHighScorePosition("Tina", calculateHighScorePosition(500));
        displayHighScorePosition("Mark", calculateHighScorePosition(100));
        displayHighScorePosition("James", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position =  4;
        if (playerScore >= 1000) position = 1;
        if (playerScore >= 500) position = 2;
        if (playerScore >= 100) position = 3;
        return position;
    }
}