public class CurrentAccount extends BankAccount {
    int tradeLicenseNumber;
    double maxWithLimit = Double.POSITIVE_INFINITY;
    String acType = "Current Account";
    public CurrentAccount(String memberName, double accountBalance, int tradeLicenseNumber) {
        super(memberName, accountBalance, 5000);


    }

    @Override
    void withdraw(double balance) {
        if (accountBalance - balance <= minimumBalance) {
            System.out.println("Minimum Balance limit exceeded");
        } else
            accountBalance -= balance;
    }
}