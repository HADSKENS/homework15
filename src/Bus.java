import java.util.List;

class Bus<DriverLicenseD> extends Transport {
    Capacity capacity;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Bus(String brand, String model, double engineVolume, Capacity capacity, Type type, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, type, mechanics);
        this.capacity = capacity;

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
    public void getDiagnostics() throws MyException {
        super.getDiagnostics();
    }

    @Override
    public String toString() {
        if (capacity.capacityLeft == null) {
            return "Bus{" + "capacity до " + capacity.capasityRight + ", brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + '}';
        } else {
            return "Bus{" + "capacity от " + capacity.capacityLeft + " до " + capacity.capasityRight + ", brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + '}';
        }
    }
}
