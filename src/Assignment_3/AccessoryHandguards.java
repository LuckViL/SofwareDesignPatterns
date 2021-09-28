package Assignment_3;

public class AccessoryHandguards extends WeaponAccessory{
    public AccessoryHandguards(IWeapon weapon) {
        super(weapon);
    }

    public String useHandguards(){
        return "Use handguard (9.5') with Picatinny profile on 3, 6 and 9 o'clock. ";
    }

    @Override
    public String aimAndFire() {
        return useHandguards() + super.aimAndFire();
    }
}
