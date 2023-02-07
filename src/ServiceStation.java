import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    static Queue<Transport> queue = new LinkedList<>();

    public static void addQueue(Transport a){
        queue.offer(a);
    }
}
