package proxy.DynamicProxy;

public class RealEnemy implements Enemy {
    private int health;
    private String name;

    public RealEnemy(int health, String name) {
        this.health = health;
        this.name = name;
    }

    @Override
    public void attack(){
        System.out.println(name + " attacked the player with " + health + " health");
    }

    @Override
    public int getHealth(){
        return this.health;
    }
}
