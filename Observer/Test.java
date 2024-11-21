public class Test{
    public static void main(String[] args) {
        //subject
        // Subject WeatherStation = new ConcreteSubjectOne();
        ConcreteSubjectOne WeatherStation = new ConcreteSubjectOne();

        //observer 1
        Observer display1 = new ConcreteObserverOne();
        //observer 2
        Observer display2 = new ConcreteObserverTwo();

        //1. Subject without observers
        WeatherStation.setState("Changed");
        System.out.println("--------------------------");

        //2. Add observers
        WeatherStation.addObserver(display1);
        WeatherStation.setState("Changed");

        System.out.println("--------------------------"); 
         //3. Add observers
        WeatherStation.addObserver(display2);
        WeatherStation.setState("Changed");

         System.out.println("--------------------------"); 
        //2. Again first observer 
        WeatherStation.addObserver(display1);
        WeatherStation.setState("Changed");

        System.out.println("--------------------------"); 
        System.out.println("--------------------------"); 
        //remove one
        WeatherStation.removeObserver(display2);  //blmu nama anuwada ain wenne kyl
        WeatherStation.setState("Changed");

    }
}