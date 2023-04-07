package observer;

public class Character implements Observer {
    private String name;

    public Character(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        if ("attack".equals(event)) {
            System.out.println(name + " received attack notification.");
        }
    }
}
