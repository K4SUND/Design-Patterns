public class Shop extends Factory{

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new CheesePizza();
        }else if(type.equals("onion")){
            return new OnionPizza();
        }else{
            return null;
        }
    }

    


}
