public abstract class Decorator  implements Shape{

        //protected instance
        protected Shape decoratedShape;

        //constucotr
        public Decorator(Shape shape)
        {
            decoratedShape = shape;
        }
        
        @Override
        public void draw(){
            decoratedShape.draw();
        }

        public abstract void drawBorder();
}