public class Factory{

    public Table createTable(){
        return new Table1();
    }
    public Chair createChair(){
        return new Chair1();
    }
}