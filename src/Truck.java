import java.util.List;

class Truck<DriverLicenseC> extends Transport {
    LoadCapacity loadCapacity;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity, Type type, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, type, mechanics);
        this.loadCapacity = loadCapacity;

    }

    @Override
    public void getMechanics() {
        super.getMechanics();
    }

    public void PitStop() {
        System.out.println(brand + " ушел на Pit-Stop");
    }

    public void BestLap() {
        System.out.println(brand + " Лучшее время круга " + engineVolume * 10);
    }

    public void HighSpeed() {
        System.out.println(brand + " Развил максимальную скорость в размере " + engineVolume * 24);
    }

    @Override
    public String toString() {
        if (loadCapacity.rightScore == null & loadCapacity.leftScore == 12.0) {
            return "Truck{" + "loadCapacity свыше " + loadCapacity.leftScore + " тонн " + ", brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + '}';
        }
        if (loadCapacity.rightScore == null & loadCapacity.leftScore == 3.5) {
            return "Truck{" + "loadCapacity до " + loadCapacity.leftScore + " тонн " + ", brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + '}';
        } else {
            return "Truck{" + "loadCapacity от " + loadCapacity.rightScore + " тонн, до " + loadCapacity.leftScore + " тонн, " + ", brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + '}';
        }

    }
    @Override
    public void getDiagnostics() {
        System.out.println("Диагностика пройдена");
    }
}
