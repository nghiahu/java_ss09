package baitap.bai8;

public class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;

    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else {
            System.out.println("Số tiền nạp không hợp lệ!");
        }
    }
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }else {
            System.out.println("Số dư không đủ");
        }
    }
    public void transfer(BankAccount recipient, double amount){
        if(amount <= balance){
            balance -= amount;
            recipient.balance += amount;
        }else {
            System.out.println("Số dư không đủ");
        }
    }

    public void display(){
        System.out.println("Số tài khoản: " + accountNumber);
        System.out.println("Chủ tài khoản: " + accountHolder);
        System.out.println("Số dư: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("KH001", "Nguyễn Tiến D", 1000);
        BankAccount account2 = new BankAccount("Hk002","Nguyễn Thị C", 800);
        System.out.println("Nạp tiền acc1");
        account1.deposit(500);
        account1.display();
        System.out.println("Nạp tiền acc2");
        account2.deposit(200);
        account2.display();
        System.out.println("Rút tiền acc1");
        account1.withdraw(800);
        account1.display();
        System.out.println("Rút tiền acc2");
        account2.withdraw(600);
        account2.display();
        System.out.println("Chuyển tiền acc1 -> acc2");
        account1.transfer(account2, 100);
        account1.display();
        account2.display();
    }
}
