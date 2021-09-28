package Assignment_3;

public class Main {

    public static void main(String[] args){
        IWeapon weapon = new AccessoryScope4x(new AccessoryButtstock(new AccessoryHandguards(new HK416())));

        System.out.println(weapon.aimAndFire());
    }
}
