public class Test{
    public static void main(String[] args) {
        Account account = new SavingsAccount();
        account.deposit();
        account.withdraw();
        account.getBalance();

        account = new CurrentAccount();
        account.deposit();
        account.withdraw();
        account.getBalance();
    }
}