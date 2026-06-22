public class day14 {
    static class Student {
        String name;
        int regNO;
        String dob;

        Student(Builder builder) {
            this.name = builder.name;
            this.regNO = builder.regNo;
            this.dob = builder.dob;
        }
        static class Builder {
            private String name;
            private int regNo;
            private String dob;

            public Builder name(String nameValue) {
                this.name = nameValue;
                return this;
            }
            public Builder regNo(int regNoValue) {
                this.regNo = regNoValue;
                return this;
            }
            public Builder dob(String dobValue) {
                this.dob = dobValue;
                return this;
            }
            public Student build() {
                return new Student(this);
            }
        }
    }
    static void main() {
        Student student = new Student.Builder()
                .name("Siva")
                .regNo(112023)
                .dob("2007-12-03")
                .build();
        System.out.println(student.name);
        System.out.println(student.regNO);
        System.out.println(student.dob);
    }
}