package templateMethod;

public class Warrior extends PlayerCharater {
    @Override
    public void selectWeapon(){
        System.out.println("Warrior selecting sword!");
    }

    @Override
    public void aimWeapon(String enemy){
        System.out.println("Aiming sword at " + enemy);
    }

    @Override
    public void useWeapon(String enemy){
        System.out.println("Swinging sword at " + enemy);
    }
}
