import javax.swing.*;
import java.util.*;

public class Bank {
    static public ArrayList<BankAccount> list = new ArrayList<BankAccount>();
    static String[] alist = new String[list.size()];
    public Bank()
    {

        for(int i=0;i<list.size();i++)
        {
            //alist[i] = list.get(i).accountNumber;
        }

    }

    public static void main(String[] args) {

        int option1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 for SavingsAccount");
            System.out.println("Enter 2 for CurrentAccount");
            System.out.println("Enter 3 for StudentAccount");
            System.out.println("Enter 4 for Show All Account");
            System.out.println("Enter 0 to exit");
            option1 = sc.nextInt();
            if (option1 == 1) {

                String name;
                System.out.println("Enter Name: ");
                name = sc.next();
                double accountBalance;
                System.out.println("Enter account balance");
                accountBalance = sc.nextDouble();
                System.out.println("Enter maximum withdraw limit");
                double maxWithLimit = sc.nextDouble();
                SavingsAccount sa = new SavingsAccount(name, accountBalance, maxWithLimit);
                list.add(sa);
                while (true) {
                    String option2;
                    System.out.println("Enter 1 or d to deposit money");
                    System.out.println("Enter 2 to withdraw money");
                    System.out.println("Enter 3 to display");
                    System.out.println("Enter 0 to exit");
                    option2 = sc.next();
                    if (option2.equals("1") || option2.equals("d")) {
                        System.out.println("Enter balance you want to deposit");
                        double balance;
                        balance = sc.nextDouble();
                        sa.deposit(balance);
                    }
                    if (option2.equals("2")) {
                        System.out.println("Enter the amount you want to withdraw");
                        double balance = sc.nextDouble();
                        sa.withdraw(balance);

                    }
                    if (option2.equals("3")) {
                        double balance = sa.getBalance();
                        System.out.println(balance);
                    }
                    if (option2.equals("0")) {
                        break;
                    }
                }

            }
            if (option1 == 2) {
                String name;
                System.out.println("Enter Name: ");
                name = sc.next();
                double accountBalance;
                System.out.println("Enter account balance");
                accountBalance = sc.nextDouble();
                System.out.println("Enter trade license number");
                int tradeLicenseNumber = sc.nextInt();
                CurrentAccount ca = new CurrentAccount(name, accountBalance, tradeLicenseNumber);
                list.add(ca);
                while (true) {
                    String option2;
                    System.out.println("Enter 1 or d to deposit money");
                    System.out.println("Enter 2 to withdraw money");
                    System.out.println("Enter 3 to display");
                    System.out.println("Enter 0 to exit");
                    option2 = sc.nextLine();
                    if (option2.equals("1") || option2.equals("d")) {
                        System.out.println("Enter balance you want to deposit");
                        double balance = sc.nextDouble();
                        ca.deposit(balance);
                    }
                    if (option2.equals("2")) {
                        System.out.println("Enter the amount you want to withdraw");
                        double balance = sc.nextDouble();
                        ca.withdraw(balance);

                    }
                    if (option2.equals("3")) {
                        double balance = ca.getBalance();
                        System.out.println(balance);
                    }
                    if (option2.equals("0")) {
                        break;
                    }
                }

            }
            if (option1 == 3) {
                String name, institutionName;
                System.out.println("Enter Name: ");
                name = sc.next();
                double accountBalance;
                System.out.println("Enter account balance");
                accountBalance = sc.nextDouble();
                System.out.println("Enter institution name: ");
                institutionName = sc.next();
                StudentAccount sta = new StudentAccount(name, accountBalance, institutionName);
                list.add(sta);
                while (true) {
                    String option2;
                    System.out.println("Enter 1 or d to deposit money");
                    System.out.println("Enter 2 to withdraw money");
                    System.out.println("Enter 3 to display");
                    System.out.println("Enter 0 to exit");
                    option2 = sc.nextLine();
                    if (option2.equals("1") || option2.equals("d")) {
                        System.out.println("Enter balance you want to deposit");
                        double balance = sc.nextDouble();
                        sta.deposit(balance);
                    }
                    if (option2.equals("2")) {
                        System.out.println("Enter the amount you want to withdraw");
                        double balance = sc.nextDouble();
                        sta.withdraw(balance);

                    }
                    if (option2.equals("3")) {
                        double balance = sta.getBalance();
                        System.out.println(balance);
                    }
                    if (option2.equals("0")) {
                        break;
                    }
                }

            }
            if (option1 == 4) {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
            }
            if (option1 == 0) {
                break;
            }

        }


    }
}