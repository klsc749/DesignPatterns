package builder;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<String> buildingComponent = new ArrayList<>();

    public void setBasement(String basement) {
        buildingComponent.add(basement);
    }

    public void setWall(String wall){
        buildingComponent.add(wall);
    }

    public void setRoof(String roof){
        buildingComponent.add(roof);
    }

    @Override
    public String toString(){
        String buildString = "";
        for(int i = buildingComponent.size() - 1; i > -1; i--){
            buildString += buildingComponent.get(i);
        }
        return buildString;
    }
}