import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    Transport a;
    static Queue<Transport> queue = new LinkedList<>();

    public static void AddQueue(Transport a){
        queue.offer(a);
    }
}
