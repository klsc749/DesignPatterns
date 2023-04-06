package memento;

import java.util.ArrayList;
import java.util.List;

public class GameRunner {
    private GameState gameState;
    private List<GameStateMemento> savedStates = new ArrayList<>();
    private int historyStateIndex;

    public GameRunner(GameState gameState) {
        this.gameState = gameState;
        this.historyStateIndex = -1;
    }

    public void play(){
        gameState.play();
        savedStates.add(gameState.save());
        historyStateIndex++;
    }

    public void restore(){
        if(historyStateIndex > 0){
            gameState.restore(savedStates.get(historyStateIndex));
            historyStateIndex--;
        }else{
            System.out.println("No more saved states");
        }
    }

    public void printState(){
        gameState.display();
    }
}
