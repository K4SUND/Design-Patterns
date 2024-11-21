public class SavingsAccount implements Account {

    @Override
    public void deposit() {
        System.out.println("Deposit Savings Account");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw Savings Account");
    }

    @Override
    public void getBalance() {
        System.out.println("Get Balance Savings Account");
    }

}