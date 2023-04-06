package mediator;

public class Player {
    private String name;
    private int x, y;

    public Player(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getPosition(){
        return new int[]{x, y};
    }

    public String getName() {
        return name;
    }
}
