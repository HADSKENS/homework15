import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    public ServiceStation() {
    }

    private static Queue<Transport> queue = new LinkedList<>();

    public void addQueue(Transport a) {
        queue.offer(a);
    }
    public void conductMaintenance(Mechanic a) {
        System.out.printf("%s Провел техобслуживание%n", a.getName());
        ServiceStation.queue.remove();
    }

}
