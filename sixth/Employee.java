package sixth;
/**
 * Employee klasa sadrži ime, prezime, satnicu i broj radnih sati
 */
public class Employee {
    private String firstName;
    private String lastName;
    private int hourlyRate;
    private int hoursWorked;

    public Employee(String firstName, String lastName, int hourlyRate, int hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    /**
     * Funkcija za izračun iznosa plaće.
     * @return Funkcija vraća umnožak broja radnih sati i iznosa satnice.
     */
    public int getPayroll(){
        return hourlyRate*hoursWorked;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setHourlyRate(int hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }

    public void setHoursWorked(int hoursWorked){
        this.hoursWorked = hoursWorked;
    }
    
    public int getHoursWorked(){
        return hoursWorked;
    }
}
