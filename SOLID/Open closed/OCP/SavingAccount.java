public class SavingAccount implements Account {

    private BackAccount backAccount;

    public SavingAccount(BackAccount backAccount){
        this.backAccount = backAccount;
    }
    @Override
    public void calculateInterest() {
        backAccount.interest = 0.05;
    }

}