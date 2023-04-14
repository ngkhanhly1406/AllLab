package Part4;

public class Student {
    private String name;
    private int age;
    private double mark;

    public Student (int rollNumber, String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMark() {
        return mark;
    }
    public String toString() {
        return name + "\t" + age + "\t" + mark;
    }


    public void setAge(int age) {
    }

    public void setName(String name) {
    }

    public void setMark(int mark) {
    }

    public int getRollNumber() {
        return 0;
    }
}



