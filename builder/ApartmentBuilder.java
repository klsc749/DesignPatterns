package builder;

public class ApartmentBuilder implements Builder {
    
    private Building building;
    
    public ApartmentBuilder(){
        building = new Building();
    }
    
    @Override
    public void buildBasement() {
        building.setBasement("Basement\n");
    }

    @Override
    public void buildWall() {
        for(int i = 0; i < 4; i ++)
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
