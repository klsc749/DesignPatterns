package builder;

public class HouseBuilder implements Builder {
    
    private Building building;
    
    public HouseBuilder(){
        building = new Building();
    }
    
    @Override
    public void buildBasement() {
        building.setBasement("Basement\n");
    }

    @Override
    public void buildWall() {
        building.setWall("Wall\n");
    }

    @Override
    public void buildRoof() {
        building.setRoof("Roof\n");
    }

    @Override
    public String getBuilding() {
        return building.toString();
    }
}
