import java.util.ArrayList;
public class day10 {
    static void main() {
        ArrayList<String> list= new ArrayList<String> ();
        //String[] StudentsList={"Siva","Vicky","Ram","Yuha","Diwakar"};
        //System.out.println(StudentsList.length);
        list.add("Siva");
        list.add("Vicky");
        list.add("Ram");
        list.add("Yuha");
        list.add("Diwakar");
        for (String s:  list){
            System.out.println(s);
        }
        list.remove("Ram");
        System.out.println();
        for (String s:  list){
            System.out.println(s);
        }
    }
}