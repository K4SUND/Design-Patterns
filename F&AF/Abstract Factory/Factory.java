public class Factory{
    public ProductOne createProductOne(String type){
        if(type.equals("Concrete One"))
        {
            return new ConcreteProductOne();
        }
        else{
            return null;
        }
    }

    public ProductTwo createProductTwo(String type)
    {
        if(type.equals("Concrete One"))
        {
            return new ConcreteProductTwo();
        }
        else{
            return null;
        }
    }

    public static void main(String[] args) {
        Factory factory = new Factory();
        ProductOne concreteProductOne = factory.createProductOne("Concrete One");
        ProductTwo concreteProductTwo = factory.createProductTwo("Concrete One");
    }
}