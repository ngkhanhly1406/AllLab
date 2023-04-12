
package examl;

import java.io.*;
import java.util.*;

class Employee {
    private int id;
    private String name;
    private String contact;
    private String email;

    public Employee(int id, String name, String contact, String email) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email + "]";
    }

}

public class EmployeeManagementSystem {
    private static ArrayList<Employee> employees = new ArrayList<Employee>();
    private static final String FILE_NAME = "employees.txt";

    public static void main(String[] args) {
        loadData();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("\n1) . Add Employee to the DataBase\n2) . Search for Employee\n3) . Edit Employee details\n4) . Delete Employee Details\n5) . Display all Employees working in this company\n6) . EXIT \n Enter your choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addEmployee(sc);
                    break;
                case 2:
                    searchEmployee(sc);
                    break;
                case 3:
                    editEmployee(sc);
                    break;
                case 4:
                    deleteEmployee(sc);
                    break;
                case 5:
                    displayEmployees();
                    break;
                case 6:
                    saveData();
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
        sc.close();
    }

    private static void addEmployee(Scanner sc) {
        System.out.println("Enter employee ID:");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter employee name:");
        String name = sc.nextLine();
        System.out.println("Enter employee contact number:");
        String contact = sc.nextLine();
        System.out.println("Enter employee email:");
        String email = sc.nextLine();
        Employee employee = new Employee(id, name, contact, email);
        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    private static void searchEmployee(Scanner sc) {
        System.out.println("Enter employee ID:");
        int id = sc.nextInt();
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println(employee);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    private static void editEmployee(Scanner sc) {
        System.out.println("Enter employee ID:");
        int id = sc.nextInt();
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println("Enter new employee name (or leave blank to keep existing):");
                sc.nextLine(); // consume newline
                String name = sc.nextLine();
                if (!name.isEmpty()) {
                    employee.setName(name);
                }
                System.out.println("Enter new employee contact number (or leave blank to keep existing):");
                String contact = sc.nextLine();
                if (!contact.isEmpty()) {
                    employee.setContact(contact);
                }
                System.out.println("Enter new employee email (or leave blank to keep existing):");
                String email = sc.nextLine();
                if (!email.isEmpty()) {
                    employee.setEmail(email);
                }
                System.out.println("Employee details updated successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    private static void deleteEmployee(Scanner sc) {
        System.out.println("Enter employee ID:");
        int id = sc.nextInt();
        boolean found = false;
        Iterator<Employee> itr = employees.iterator();
        while (itr.hasNext()) {
            Employee employee = itr.next();
            if (employee.getId() == id) {
                itr.remove();
                System.out.println("Employee deleted successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }
    }

    private static void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }

    private static void loadData() {
        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                employees = (ArrayList<Employee>) ois.readObject();
                ois.close();
                fis.close();
            }
        } catch (Exception e) {
            System.out.println("*******************Welcome to the Employee Management System************* " + e.getMessage());
        }
    }

    private static void saveData() {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(employees);
            oos.close();
            fos.close();
            System.out.println("Data saved successfully.");
        } catch (Exception e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
}

