package strategy;

public class Player {
     private int health;
    
    public Player(int health) {
        this.health = health;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            die();
        }
        System.out.println("Player has " + this.health + " health left.");
    }
    
    protected void die() {
        System.out.println("Player has been defeated!");
    }
}
