package bank.t2108;

public class ValidateAccount {
    // kiểm tra đăng
    public final String MOBILE = "0904999999";
    public final String PASSWORLD = "Ngo Van Khoai";

    public boolean checkAcount(String mobile, String passworld) {
        if (mobile.equals(MOBILE)) {
            if (passworld.equals(PASSWORLD)) {
                System.out.println("Dang nhap thanh cong!");
                return true;
            } else {
                System.out.println("Mat khau sai, vui long dang nhap lai");
                return false;
            }
        } else {
            System.out.println("Kiem tra so  dien thoai, hoac passworld");
            return false;
        }
    }

}