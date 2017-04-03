import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;


public class Gui implements ActionListener {
    static public ArrayList<BankAccount> list = new ArrayList<BankAccount>();
    public String institutionName0,memberName0, accountNumber0;
    double accountBalance0 = 0.0, minimumBalance0 = 0.0, interestbalance0 = 0.0, maxWithLimit0 = 0.0;
    int tradeLicenseNumber0;
    JTextField amount1 = new JTextField();
    JLabel error = new JLabel();
    JFrame user = new JFrame("Bank Account");
    JFrame newUserFrame = new JFrame("New User:");
    JFrame accountType = new JFrame("New User");
    JFrame existing = new JFrame("Existing user");
    JFrame exist = new JFrame("Existing user function");
    int checkAccount = 0;
    JLabel amount = new JLabel("Amount:");
    JLabel accountBalance1 = new JLabel();
    JLabel accountBalance = new JLabel("Account Balance:");
    JLabel accountName = new JLabel("Account Name:");
    JLabel accountnumber1 = new JLabel();
    JLabel accountnumber = new JLabel("Account Number:");
    JButton withdraw = new JButton("Withdraw");
    JButton deposit = new JButton("Deposit");

    PrintWriter pw = null;

    JLabel name = new JLabel("Name:");
    JTextField name1 = new JTextField();

    JLabel aBalance = new JLabel("Account Balance:");
    JTextField aBalance1 = new JTextField();

    JLabel minBalance = new JLabel("Minimum Balance:");
    JTextField minBalance1 = new JTextField();

    JLabel maxWithLimit = new JLabel("Maximum withdraw limit:");
    JTextField maxWithLimit1 = new JTextField();

    JLabel institutionName = new JLabel("Institution Name:");
    JTextField institutionName1 = new JTextField("");
    JTextField tradeLicenseNumber1 = new JTextField("");
    int check = 0;

/*    JTextField accountNumber1 = new JTextField();*/

/*    JLabel name = new JLabel("Name:");
    JTextField name1 = new JTextField();

    JLabel aBalance = new JLabel("Account Balance:");
    JTextField aBalance1 = new JTextField();

    JLabel minBalance = new JLabel("Minimum Balance:");
    JTextField minBalance1 = new JTextField();

    JLabel maxWithLimit = new JLabel("Maximum withdraw limit:");
    JTextField maxWithLimit1 = new JTextField();

    JLabel institutionName = new JLabel("Institution Name:");
    JTextField institutionName1 = new JTextField();*/

    JLabel tradeLicenseNumber3 = new JLabel("Trade License Number:");


    JButton Done  = new JButton("Done");
    JButton Back = new JButton("Back");
    JFrame AccountNumber = new JFrame("Account Numbers");


    int i;
    int j=0;

    public Gui() {

        user.setSize(500,700);
        user.getContentPane().setBackground(Color.gray);
        user.setVisible(true);
        user.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        user.setLayout(null);
        JLabel userlabel = new JLabel("Choose user type");
        user.add(userlabel);
        userlabel.setVisible(true);
        userlabel.setBounds(0,0,100,50);
        JButton newuser = new JButton("New User");
        user.add(newuser);
        newuser.setBackground(Color.white);
        newuser.setVisible(true);
        newuser.setBounds(0,51,300,30);
        JButton existinguser = new JButton("Existing User");
        user.add(existinguser);
        existinguser.setVisible(true);
        existinguser.setBackground(Color.white);
        existinguser.setBounds(0,101,300,30);

        JButton readFromFile = new JButton("Read From File");
        user.add(readFromFile);
        readFromFile.setVisible(true);
        readFromFile.setBounds(0, 151, 300, 30);
        readFromFile.setBackground(Color.white);
        readFromFile.addActionListener(new readFile());

        newuser.addActionListener(new newuser());
        existinguser.addActionListener(new existing());

    }

