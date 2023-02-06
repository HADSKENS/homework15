import java.util.ArrayList;
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
    public void getDiagnostics() throws MyException {
        super.getDiagnostics();
    }

    @Override
    public Mechanic getMechanics() {
        return super.getMechanics();
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
