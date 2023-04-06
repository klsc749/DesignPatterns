package command;

public class JumpCommand implements Command { 
    private final Player player; 

    public JumpCommand(Player player) { 
        if (player == null) { 
            throw new IllegalArgumentException("player cannot be null");
        }
        this.player = player;
    }

    @Override
    public void execute() { 
        player.jump();
    }
}