    public static void main(String[] args) {

        new Gui();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class newuser implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            accountType.setSize(500,700);
            accountType.getContentPane().setBackground(Color.GRAY);
            accountType.setVisible(true);
            accountType.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            accountType.setLayout(null);
            JLabel at = new JLabel("Select Account Type");
            at.setBackground(Color.white);
            accountType.add(at);
            at.setVisible(true);
            at.setBounds(0,0,150,50);
            JButton currentaccount = new JButton("Current Account");
            currentaccount.setBackground(Color.white);
            currentaccount.setBounds(0,51,150,30);
            accountType.add(currentaccount);
            currentaccount.setVisible(true);
            JButton savingsaccount = new JButton("Saving Account");
            savingsaccount.setBackground(Color.white);
            savingsaccount.setBounds(0,101,150,30);
            accountType.add(savingsaccount);
            savingsaccount.setVisible(true);
            JButton studentaccount = new JButton("Student Account");
            studentaccount.setBackground(Color.white);
            studentaccount.setBounds(0,151,150,30);
            studentaccount.setVisible(true);
            accountType.add(studentaccount);
            JButton back = new JButton("Back");
            back.setBackground(Color.white);
            back.setVisible(true);
            back.setBounds(0,201,150,30);
            accountType.add(back);
            back.addActionListener(new home());
            savingsaccount.addActionListener(new createsavingsaccount());
            studentaccount.addActionListener(new createStudentAccount());
            currentaccount.addActionListener(new createCurrentAccount());

            user.dispose();

        }


    }

    public class createAccount implements ActionListener {

        public createAccount() {

            newUserFrame.setSize(500, 700);
            newUserFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            newUserFrame.getContentPane().setBackground(Color.GRAY);
            newUserFrame.setLayout(null);
            newUserFrame.setVisible(true);


            newUserFrame.add(name);
            name.setVisible(true);
            name.setBackground(Color.white);
            name.setBounds(0, 0, 150, 50);

            newUserFrame.add(name1);
            name1.setVisible(true);
            name1.setBackground(Color.white);
            name1.setBounds(0, 51, 150, 30);


            newUserFrame.add(aBalance);
            aBalance.setVisible(true);
            aBalance.setBackground(Color.white);
            aBalance.setBounds(0, 101, 150, 50);

            newUserFrame.add(aBalance1);
            aBalance1.setVisible(true);
            aBalance1.setBackground(Color.white);
            aBalance1.setBounds(0, 151, 150, 30);


            newUserFrame.add(minBalance);
            minBalance.setVisible(true);
            minBalance.setBackground(Color.white);
            minBalance.setBounds(0, 201, 150, 50);

            newUserFrame.add(minBalance1);
            minBalance1.setVisible(true);
            minBalance1.setBackground(Color.white);
            minBalance1.setBounds(0, 251, 150, 30);


            newUserFrame.add(maxWithLimit);
            maxWithLimit.setVisible(true);
            maxWithLimit.setBackground(Color.white);
            maxWithLimit.setBounds(0, 301, 150, 50);

            newUserFrame.add(maxWithLimit1);
            maxWithLimit1.setVisible(true);
            maxWithLimit1.setBackground(Color.white);
            maxWithLimit1.setBounds(0, 351, 150, 30);


            newUserFrame.add(institutionName);
            institutionName.setVisible(true);
            institutionName.setBackground(Color.white);
            institutionName.setBounds(0, 401, 150, 50);

            newUserFrame.add(institutionName1);
            institutionName1.setVisible(true);
            institutionName1.setBackground(Color.white);
            institutionName1.setBounds(0, 451, 150, 30);

            newUserFrame.add(tradeLicenseNumber3);
            tradeLicenseNumber3.setVisible(true);
            tradeLicenseNumber3.setBackground(Color.white);
            tradeLicenseNumber3.setBounds(0, 501, 150, 50);

            newUserFrame.add(tradeLicenseNumber1);
            tradeLicenseNumber1.setVisible(true);
            tradeLicenseNumber1.setBackground(Color.white);
            tradeLicenseNumber1.setBounds(0, 551, 150, 30);


            newUserFrame.add(Done);
            Done.setVisible(true);
            Done.setBackground(Color.white);
            Done.setBounds(0, 601, 100, 30);

            newUserFrame.add(Back);
            Back.setVisible(true);
            Back.setBackground(Color.white);
            Back.setBounds(101, 601, 100, 30);
            Back.addActionListener(new home());

            user.dispose();
            accountType.dispose();
        }

        @Override
        public void actionPerformed(ActionEvent e) {


        }
    }

    public class createCurrentAccount implements ActionListener {

        //public createAccount a = new createAccount();
        @Override
        public void actionPerformed(ActionEvent e) {

            new createAccount();
            minBalance1.setBackground(Color.RED);
            maxWithLimit1.setEditable(false);
            maxWithLimit1.setText("");
            maxWithLimit1.setBackground(Color.RED);
            institutionName1.setEditable(false);
            institutionName1.setBackground(Color.RED);
            institutionName1.setText("");
            checkAccount = 1;
            Done.addActionListener(new createCurrentAccountDone());


        }

        private class createCurrentAccountDone implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkAccount == 1) {
                    memberName0 = name1.getText();
                    name1.setText("");
                    accountBalance0 = Double.parseDouble(aBalance1.getText());
                    aBalance1.setText("");
                    tradeLicenseNumber0 = Integer.valueOf(tradeLicenseNumber1.getText());
                    tradeLicenseNumber1.setText("");
                    CurrentAccount ca = new CurrentAccount(memberName0,accountBalance0,tradeLicenseNumber0);
                    list.add(ca);
                    try {
                        pw = new PrintWriter("/home/ruhul/Desktop/JAVA/output");
                        pw.println("CurrentAccount " + memberName0 + " " + accountBalance0 + " " + tradeLicenseNumber0);
                        pw.flush();
                        pw.close();
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }
                }


            }
        }
    }

    public class createStudentAccount implements ActionListener {
        //           createAccount b = new createAccount();
        @Override
        public void actionPerformed(ActionEvent e) {
            new createAccount();
            minBalance1.setEditable(false);
            minBalance1.setBackground(Color.RED);
            minBalance1.setText("");
            maxWithLimit1.setEditable(false);
            maxWithLimit1.setText("");
            maxWithLimit1.setBackground(Color.RED);
            tradeLicenseNumber1.setEditable(false);
            tradeLicenseNumber1.setBackground(Color.RED);
            tradeLicenseNumber1.setText("");
            institutionName1.setEditable(true);
            checkAccount = 2;
            Done.addActionListener(new createStudentAccountDone());

        }


        private class createStudentAccountDone implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkAccount == 2) {
                    memberName0 = name1.getText();
                    accountBalance0 = Double.parseDouble(aBalance1.getText());
                    institutionName0 = institutionName1.getText();
                    StudentAccount sta = new StudentAccount(memberName0,accountBalance0,institutionName0);
                    list.add(sta);
                    name1.setText("");
                    aBalance1.setText("");
                    institutionName1.setText("");


                    try {
                        pw = new PrintWriter("/home/ruhul/Desktop/JAVA/output");
                        pw.println("StudentAccount " + memberName0 + " " + accountBalance0 + " " + institutionName0);
                        pw.flush();
                        pw.close();
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }
                }

            }
        }
    }

    public class createsavingsaccount implements ActionListener {
        //          createAccount c = new createAccount();
        @Override
        public void actionPerformed(ActionEvent e) {
            new createAccount();
            minBalance1.setEditable(false);
            minBalance1.setBackground(Color.RED);
            institutionName1.setEditable(false);
            institutionName1.setBackground(Color.RED);
            institutionName1.setText("");
            tradeLicenseNumber1.setEditable(false);
            tradeLicenseNumber1.setBackground(Color.RED);
            tradeLicenseNumber1.setText("");
            maxWithLimit1.setEditable(true);
            checkAccount = 3;
            Done.addActionListener(new createsavingsaccountDone());

        }

        private class createsavingsaccountDone implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (checkAccount == 3) {
                    memberName0 = name1.getText();

                    accountBalance0 = Double.parseDouble(aBalance1.getText());

                    maxWithLimit0 = Double.parseDouble(maxWithLimit1.getText());

                    SavingsAccount sa = new SavingsAccount(memberName0,accountBalance0,maxWithLimit0);
                    list.add(sa);
                    name1.setText("");
                    aBalance1.setText("");
                    maxWithLimit1.setText("");
                    try {
                        pw = new PrintWriter("/home/ruhul/Desktop/JAVA/output");
                        pw.println("SavingsAccount " + memberName0 + " " + accountBalance0 + " " + maxWithLimit0);
                        pw.flush();
                        pw.close();
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    }

                }

            }
        }
    }


    private class home implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            accountType.setVisible(false);
            existing.dispose();
            user.setVisible(true);
            exist.dispose();
            newUserFrame.dispose();

        }
    }

    private class existing implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            existing.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            existing.getContentPane().setBackground(Color.GRAY);
            existing.setVisible(true);
            existing.setLayout(null);
            existing.setSize(500, 700);
            JLabel an = new JLabel("Enter Account Number");
            existing.add(an);
            an.setBackground(Color.white);
            an.setBounds(0, 0, 150, 50);
            an.setVisible(true);
