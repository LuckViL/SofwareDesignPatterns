package Assignment_3;

public class AccessoryButtstock extends WeaponAccessory{
    public AccessoryButtstock(IWeapon weapon) {
        super(weapon);
    }

    public String useButtstock(){
        return "Take buttstock with convex butt cap and long locking lever. ";
    }

    @Override
    public String aimAndFire() {
        return useButtstock() + super.aimAndFire();
    }
}
