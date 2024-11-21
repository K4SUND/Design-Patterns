public class Test {
    public static void main(String[] args) {
        Light light = new Light();

        //turn on
        Command turnOn = new TurnOn(light);
        turnOn.execute();

        //off 
        Command turnOff = new TurnOff(light);
        turnOff.execute();
    }
}