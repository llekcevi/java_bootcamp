package sixth;
/**
 * Payroll klasa ispisuje ime, prezime i računa iznos plaće
 */
public class Payroll {

    public Payroll(){}
    public void addEmployee(Employee employee){
        System.out.println(employee.getFirstName() + " " + employee.getLastName() + ": " + employee.getPayroll());
    }
}
