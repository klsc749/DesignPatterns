package command;

public class SpecialAbilityCommand implements Command {
    private final Player player;

    public SpecialAbilityCommand(Player player) {
        if (player == null) {
            throw new IllegalArgumentException("player cannot be null");
        }
        this.player = player;
    }

    @Override
    public void execute() {
        player.specialAbility();
    }
}
