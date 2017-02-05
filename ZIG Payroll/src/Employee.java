/**
 * Created by TheHogwartsExpress on 1/17/17.
 */

public class Employee {

    private String name;
    private double salary, bonus;

    public Employee(String theirName, double theirSalary, double plusBonus) {
        name = theirName;
        salary = theirSalary;
        bonus = plusBonus;}

    public String gettheirname() {return name;}

    public double gettheirSalary() {
        return salary;
    }

    public double getplusBonus() {
        return bonus;
    }
}
    class TestEmployee {

        public static void main(String[] args) {
            Employee e1 = new Employee("Liberty Zapata", 40000.0, 500.0);
            System.out.println("ZIG Payroll");
            System.out.println("\t-----------\t Employee \t-----------\t");
            System.out.println("Employee name: " + e1.gettheirname());
            System.out.println("Salary before bonus: $" + e1.gettheirSalary());
            System.out.println("Bonus: $" + e1.getplusBonus());
            System.out.println("Salary plus bonus: $" + (e1.getplusBonus() + e1.gettheirSalary()));

            Employee e2 = new Employee("Javier Zapata", 30000.0, 700.0);
            System.out.println("\t-----------\t Employee \t-----------\t");
            System.out.println("Employee name: " + e2.gettheirname());
            System.out.println("Salary before bonus: $" + e2.gettheirSalary());
            System.out.println("Bonus: $" + e2.getplusBonus());
            System.out.println("Salary plus bonus: $" + (e2.getplusBonus() + e2.gettheirSalary()));

            Employee e3 = new Employee("Maria Reyes", 80000.0, 200.0);
            System.out.println("\t-----------\t Employee \t-----------\t");
            System.out.println("Employee name: " + e3.gettheirname());
            System.out.println("Salary before bonus: $" + e3.gettheirSalary());
            System.out.println("Bonus: $" + e3.getplusBonus());
            System.out.println("Salary plus bonus: $" + (e3.getplusBonus() + e3.gettheirSalary()));

            System.out.println("\t-----------\t Report End -----------\t");
        }



}
