package memento;

public class GameState {
    private int level;
    private int life;
    private int score;

    public GameState(int level, int life, int score) {
        this.level = level;
        this.life = life;
        this.score = score;
    }

    public GameStateMemento save() {
        return new GameStateMemento(level, life, score);
    }

    public void restore(GameStateMemento memento) {
        this.level = memento.getLevel();
        this.life = memento.getLife();
        this.score = memento.getScore();
    }


    public void display() {
        System.out.println("Level: " + level);
        System.out.println("Life: " + life);
        System.out.println("Score: " + score);
    }

    public void play(){
        level++;
        life--;
        score++;
    }
}
