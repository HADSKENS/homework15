public class Main {
    public static void main(String[] args) {
        Cars a = new Cars("BMW1", "X5M1", 2.0, Body.Van,Type.Cars);
        Cars b = new Cars("BMW2", "X5M2", 2.0, Body.Crossover,Type.Cars);
        Truck f = new Truck("Камаз", "2", 2.0, LoadCapacity.N1,Type.Truck);
        Truck g = new Truck("Камаз", "3", 2.0, LoadCapacity.N2,Type.Truck);
        Truck h = new Truck("Камаз", "4", 2.0, LoadCapacity.N3,Type.Truck);
        Bus i = new Bus("Школьный автобус", "1", 2.0, Capacity.SoSmall,Type.Bus);
        Bus j = new Bus("Школьный автобус", "2", 2.0, Capacity.Small,Type.Bus);
        Bus k = new Bus("Школьный автобус", "3", 2.0, Capacity.Average,Type.Bus);
        Bus l = new Bus("Школьный автобус", "4", 2.0, Capacity.Large,Type.Bus);
        Bus m = new Bus("Школьный автобус", "4", 2.0, Capacity.ExstraLarge,Type.Bus);
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);
        f.startMove();
        System.out.println(g);
        g.startMove();
        System.out.println(h);
        h.startMove();
        System.out.println(i);
        i.startMove();
        System.out.println(j);
        j.startMove();
        System.out.println(k);
        k.startMove();
        System.out.println(l);
        l.startMove();
        System.out.println(m);
        m.printType();
        a.printType();
        f.printType();
        try {
            a.getDiagnostics();
            f.getDiagnostics();
            m.getDiagnostics();
        }
        catch (MyException x){
            System.out.println("Автобусы диагностику не проходят");
        }
    }
}