public class Employee extends Devops_engineer{
    String name;
    int salary ;
    int ID ;

    public void Employeedetails(){
        System.out.println("Name of employee = " +name);
        System.out.println("\nSalary = " +salary);
        System.out.println("\nEmployee ID = " +ID);
       }

       public static void main(String[] args){
        Employee e = new Employee();
        e.name="joy";
        e.salary=30000;
        e.ID=123;
        e.Employeedetails();
        e.add_Bonus();
       }
}