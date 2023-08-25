import java.util.ArrayList;

public class Department {
    private String name;
    private int code;
    private String location;
    private double bugdet;
    private Employee employee;

    private String[] allEmployee = new String[10];
    // Constructor
    public Department(String name, int code, String location, double bugdet, Employee employee) {
        this.name = name;
        this.code = code;
        this.location = location;
        this.bugdet = bugdet;
        this.employee = employee;
    }

    // Method
    public void addEmployee(Employee employee){
        Employee empregado = new Employee("Deividi", 123456789, 13.565,"Manager");
        }

    public void removeEmployee(Employee employee){
        Employee empregad

    }

    public void removeEmployee(long id){

    }
    public void listAllEmployee(){

    }
    public void sizeOfEmployeed(){

    }

    // Get and Set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getBugdet() {
        return bugdet;
    }

    public void setBugdet(double bugdet) {
        this.bugdet = bugdet;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
