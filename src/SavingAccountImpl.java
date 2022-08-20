import derived.RecurringDepositAccount;
import derived.SavingAccount;

public class SavingAccountImpl {

    public static void main(String[] args) {

        SavingAccount object = new SavingAccount(1234567890123L, "12/01/2012", "Self", true, 40000, 40000, 2.5);

        System.out.println("Saving Account Details");
        object.display();
        System.out.println("\nRetrieve Balance = " + object.retrieveBalance());
        System.out.println("Debit Cash = " + object.debitCash(1000));
        System.out.println("Credit Cash = " + object.creditCash(4000));
        System.out.println("After Transaction");
        object.showAccountBalance();

        RecurringDepositAccount obj = new RecurringDepositAccount(1254567890720L, "02/05/2013", "Self", true, 40000, 40000, 5, "02/05/2021");

        System.out.println("\nRecurring Deposit Account Details");
        obj.display();

    }
}