/*            accountNumber1.setVisible(true);
            accountNumber1.setBounds(0, 51, 150, 30);
            existing.add(accountNumber1);*/

            JButton done = new JButton("Done");
            done.setVisible(true);
            done.setBackground(Color.white);
            done.setBounds(0, 101, 150, 30);
            existing.add(done);

            JButton back = new JButton("Back");
            back.setBounds(0, 201, 150, 30);
            back.setBackground(Color.white);
            back.setVisible(true);
            existing.add(back);
            back.addActionListener(new home());
            accountType.dispose();
            exist.dispose();
            user.dispose();
            //String value = accountNumber1.getText();
/*            String aNumber = accountNumber1.getText();*/
            boolean flag = false;
            String[] accountlist = new String[list.size()];
            for(int j = 0; j<list.size(); j++) {
                accountlist[j]=list.get(j).accountNumber;
            }
            JComboBox accountListAll = new JComboBox(accountlist);
            accountListAll.setBackground(Color.white);
            accountListAll.setVisible(true);
            accountListAll.setBounds(0,51,300,30);
            existing.add(accountListAll);
            i= accountListAll.getSelectedIndex();
            if (i >= 0) {
                done.addActionListener(new exist());

            } else {
                JLabel validAccountNumber = new JLabel("Create a Account first");
                existing.add(validAccountNumber);
                validAccountNumber.setForeground(Color.red);
                validAccountNumber.setVisible(true);
                validAccountNumber.setBounds(0, 301, 300, 50);
            }

            //done.addActionListener(new exist());
            user.dispose();
