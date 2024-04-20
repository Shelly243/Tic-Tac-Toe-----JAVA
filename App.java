public class App {
    public static void main(String[] args) throws Exception {
        while (true) {
            TicTacToe ticTacToe = new TicTacToe();
            // The game is running until the user closes the window or chooses to quit
            // If you want to replay automatically after the game ends, you can remove the
            // break statement
            if (!ticTacToe.gameOver) {
                break; // Exit the loop if the game ends (window is closed or user chooses to quit)
            }
        }
    }
}
