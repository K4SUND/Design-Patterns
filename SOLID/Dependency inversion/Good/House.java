public class House{


    public void addRoom(Room room){
        room.cleanRoom();
    }
    public void cleanHouse(){
        System.out.println("Cleaning the house");
    }

    public static void main(String[] args) {
        House house = new House();
        Room livingRoom = new LivingRoom();
        Room studyRoom = new StudyRoom();
        house.addRoom(livingRoom);
        house.addRoom(studyRoom);
       

    }
}