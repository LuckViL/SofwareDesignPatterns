package Assignment_3;

public class WeaponAccessory implements IWeapon{
    private IWeapon weapon;

    public WeaponAccessory(IWeapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String aimAndFire() {
        return weapon.aimAndFire();
    }
}
