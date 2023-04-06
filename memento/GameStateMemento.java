package memento;

public class GameStateMemento {
    private int level;
    private int life;
    private int score;

    public GameStateMemento(int level, int life, int score) {
        this.level = level;
        this.life = life;
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public int getLife() {
        return life;
    }

    public int getScore() {
        return score;
    }
}
