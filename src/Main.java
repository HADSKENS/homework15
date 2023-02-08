import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mechanic a1 = new Mechanic("Вася Пупкин1", "АБС");
        Mechanic b1 = new Mechanic("Петя Петров2", "АБС");
        Mechanic c1 = new Mechanic("Саша Белов3", "АБС");
        Mechanic d1 = new Mechanic("Петя Петров4", "АБС");
        Mechanic e1 = new Mechanic("Петя Петров5", "АБС");
        Mechanic f1 = new Mechanic("Петя Петров6", "АБС");
        Mechanic g1 = new Mechanic("Петя Петров7", "АБС");
        Mechanic h1 = new Mechanic("Петя Петров8", "АБС");
        Mechanic i1 = new Mechanic("Петя Петров9", "АБС");
        Transport abc = new Transport() {
            @Override
            public void getDiagnostics() throws MyException {

            }
        };
        abc.mechanics.add(0, a1);
        abc.mechanics.add(1, b1);
        abc.mechanics.add(2, c1);
        abc.mechanics.add(3, d1);
        abc.mechanics.add(4, e1);
        abc.mechanics.add(5, f1);
        abc.mechanics.add(6, g1);
        abc.mechanics.add(7, h1);
        abc.mechanics.add(8, i1);
        for (int i = 0; i < abc.mechanics.size(); i++) {
            System.out.println(abc.mechanics.get(i));
        }
        Cars a = new Cars("BMW1", "X5M1", 2.0, Body.Van, Type.Cars, abc.mechanics);
        Cars b = new Cars("BMW2", "X5M2", 2.0, Body.Crossover, Type.Cars, abc.mechanics);
        Truck f = new Truck("Камаз", "2", 2.0, LoadCapacity.N1, Type.Truck, abc.mechanics);
        Truck g = new Truck("Камаз", "3", 2.0, LoadCapacity.N2, Type.Truck, abc.mechanics);
        Truck h = new Truck("Камаз", "4", 2.0, LoadCapacity.N3, Type.Truck, abc.mechanics);
        Bus i = new Bus("Школьный автобус", "1", 2.0, Capacity.SoSmall, Type.Bus, abc.mechanics);
        Bus j = new Bus("Школьный автобус", "2", 2.0, Capacity.Small, Type.Bus, abc.mechanics);
        Bus k = new Bus("Школьный автобус", "3", 2.0, Capacity.Average, Type.Bus, abc.mechanics);
        Bus l = new Bus("Школьный автобус", "4", 2.0, Capacity.Large, Type.Bus, abc.mechanics);
        Bus m = new Bus("Школьный автобус", "4", 2.0, Capacity.ExstraLarge, Type.Bus, abc.mechanics);
        try {
            a.getDiagnostics();
            f.getDiagnostics();
            m.getDiagnostics();
        } catch (MyException x) {
            System.out.println("Автобусы диагностику не проходят");
        }
        System.out.println();
        List<Transport> members = new ArrayList<>();
        members.add(0, a);
        members.add(1, b);
        members.add(2, f);
        members.add(3, g);
        members.add(4, h);
        members.add(5, i);
        members.add(6, j);
        members.add(7, k);
        members.add(8, l);
        members.add(9, m);
        for (int n = 0; n < members.size(); n++) {
            System.out.println(members.get(n));
        }
        ServiceStation.addQueue(a);
        ServiceStation.addQueue(b);
        a1.conductMaintenance();
        boolean b3;
        while (b3 = ServiceStation.queue.poll() != null) {
            System.out.println(b3);
        }
        System.out.println();
        a.getMechanics();
    }
}