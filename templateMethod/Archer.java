package templateMethod;

public class Archer extends PlayerCharater {
    @Override
    public void selectWeapon(){
        System.out.println("Archer selecting bow !");
    }

    @Override
    public void aimWeapon(String enemy){
        System.out.println("Aiming bow at " + enemy);
    }

    @Override
    public void useWeapon(String enemy){
        System.out.println("Shooting bow at " + enemy);
    }
}
