public class EmployeeFullTime extends SalaryPolicy {
    private double baseSalaryPolicy;
    public EmployeeFullTime(double baseSalary){
        this.baseSalaryPolicy = baseSalary;
    }

    @Override
    public double getSalary() {
        return baseSalaryPolicy * 2.0;
    }
}
