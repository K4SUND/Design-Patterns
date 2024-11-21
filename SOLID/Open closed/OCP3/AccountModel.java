public class AccountModel{

    private Account account;

    public void setAccount(Account account){
        this.account = account;
    }

    public void calculateInterest(){
        account.calculateInterest();
    }
}