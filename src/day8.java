public class day8 {
    record StudentRecord(String course,String department){
    }
    static void main(){
        StudentRecord studentRecord = new StudentRecord("java","AI$DS");
        System.out.println(studentRecord.course());
        System.out.println(studentRecord.department());
    }
}



