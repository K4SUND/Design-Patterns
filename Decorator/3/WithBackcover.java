public class WithBackcover extends Decorator {

    
    //cosntructor
    public WithBackcover(Phone phone){
        super(phone);
        //phone ekenn katha krnna puluwn super class ektr
        //suoer class eken concrete ekkt tama kath krnne
    }


    //IMP Anik function tika gnna
    //mkd interface tyoe eken eewata tama call krnne
    @Override
    public int price()
    { 
        int prev = phone.price(); //methnin ynne super ekt, ethanin yanne concrete ekt
        int newP = decoratePrice();
        return newP + prev; 
        

    }

    @Override
    public String description()
    {
        String prevD = phone.description();
        String newD = decorateDescription();
        return prevD+newD;
    }



    @Override
    public int decoratePrice() {
        return 50;   
    }

    @Override
    public String decorateDescription() {
         return "With BackCover";
    }


    
}