package mediator;

import java.util.ArrayList;
import java.util.List;

public class Game implements GameMediator {
    private Player player;
    private List<Obstacle> obstacles = new ArrayList<>();
    private List<Coin> coins = new ArrayList<>();
    private int score = 0;

    public Game(){

    }

    public void setPlayer(Player player){
        this.player = player;
    }

    public void addObstacle(Obstacle obstacle){
        obstacles.add(obstacle);
    }

    public void addCoin(Coin coin){
        coins.add(coin);
    }

    @Override
    public void playerMove(int x, int y) {
        player.move(x, y);
        for (Obstacle obstacle : obstacles){
            if (obstacle.insertPlayer(player)){
                obstacleHit();
            }
        }
        for (Coin coin : coins){
            if (coin.insertPlayer(player)){
                coinHit();
                coins.remove(coin);
            }
        }
    }

    @Override
    public void obstacleHit() {
        System.out.println("Obstacle hit!");
    }

    @Override
    public void coinHit() {
        score++;
        System.out.println("Coin hit!");
    }

    public void printGameInfo(){
        System.out.println("Player: " + player.getName());
        System.out.println("Score: " + score);
    } 
}
