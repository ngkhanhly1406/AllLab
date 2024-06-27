package bank.t2108;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class TransactionHistory {
    private Long id;
    private LocalDate dayTranding;
    private String description;
    private String beneficiaryAccount;
    private long money;

    public TransactionHistory(String description, String beneficiaryAccount, long money) {
        this.id = IdGenerate.getNewID(); // id tu dong tang
        this.dayTranding = LocalDate.now(); // lay ngay hien tai
        this.description = description;
        this.beneficiaryAccount = beneficiaryAccount;
        this.money = money;
    }

    public String getBeneficiaryAccount() {
        return beneficiaryAccount;
    }

    public void setBeneficiaryAccount(String beneficiaryAccount) {
        this.beneficiaryAccount = beneficiaryAccount;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDayTranding() {
        return dayTranding;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String toString() {
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return id + " - " + dayTranding.format(myFormatter) + " - " + description + " - "
                + Controler.fomatMoney(money) + " - " + beneficiaryAccount + "\n";
    }


}

