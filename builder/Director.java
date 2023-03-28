package builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public String buildBuilding() {
        builder.buildBasement();
        builder.buildWall();
        builder.buildRoof();
        return builder.getBuilding();
    }
}
