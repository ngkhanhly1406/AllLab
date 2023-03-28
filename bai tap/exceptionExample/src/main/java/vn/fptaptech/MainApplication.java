package vn.fptaptech;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApplication {
    public static void main (String[] args) {
        ExceptionExample exceptionExample = new ExceptionExample();
        exceptionExample.checkAge(18); /// goi checkAge

        // xu li ngoai le tai day
   //     try {
   //         int age = exceptionExample.setAge();
     //       System.out.println("Tuoi vua nhap la: " + age);
   //     }catch (IOException e ){
    //        System.out.println("Tuoi vua nhap khong hop le: "  +e.toString());
    //    }
        //Custom Exception => tuy bien exception
        try{
            int age = inputAge();
            System.out.println("tuoi vua nhap:" + age);

        }catch (AgeCheckingException e){
            System.out.println(e.getMessage());
        }
    }
    static int inputAge() throws AgeCheckingException{
        int age = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap tuoi");
        try {
            age = scanner.nextInt();
            if (age < 0) throw new AgeCheckingException("tuoi khong duoc nho hon 0");
        }catch (InputMismatchException e) {
            throw new AgeCheckingException("tuoi phai la mot so");

        }return age;
    }
}