/*            for( i=0;i<list.size();i++)
            {
                if(aNumber.equals(list.get(i).accountNumber))
                {

                    flag = false;
                }
                else
                    flag=true;
            }
            if(flag)
            {
                JLabel validAccountNumber = new JLabel("Enter Valid Account Number");
                existing.add(validAccountNumber);
                validAccountNumber.setVisible(true);
                validAccountNumber.setBounds(0,301,300,50);
            }*/

        }

        public class exist implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {

                exist.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                exist.getContentPane().setBackground(Color.GRAY);
                exist.setSize(500, 700);
                exist.setVisible(true);
                exist.setLayout(null);

                amount.setBackground(Color.white);
                exist.add(amount);
                amount.setVisible(true);
                amount.setBounds(0,0,100,50);

                amount1.setBackground(Color.white);
                exist.add(amount1);
                amount1.setVisible(true);
                amount1.setBounds(101,11,150,30);

                deposit.setVisible(true);
                deposit.setBackground(Color.white);
                deposit.setBounds(0,51,150,30);
                exist.add(deposit);
                deposit.addActionListener(new balanceDeposit());

                withdraw.setVisible(true);
                withdraw.setBackground(Color.white);
                withdraw.setBounds(151,51,150,30);
                exist.add(withdraw);
                withdraw.addActionListener(new balanceWithdaw());

                exist.add(accountnumber);
                accountnumber.setBackground(Color.white);
                accountnumber.setVisible(true);
                exist.add(accountnumber);
                accountnumber.setBounds(0,101,150,50);

                accountnumber1.setBackground(Color.white);
                String accountnumber2 = String.valueOf(list.get(i).accountNumber);
                accountnumber1.setText(accountnumber2);
                accountnumber1.setVisible(true);
                exist.add(accountnumber1);
                accountnumber1.setBounds(251,101,150,50);

                accountName.setVisible(true);
                accountName.setBackground(Color.white);
                exist.add(accountName);
                accountName.setBounds(0,151,150,50);
                JLabel accountName1 = new JLabel();
                //String accountName2 = String.valueOf(list.get(i).memberName);
                accountName1.setBackground(Color.white);
                //accountName1.setText(accountName2);
                accountName1.setText(String.valueOf(list.get(i).memberName));
                accountName1.setVisible(true);
                exist.add(accountName1);
                accountName1.setBounds(251,151,150,50);


                accountBalance.setBackground(Color.white);
                accountBalance.setVisible(true);
                exist.add(accountBalance);
                accountBalance.setBounds(0,201,150,50);

                accountBalance1.setBackground(Color.white);
                String accountBalance2 = String.valueOf(list.get(i).accountBalance);
                accountBalance1.setText(accountBalance2);
                accountBalance1.setVisible(true);
                exist.add(accountBalance1);
                accountBalance1.setBounds(251,201,150,50);

                JLabel interest = new JLabel("Account Balance With Interest:");
                interest.setBackground(Color.white);
                interest.setVisible(true);
                exist.add(interest);
                interest.setBounds(0,251,250,50);
                JLabel interest1 = new JLabel();
                interest1.setBackground(Color.white);
                String interest2 = String.valueOf(list.get(i).interestbalance);
                interest1.setText(interest2);
                interest1.setVisible(true);
                exist.add(interest1);
                interest1.setBounds(251,251,150,50);
/*                JLabel accounttype = new JLabel("Account Type: ");
                accounttype.setVisible(true);
                exist.add(accounttype);
                accounttype.setBounds(0,301,150,50);
                JLabel accounttype1 = new JLabel();
                accounttype1.setText(list.get(i).acType);
                accounttype1.setVisible(true);
                exist.add(accounttype1);
                accounttype1.setBounds(251,301,150,50);*/

                error.setBackground(Color.white);
                error.setVisible(true);
                exist.add(error);
                error.setBounds(0,451,250,50);
                error.setForeground(Color.red);


                exist.add(Back);
                Back.setBackground(Color.white);
                Back.setVisible(true);
                Back.setBounds(0,501,100,30);
                Back.addActionListener(new home());


                existing.dispose();
                System.out.flush();


            }

            public class Name2 implements ActionListener{

                @Override
                public void actionPerformed(ActionEvent e) {


                }
            }

            public class balanceDeposit implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                    check = 1;
                    try {
                        if (check == 1) {
                            //System.out.println("Deposit");
                            int balance = Integer.valueOf(amount1.getText());
                            list.get(i).accountBalance += balance;
                            accountBalance1.setText(String.valueOf(list.get(i).accountBalance));
                            error.setVisible(false);
                        }
                    } catch (NumberFormatException e1) {
                        error.setVisible(true);
                        error.setText("Enter any value");
                    }


                }
            }

            public class balanceWithdaw implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                    check = 2;
                    try {
                        if (check == 2) {
                            //System.out.println("withdraw");
                            int balance = Integer.valueOf(amount1.getText());
                            if (list.get(i).accountBalance - balance < list.get(i).minimumBalance) {
                            error.setText("Minimum Balance limit exceeded");
                                error.setVisible(true);
                            } else if (list.get(i).minimumBalance >= list.get(i).maxWithLimit) {
                            error.setText("Maximum withdraw limit exceeded");
                                error.setVisible(true);
                        } else {
                            error.setVisible(false);
                            list.get(i).accountBalance -= balance;
                            accountBalance1.setText(String.valueOf(list.get(i).accountBalance));

                        }


                        }
                    } catch (NumberFormatException e1) {
                        System.out.println("Exception");
                    }


                }
            }
        }
    }

    public class readFile implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                FileReader fr = new FileReader(new File("/home/ruhul/Desktop/JAVA/text"));
                BufferedReader br = new BufferedReader(fr);
                pw = new PrintWriter("/home/ruhul/Desktop/JAVA/output");
                String ch = br.readLine();
                String[] line;
                while (ch != null) {
                    line = ch.split(" ");

                    for (int i = 1; i < line.length; i++) {
                        if (line[0].equals("CurrentAccount")) {
                            CurrentAccount ca = new CurrentAccount(line[1], Double.parseDouble(line[2]), Integer.valueOf(line[3]));
                            list.add(ca);
                            pw.println("CurrentAccount " + ch);
                            pw.flush();
                            break;
                        } else if (line[0].equals("SavingsAccount")) {
                            SavingsAccount sa = new SavingsAccount(line[1], Double.parseDouble(line[2]), Double.parseDouble(line[3]));
                            list.add(sa);
                            pw.println("SavingsAccount " + ch);
                            pw.flush();
                            break;
                        } else if (line[0].equals("StudentAccount")) {
                            StudentAccount sta = new StudentAccount(line[1], accountBalance0, institutionName0);
                            list.add(sta);
                            pw.println("StudentAccount " + ch);
                            pw.flush();
                            break;
                        }

                    }
                    ch = br.readLine();
                }
                pw.close();
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            } /*catch (Exception e1)
            {
                System.out.println("Array index out of bound");
            }*/




        }
    }
}