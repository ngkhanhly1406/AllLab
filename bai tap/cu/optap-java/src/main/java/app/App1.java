package app;

import classandobject.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
     //   Student student = new Student();
       // student.input();
        //System.out.println(student);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien ");
        int size = sc.nextInt();


        ArrayList<Student>listStudent = new ArrayList<>();
        for(int i=0; i< size; i++){
            System.out.println("Nhap sv thu "+(i+1));
            Student student = new Student();
            student.input();
            listStudent.add(student);
        }
        System.out.println("Danh scah sinh vien ");
        for (Student student : listStudent){
            System.out.println(student);
        }
        sc.nextLine();
        System.out.println("tim ten sinh vien");
        String name = sc.nextLine();
        for(int i = 0; i< size; i++){
            if(listStudent.get(i).getName().equalsIgnoreCase(name)){
                System.out.println(listStudent.get(i));
                listStudent.remove(i);
            }
        }
            System.out.println("Danh sach sinh vien sau khi remove ");
            for(Student student : listStudent){
                System.out.println(student);
            }
    }
}
