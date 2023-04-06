package command;

public class PlayerController {
    private final Command jumpCommand;
    private final Command attackCommand;
    private final Command specialAbilityCommand;

    public PlayerController(Command jumpCommand, Command attackCommand, Command specialAbilityCommand) {
        if (jumpCommand == null || attackCommand == null || specialAbilityCommand == null) {
            throw new IllegalArgumentException("commands cannot be null");
        }
        this.jumpCommand = jumpCommand;
        this.attackCommand = attackCommand;
        this.specialAbilityCommand = specialAbilityCommand;
    }

    public void getInput(char input){
        switch (input) {
            case 'j':
                jumpCommand.execute();
                break;
            case 'a':
                attackCommand.execute();
                break;
            case 's':
                specialAbilityCommand.execute();
                break;
            default:
                break;
        }
    }
}
