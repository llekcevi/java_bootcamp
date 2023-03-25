package sixth;

public class sixth {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        payroll.addEmployee(new Employee("Ivo", "Ivić", -20, 40));
        payroll.addEmployee(new Employee("Ana", "Anić", 25, 35));
        payroll.addEmployee(new Employee("Petar", "Petrović", 10, 50));
        payroll.addEmployee(new Employee("Jana", "Janić", 30, 20));
        payroll.addEmployee(new Employee("Marko", "Marković", 15, 45));

    }
}
