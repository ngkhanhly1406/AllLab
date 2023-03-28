package bank.t2108;

import java.util.Scanner;
public class Application {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ValidateAccount validate = new ValidateAccount();
        Controler controler = new Controler();
        boolean isCheck = false;
        while (!isCheck){
            System.out.println("Nhap so dien thoai: ");
            String mobile = sc.nextLine();

            System.out.println("Nhap mat khau: ");
            String passworld = sc.nextLine();

            isCheck = validate.checkAcount(mobile, passworld);
        }
        while (true){
            menu();
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("So du: ");
                    long balance = controler.getBalanceNumber();
                    System.out.println(Controler.fomatMoney(balance));
                    break;
                case 2:
                    controler.actionTransfer();
                    break;
                case 3:
                    System.out.println("Lich su giao dich");
                    controler.getHistory();
                    break;
                case 0:
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong co lua chon nay");
                    break;

            }
        }

    }
public static void menu() {
    System.out.println("lua chon cua ban: ");
    System.out.println("1 : xem so du tai khoan: ");
    System.out.println("2 : chuyen khoan: ");
    System.out.println("3 : xem lich su giao dich: ");
    System.out.println("0 : thoat");
     }
}
