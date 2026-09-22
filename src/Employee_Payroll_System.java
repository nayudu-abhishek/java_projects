class Employee_Payroll_System {

    protected String name;
    protected double salary = 100;

    public double cal() {
        return salary;
    }
        public static void main(String[] args) {

            Manager n = new Manager();

            System.out.println(n.cal());
            System.out.println(n);
        }
    }

class Manager extends Employee_Payroll_System {

    private double bonus = 50;
    @Override
    public double cal() {
        System.out.println(super.cal());
        return salary + bonus;
    }
}


