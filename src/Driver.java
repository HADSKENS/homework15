public abstract class Driver {
    String name;
    Boolean driverLicense;
    int experience;

    public Driver(String name, Boolean driverLicense, int experience) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.experience = experience;
    }

    public void driverFinishMove() {
        System.out.println(name+" Заглушил двигатель");
    }
    public void driverStartMove(){
        System.out.println(name+" Начал движение");
    }
    public void refuel(){
        System.out.println(name+" Остановился на дозаправку");
    }
}
class DriverLicenseB extends Driver{
    public DriverLicenseB(String name, Boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }
}
class DriverLicenseC extends Driver{
    public DriverLicenseC(String name, Boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }
}
class DriverLicenseD extends Driver{
    public DriverLicenseD(String name, Boolean driverLicense, int experience) {
        super(name, driverLicense, experience);
    }
}
