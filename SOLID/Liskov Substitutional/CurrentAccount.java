public class CurrentAccount implements Account {

    @Override
    public void deposit() {
        System.out.println("Deposit Current Account");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw Current Account");
    }

    @Override
    public void getBalance() {
        System.out.println("Get Balance Current Account");
    }

}