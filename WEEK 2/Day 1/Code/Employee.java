// package WEEK 2.Day 1.Code;

public class Employee extends User{
    // protected String name;
    // protected String department;

    // public void work(){
    //     System.out.println("Employee is working now");
    // }

    private String employeeId;

    public Employee(String username, String email, String employeeId){
        super(username, email);
        this.employeeId = employeeId;
    }

    public static void main(String[] args){
        Employee emp = new Employee("Hotmangasi", "hotmangasi@gmail.com", "EMP001");

        System.out.println("Username: "+ emp.username);
        System.out.println("Email: "+ emp.email);
        System.out.println("ID: "+ emp.employeeId);
    }
}
