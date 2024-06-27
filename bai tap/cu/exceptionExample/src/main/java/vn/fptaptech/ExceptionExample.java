package vn.fptaptech;
import java.io.IOException;
import java.util.Scanner;
public class ExceptionExample {
    public void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("Access denied - you must");
        }else {
            System.out.println("Access granted");
        }
    }
    public int setAge() throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("hay nhap tuoi: ");
        int age = scanner.nextInt();
        // khong xu li ngoai le tai day
        if(age <= 0) throw new IOException("tuoi khong duoc nho hon hoac bang 0");
        return age;
    }

}
