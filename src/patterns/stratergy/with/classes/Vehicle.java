package patterns.stratergy.with.classes;

import patterns.stratergy.with.stratergies.IDrive;

public class Vehicle {
    private IDrive drive;

    public Vehicle(IDrive drive) {
        this.drive = drive;
    }

    public void simulateDrive() {
        drive.drive();
    }
}
