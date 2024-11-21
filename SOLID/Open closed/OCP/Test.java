public class Test{
    public static void main(String[] args) {
        BackAccount backAccount = new BackAccount();
        Account currentAccount = new CurrentAccount(backAccount);
        currentAccount.calculateInterest();
        System.out.println(backAccount.interest);


        Account savingAccount = new SavingAccount(backAccount);
        savingAccount.calculateInterest();
        System.out.println(backAccount.interest);

    }
}