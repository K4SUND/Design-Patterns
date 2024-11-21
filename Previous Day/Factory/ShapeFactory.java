public class ShapeFactory{

    public ShapeFactory(){
        System.out.println("ShapeFactory is created");
    }

    public Product getShape(String shapeType){
       
        if(shapeType.equals("Circle")){
            return new Circle();
        }
        else if(shapeType.equals("Square")){
            return new Square();
        }
        else{
            return null;
        }       
        
    }
}