public class Main {
    public static void main(String[] args) {
        DriverLicenseB Adam = new DriverLicenseB("Adam",true,12);
        DriverLicenseB Eva = new DriverLicenseB("Eva",true,2);
        DriverLicenseC Egor = new DriverLicenseC("Egor",true,6);
        DriverLicenseC Katya = new DriverLicenseC("Katya",true,8);
        DriverLicenseD Anton = new DriverLicenseD("Anton",true,25);
        DriverLicenseD Sveta = new DriverLicenseD("Sveta",true,1);
        Cars a = new Cars("BMW1","X5M1",2.0, Body.Sedan);
        Cars b = new Cars("BMW2","X5M2",2.0,Body.Crossover);
        Truck f = new Truck("Камаз","2",2.0);
        Truck g = new Truck("Камаз","3",2.0);
        Truck h = new Truck("Камаз","4",2.0);
        Bus i = new Bus("Школьный автобус","1",2.0);
        Bus j = new Bus("Школьный автобус","2",2.0);
        Bus k = new Bus("Школьный автобус","3",2.0);
        Bus l = new Bus("Школьный автобус","4",2.0);
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
        }
    }