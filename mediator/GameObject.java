package mediator;

public abstract class GameObject {
    private int x, y;

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean insertPlayer(Player player){
        if (player.getPosition()[0] == x && player.getPosition()[1] == y){
            return true;
        }
        return false;
    }
}
