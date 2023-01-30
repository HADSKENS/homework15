public abstract class Transport {
    String brand;
     String model;
     double engineVolume;
     String body;


    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Transport{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + '}';
    }

    public void print() {
        printType();
    }

    public void move() {
        startMove();
    }

    public void finish() {
        finishMove();
    }

    public abstract void printType();

    public abstract void finishMove();

    public abstract void startMove();


}

interface Competitive {
    void PitStop();

    void BestLap();

    void HighSpeed();
}

class Cars<DriverLicenseB> extends Transport {
    Body body;
    Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Cars(String brand, String model, double engineVolume, Body body) {
        super(brand, model, engineVolume);
        this.body = body;
        this.type=Type.Cars;

    }

    @Override
    public void finishMove() {
        System.out.println(brand + " Заглушил двигатель");
    }

    @Override
    public void startMove() {
        System.out.println(brand + " Начал движение");
    }

    public void printType() {
        System.out.println(type);
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
        return "Cars{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + ", body='" + body.getBodyType() + '\'' + '}';
    }
}

class Truck<DriverLicenseC> extends Transport {
    LoadCapacity loadCapacity;
    Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
        this.type=Type.Truck;

    }

    @Override
    public void finishMove() {
        System.out.println(brand + " Заглушил двигатель");
    }

    @Override
    public void startMove() {
        System.out.println(brand + " Начал движение");
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
    public void printType() {
        System.out.println(type);
    }
}


class Bus<DriverLicenseD> extends Transport {
    Capacity capacity;
    Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
        this.type=Type.Bus;

    }

    @Override
    public void finishMove() {
        System.out.println(brand + " Заглушил двигатель");
    }

    @Override
    public void startMove() {
        System.out.println(brand + " Начал движение");
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
        if (capacity.capacityLeft == null) {
            return "Bus{" + "capacity до " + capacity.capasityRight + ", brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + '}';
        } else {
            return "Bus{" + "capacity от " + capacity.capacityLeft + " до " + capacity.capasityRight + ", brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + '}';
        }
    }

    @Override
    public void printType() {
        System.out.println(type);
    }
}


