public class Employee {

    private String Name;
    private String age;
    private String department;

    public Employee()
    {

    }
    public Employee(String Name,String age,String department)
    {
        this.Name=Name;
        this.department=department;
        this.age=age;

    }

    public  void printEmpData()
    {
        System.out.println(Name+" "+age+" "+department);
            }
}
