public class Mechanic {
    private static String name;
    private static String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }
    public static void ConductMaintenance(){
        System.out.println(name+" Провел техобслуживание");
        ServiceStation.queue.remove();
    }
    public static void RepairCar(){
        System.out.println(name+" Починил автомобиль");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
