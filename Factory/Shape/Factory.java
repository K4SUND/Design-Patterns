public class Factory{

    //create objects
    public  Shape getShape(String type){
        if(type =="Rectangle")
        { 
            return new Rectangle();
        }
        else if(type == "Circle")
        {
            return new Circle();

        }
        return null;
    }
}