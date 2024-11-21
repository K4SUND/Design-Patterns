public class CurrentAccount implements Account{

     private BackAccount backAccount;

    public CurrentAccount(BackAccount backAccount){
        this.backAccount = backAccount;
    }
    @Override
    public void calculateInterest() {
       backAccount.interest = 0.02;
    }

}