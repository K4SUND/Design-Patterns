public class Factory{
    public Phone createPhone(String type){
        if(type.equals("Apple"))
        {
            return new ApplePhone();
        }
        else if(type.equals("Samsung"))
        {
            return new SamsungPhone();
        }
        return null;
    }
}