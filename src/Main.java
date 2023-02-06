import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mechanic a1 = new Mechanic("Вася Пупкин","АБС");
        Mechanic b1 = new Mechanic("Петя Петров","АБС");
        Mechanic c1 = new Mechanic("Саша Белов","АБС");
        Mechanic d1 = new Mechanic("Петя Петров","АБС");
        Mechanic e1 = new Mechanic("Петя Петров","АБС");
        Mechanic f1 = new Mechanic("Петя Петров","АБС");
        Mechanic g1 = new Mechanic("Петя Петров","АБС");
        Mechanic h1 = new Mechanic("Петя Петров","АБС");
        Mechanic i1 = new Mechanic("Петя Петров","АБС");
        Mechanic j1 = new Mechanic("Петя Петров","АБС");
        List<Mechanic> mechanics = new ArrayList<>();
        mechanics.add(0,a1);
        mechanics.add(1,b1);
        mechanics.add(2,c1);
        mechanics.add(3,d1);
        mechanics.add(4,e1);
        mechanics.add(5,f1);
        mechanics.add(6,g1);
        mechanics.add(7,h1);
        mechanics.add(8,i1);
        mechanics.add(9,j1);
        for (int n = 0; n < mechanics.size(); n++) {
            System.out.println(mechanics.get(n));
        }
        Cars a = new Cars("BMW1", "X5M1", 2.0, Body.Van,Type.Cars,mechanics.get(0),mechanics.get(9));
        Cars b = new Cars("BMW2", "X5M2", 2.0, Body.Crossover,Type.Cars,mechanics.get(1),mechanics.get(8));
        Truck f = new Truck("Камаз", "2", 2.0, LoadCapacity.N1,Type.Truck,mechanics.get(2),mechanics.get(7));
        Truck g = new Truck("Камаз", "3", 2.0, LoadCapacity.N2,Type.Truck,mechanics.get(3),mechanics.get(6));
        Truck h = new Truck("Камаз", "4", 2.0, LoadCapacity.N3,Type.Truck,mechanics.get(4),mechanics.get(5));
        Bus i = new Bus("Школьный автобус", "1", 2.0, Capacity.SoSmall,Type.Bus,mechanics.get(5),mechanics.get(4));
        Bus j = new Bus("Школьный автобус", "2", 2.0, Capacity.Small,Type.Bus,mechanics.get(6),mechanics.get(3));
        Bus k = new Bus("Школьный автобус", "3", 2.0, Capacity.Average,Type.Bus,mechanics.get(7),mechanics.get(2));
        Bus l = new Bus("Школьный автобус", "4", 2.0, Capacity.Large,Type.Bus,mechanics.get(8),mechanics.get(1));
        Bus m = new Bus("Школьный автобус", "4", 2.0, Capacity.ExstraLarge,Type.Bus,mechanics.get(9),mechanics.get(0));
        try {
            a.getDiagnostics();
            f.getDiagnostics();
            m.getDiagnostics();
        }
        catch (MyException x){
            System.out.println("Автобусы диагностику не проходят");
        }
        System.out.println( );
        List<Transport> members = new ArrayList<>();
        members.add(0,a);
        members.add(1,b);
        members.add(2,f);
        members.add(3,g);
        members.add(4,h);
        members.add(5,i);
        members.add(6,j);
        members.add(7,k);
        members.add(8,l);
        members.add(9,m);
        for (int n = 0; n < members.size(); n++) {
            System.out.println(members.get(n));
        }
        a.getMechanics();
        ServiceStation.AddQueue(a);
        ServiceStation.AddQueue(b);
        Mechanic.ConductMaintenance();
        boolean b3;
        while (b3=ServiceStation.queue.poll() !=null){
            System.out.println(b3);
        }
    }
}