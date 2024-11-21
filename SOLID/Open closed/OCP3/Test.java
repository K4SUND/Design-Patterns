public class Test{
    public static void main(String[] args) {
        AccountModel accountModel = new AccountModel();
        accountModel.setAccount(new Saving());
        accountModel.calculateInterest();
        accountModel.setAccount(new Current());
        accountModel.calculateInterest();
    }
}