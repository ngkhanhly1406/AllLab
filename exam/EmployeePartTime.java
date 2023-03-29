public class EmployeePartTime extends SalaryPolicy{
    private double baseSalary;

    public EmployeePartTime(double baseSalary){
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }
}
