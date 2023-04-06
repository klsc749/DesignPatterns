package command;

public class AttackCommand implements Command {
    private final Player player;

    public AttackCommand(Player player) {
        if (player == null) {
            throw new IllegalArgumentException("player cannot be null");
        }
        this.player = player;
    }

    @Override
    public void execute() {
        player.attack();
    }
}
