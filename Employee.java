public class Employee{
    String name="joy";
    int salary = 30000;
    int ID = 123;

    public void Employeedetails(){
        System.out.println("Name of employee = " +name);
        System.out.println("\nSalary = " +salary);
        System.out.println("\nEmployee ID = " +ID);
       }

       public static void main(String[] args){
        Employee e = new Employee();
        e.Employeedetails();
       }
}