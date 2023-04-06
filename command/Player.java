package command;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println(this.name + " is jumping");
    }

    public void attack(){
        System.out.println(this.name + " is attacking");
    }

    public void specialAbility(){
        System.out.println(this.name + " is using special ability");
    }
}
