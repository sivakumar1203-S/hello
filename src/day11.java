/*import java.util.HashSet;
import java.util.Set;

public class day11 {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();
        set.add("Student1");
        set.add("Student2");
        set.add("Student1");
        set.add("Student1");
        System.out.println("set :");
        for(String s: set) {
            System.out.println(s);
        }

    }
}*/




import java.util.HashMap;
import java.util.Map;

public class day11 {
    static void main(String[] args) {
        Map<String, Object> person = new HashMap<>();
        person.put("ram",89);
        person.put("john",78);
        person.put("Aravindh",67);
        person.put("ramesh",90);
        System.out.println(person.get("percent"));
        person.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}
