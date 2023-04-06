package memento;

public class Client {
    public static void main(String[] args) {
        GameState gameState = new GameState(1, 3, 0);
        GameRunner gameRunner = new GameRunner(gameState);
        gameRunner.play();
        gameRunner.printState();
        gameRunner.play();
        gameRunner.printState();
        gameRunner.restore();
        gameRunner.printState();
    }
}
