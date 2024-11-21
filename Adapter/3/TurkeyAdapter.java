public class TurkeyAdapter implements Duck{

    //private instace
    private Turkey turkey;

    //constructor

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }

}