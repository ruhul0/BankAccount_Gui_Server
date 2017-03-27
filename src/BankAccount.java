public abstract class BankAccount {
    String memberName, accountNumber,acType="Bank";
    double accountBalance, minimumBalance;
    double maxWithLimit=Double.POSITIVE_INFINITY;
    double interestbalance=0;

    public BankAccount(String memberName, double accountBalance, double minimumBalance) {
        super();
        this.memberName = memberName;
        this.accountBalance = accountBalance;
        this.minimumBalance = minimumBalance;
        accountNumber = 10000 + (Math.random() * 89999) + "";
    }

    void deposit(double balance) {
        accountBalance += balance;
    }

    abstract void withdraw(double balance);

    double getBalance() {
        System.out.println(accountNumber);
        return accountBalance;
    }
}