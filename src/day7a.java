public class day7a {
    interface Employee {

        String solveProblem();

        String work();
    }
    static class BankEmployee implements Employee {
        String name;
        String id;
        int salary;

        BankEmployee(String name, String id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        @Override
        public String solveProblem() {
            System.out.println("Problem Solved...");
            return "Problem Solved";
        }

        @Override
        public String work() {
            System.out.println("Work Finished");
            return "Work Finished";
        }

        void display() {
            System.out.println("Name:" + "name");
            System.out.println("ID:" + "id");
            System.out.println("Salary:" + "salary");
        }
    }
        class CheckingEmployee implements Employee {
            @Override
            public String solveProblem() {
                System.out.println("Problem Solved...");
                return "Problem Solved";
            }

            public String work() {
                System.out.println("Work Finished");
                return "Work Finished";
            }
        }

        public static void main(String[] args) {
            BankEmployee bankEmployee = new BankEmployee("siva","1234",30000);
            bankEmployee.solveProblem();
            bankEmployee.work();
        }
    }
