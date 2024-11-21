public class House{
    public void cleanHouse(){
        System.out.println("Cleaning the house");
    }

    public void addLivingRoom(LivingRoom livingRoom)
    {
        livingRoom.cleanRoom();

    }

    public static void main(String[] args) {
        House house = new House();
        LivingRoom livingRoom = new LivingRoom();
        house.addLivingRoom(livingRoom);
        
    }
}

class LivingRoom {
    void cleanRoom(){
        System.out.println("Cleaning the Living room");
    }
}
