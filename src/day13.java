/*
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class day13 {
    static void main() {
        Path path = Path.of("files","report.txt");


        try{
            List<String> data = Files.readAllLines(path);

        for (String line : data) {
            System.out.println(line);
        }


        //Write
            List<String> newData = new ArrayList<>();
        newData.add("Student1");
        newData.add("Student2");
        newData.add("Student3");
        newData.add("Student4");
        newData.add("Student5");

        } catch (IOException io){
            io.printStackTrace();
        }
    }
}
*/
static void main(){
    Path path = Path.of("files","students.csv");
    try {
        List<String> students = Files.readAllLines(path);

        for (String line : students) {
            String[] row = line.split(",");
            for(int i = 0; i < row.length; i++){
                System.out.print(row[i]+" ");
            }
            System.out.println();
        }
    } catch (IOException io) {
        io.printStackTrace();
    }
}