import java.util.LinkedList;
public class day10_linked {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("Blue");
        queue.add("Red");
        queue.add("Black");
        queue.add("Green");
        queue.add("Violet");
        while(!queue.isEmpty()) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);
    }
}