package derived;

import base.BankAccount;

public class RecurringDepositAccount extends BankAccount {

    private String closingDate;

    public RecurringDepositAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean isInternetBankingEnable,
                                   double totalBalance, double availableBalance, float rateOfInterest, String closingDate) {
        super(accountNumber, accountOpeningDate, modeOfOperation, isInternetBankingEnable, totalBalance, availableBalance, rateOfInterest);
        this.closingDate = closingDate;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }


    @Override
    public void showAccountBalance() {

        System.out.println("Total Balance = " + getTotalBalance());
    }

    public void display() {
        show();
        System.out.println("Closing Date = " + getClosingDate());
    }
}
