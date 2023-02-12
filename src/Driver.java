import java.util.HashSet;
import java.util.Set;

public class Driver {
    private String name;
    private int years;
    public Driver() {
    }

    public Driver(String name, int years) {
        this.name = name;
        this.years = years;
    }

    @Override
    public String toString() {
        return "Drivers{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}

