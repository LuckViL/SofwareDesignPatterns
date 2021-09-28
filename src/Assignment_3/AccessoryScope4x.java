package Assignment_3;

public class AccessoryScope4x extends WeaponAccessory{
    public AccessoryScope4x(IWeapon weapon) {
        super(weapon);
    }

    public String takeScope4x(){
        return "Take 4x scope. ";
    }

    @Override
    public String aimAndFire() {
        return takeScope4x() + super.aimAndFire();
    }
}
