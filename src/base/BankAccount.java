package base;

public abstract class BankAccount {

    private long accountNumber;
    private String accountOpeningDate;
    private String modeOfOperation;
    private boolean isInternetBankingEnable;
    private double totalBalance;
    private double availableBalance;
    private double rateOfInterest;

    public BankAccount(long accountNumber, String accountOpeningDate, String modeOfOperation,
                       boolean isInternetBankingEnable, double totalBalance, double availableBalance, double rateOfInterest) {
        this.accountNumber = accountNumber;
        this.accountOpeningDate = accountOpeningDate;
        this.modeOfOperation = modeOfOperation;
        this.isInternetBankingEnable = isInternetBankingEnable;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;
        this.rateOfInterest = rateOfInterest;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public boolean isInternetBankingEnable() {
        return isInternetBankingEnable;
    }

    public void setInternetBankingEnable(boolean internetBankingEnable) {
        isInternetBankingEnable = internetBankingEnable;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        totalBalance = availableBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public abstract void showAccountBalance();

    public void show() {
        System.out.println("Account Number = " + getAccountNumber());
        System.out.println("Account Opening Date = " + getAccountOpeningDate());
        System.out.println("Mode Of Operation = " + getModeOfOperation());
        System.out.println("Rate Of Interest = " + getRateOfInterest());
        System.out.println("Available Balance = " + getAvailableBalance());
        System.out.println("Total Balance = " + getTotalBalance());
    }

}
