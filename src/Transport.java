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
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public void move() {
        startMove();
    }

    public void finish() {
        finishMove();
    }

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

    public Cars(String brand, String model, double engineVolume, Body body) {
        super(brand, model, engineVolume);
        this.body = body;
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
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", body='" + body.getBodyType() + '\'' +
                '}';
    }
}
    class Truck<DriverLicenseC> extends Transport {
        public Truck(String brand, String model, double engineVolume) {
            super(brand, model, engineVolume);
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
    }

    class Bus<DriverLicenseD> extends Transport {
        public Bus(String brand, String model, double engineVolume) {
            super(brand, model, engineVolume);
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
    }


