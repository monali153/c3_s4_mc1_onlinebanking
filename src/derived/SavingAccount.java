package derived;

import base.BankAccount;

public class SavingAccount extends BankAccount {

    private double balance;

    public SavingAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean isInternetBankingEnable,
                         double totalBalance, double availableBalance, double rateOfInterest) {
        super(accountNumber, accountOpeningDate, modeOfOperation, isInternetBankingEnable, totalBalance, availableBalance, rateOfInterest);
    }

    @Override
    public void showAccountBalance() {
        System.out.println("Available Balance = " + balance);
    }

    public double retrieveBalance() {
        balance = getAvailableBalance();
        return balance;
    }

    public double debitCash(double debitAmount) {

        double debit = getAvailableBalance() - debitAmount;
        balance = debit;
        return balance;
    }

    public double creditCash(double creditAmount) {
        double credit = getAvailableBalance() + creditAmount;
        balance = credit;
        return balance;
    }

    public void display() {
        show();
    }
}
