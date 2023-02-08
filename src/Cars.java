import java.util.List;

class Cars<DriverLicenseB> extends Transport {
    Body body;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Cars(String brand, String model, double engineVolume, Body body, Type type, List<Mechanic> mechanics) {
        super(brand, model, engineVolume, type, mechanics);
        this.body = body;

    }

    @Override
    public void getMechanics() {
        super.getMechanics();
    }

    public void printType() {
        System.out.println(type);
    }

    public void pitStop() {
        System.out.println(brand + " ушел на Pit-Stop");
    }

    public void bestLap() {
        System.out.println(brand + " Лучшее время круга " + engineVolume * 10);
    }

    public void highSpeed() {
        System.out.println(brand + " Развил максимальную скорость в размере " + engineVolume * 24);
    }

    @Override
    public String toString() {
        return "Cars{" +
                "body=" + body +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", body='" + body + '\'' +
                ", type=" + type +
                ", mechanics=" + mechanics +
                '}';
    }

    public void getDiagnostics() {
        System.out.println("Диагностика пройдена");
    }
}
