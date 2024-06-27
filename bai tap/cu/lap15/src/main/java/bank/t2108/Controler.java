package bank.t2108;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Controler {
    private static long balanceNumber = 1000000;
    List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();;

    public long getBalanceNumber(){
        return balanceNumber;
    }
    public static long transfer(long money){
        // kiem tra neu so tien nho hon 50.000
        // neu so tien chuyen lon hon
        //neu chuyen thanh cong
        return balanceNumber;

    }
    public void actionTransfer(){
        // thuc hien cac cong viec
    }
    public void getHistory(){

    }
    // ding dang so tien minh mong muon
    public static String fomatMoney(long money){
        DecimalFormat formater = new DecimalFormat("###,###,##0,00");
        //100
        return formater.format(money);

    }
}
