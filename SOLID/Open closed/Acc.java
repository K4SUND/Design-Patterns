public class Acc{
    private Account type;

    public void setType(Account type) {
        this.type = type;
    }
    public void calculate(){
        type.calculateInterest();
    }

    public static void main(String[] args) {
        Acc acc = new Acc();
        Account curreAccount = new CurrentAccount();
        acc.setType(curreAccount);
        acc.calculate();
    }
}