package mediator;

public interface GameMediator{
    public void playerMove(int x, int y);
    public void obstacleHit();
    public void coinHit();
}