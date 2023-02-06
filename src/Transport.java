import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    String brand;
    String model;
    double engineVolume;
    String body;
    Type type;
    static List<Mechanic> mechanics = new ArrayList<>();

    public  Transport(String brand, String model, double engineVolume, Type type, List<Mechanic> mechanics) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.type = type;
    }
    public Type getType() {
        return type;
    }

    public void getDiagnostics() throws MyException {
        if (getType() == Type.Bus) {
            throw new MyException();
        }
        System.out.println("Диагностика пройдена");
    }


    public Mechanic getMechanics() {
        System.out.println("Механик 1 " + Transport.mechanics + " Механик 2 " + Transport.mechanics);
        return mechanic;
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


