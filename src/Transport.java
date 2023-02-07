import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    String brand;
    String model;
    double engineVolume;
    String body;
    Type type;
    public List<Mechanic> mechanics = new ArrayList<>();

    public Transport() {
    }

    public Transport(String brand, String model, double engineVolume, Type type,List <Mechanic> mechanics) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.type = type;
        this.mechanics=mechanics;
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


    public void getMechanics() {
        int i;
        for (i = 0; i < mechanics.size(); i++) {
            System.out.println(mechanics.get(i));
        }
    }

    @Override
    public String toString() {
        return "Transport{" + "brand='" + brand + '\'' + ", model='" + model + '\'' + ", engineVolume=" + engineVolume + '}';
    }

}


