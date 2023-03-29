import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mức lương cơ bản cho nhân viên toàn thời gian: ");
        double fullTimeBaseSalary = sc.nextDouble();
        EmployeeFullTime ef = new EmployeeFullTime(fullTimeBaseSalary);

        System.out.println("Nhập mức lương cơ bản cho nhân viên bán thời gian: ");
        double partTimeBaseSalary = sc.nextDouble();
        EmployeePartTime ep = new EmployeePartTime(partTimeBaseSalary);

        System.out.println("Lương cho nhân viên toàn thời gian: " + ef.getSalary());
        System.out.println("Lương cho nhân viên bán thời gian: " + ep.getSalary());
    }
}