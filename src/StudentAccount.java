public class StudentAccount extends SavingsAccount {
    String institutionName;
    String acType = "Student Account";

    public StudentAccount(String memberName, double accountBalance, String institutionName) {
        super(memberName, accountBalance, 20000.00);
        this.institutionName = institutionName;
        minimumBalance = 100.00;
    }
}