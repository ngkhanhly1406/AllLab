package classandobject;

import java.util.Scanner;

public class Student {
    private int id; // default
    // read
    public int getId(){
        return id;
    }
    //write
    public void setId(int id){
        this.id = id;
    }
    private String name;
    double theoryPoint;
    double practicePoint;
    static String school = "Fpt- Aptech";



    public Student(){

    }

    public Student(int id, String name, double theoryPoint, double practicePoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicePoint = practicePoint;
    }

    //user' define method
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id: ");
       // id = sc.nextInt();
        id = Integer.valueOf(sc.nextLine());
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Theory point: ");
        theoryPoint = sc.nextDouble();
        System.out.println("Practice point: ");
        practicePoint = sc.nextDouble();
    }









    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTheoryPoint() {
        return theoryPoint;
    }

    public void setTheoryPoint(double theoryPoint) {
        this.theoryPoint = theoryPoint;
    }

    public double getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(double practicePoint) {
        this.practicePoint = practicePoint;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theoryPoint=" + theoryPoint +
                ", practicePoint=" + practicePoint +
                '}';
    }
}
