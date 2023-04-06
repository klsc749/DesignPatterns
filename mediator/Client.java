package mediator;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        Player player = new Player("player", 0, 0);
        game.setPlayer(player);

        Coin coin1 = new Coin(1, 1);
        Coin coin2 = new Coin(2, 2);
        game.addCoin(coin1);
        game.addCoin(coin2);

        Obstacle obstacle1 = new Obstacle(1, 0);
        Obstacle obstacle2 = new Obstacle(0, 1);

        game.addObstacle(obstacle1);
        game.addObstacle(obstacle2);

        game.playerMove(1, 1);
        game.printGameInfo();
        game.playerMove(1, 0);
        game.playerMove(0, 0);
    }
}
