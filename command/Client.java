package command;

public class Client {
    public static void main(String[] args) {
        // Create a new player
        Player player = new Player("John");
        // Create a new JumpCommand for the player
        JumpCommand jumpCommand = new JumpCommand(player);
        // Create a new AttackCommand for the player
        AttackCommand attackCommand = new AttackCommand(player);
        // Create a new SpecialAbilityCommand for the player
        SpecialAbilityCommand specialAbilityCommand = new SpecialAbilityCommand(player);
        // Create a new PlayerController for the player
        PlayerController playerController = new PlayerController(jumpCommand, attackCommand, specialAbilityCommand);

        // Send the input 'j' to the player controller
        playerController.getInput('j');
        // Send the input 'a' to the player controller
        playerController.getInput('a');
        // Send the input 's' to the player controller
        playerController.getInput('s');
    }
}
