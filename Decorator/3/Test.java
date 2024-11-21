public class Test{
    public static void main(String[] args) {
        Phone phone1 =  new Apple();
        System.out.println(phone1.price());
        System.out.println(phone1.description());

        //WITH BACKCOVER
        Phone phoneWithBackCover = new WithBackcover(phone1);
        System.out.println(phoneWithBackCover.price());
        System.out.println(phoneWithBackCover.description());

        
        
       


    }
}