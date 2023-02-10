import java.util.HashSet;
import java.util.Set;

public class Drivers {
    private String name;
    private int years;
    public Drivers() {
    }

    public Drivers(String name, int years) {
        this.name = name;
        this.years = years;
    }
    Drivers test;
    Set<Drivers> driversSet= new HashSet<>();
    public void addDrivers(Drivers a){
        if(driversSet.contains(a)){
            return;
        }
        else {
            driversSet.add(a);
        }
    }

    @Override
    public String toString() {
        return "Drivers{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
