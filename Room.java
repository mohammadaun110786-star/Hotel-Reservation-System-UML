public class Room {
    private int number;
    private RoomType type;

    public Room(int number, RoomType type) {
        // Defensive Check: Room number valid hona chahiye [cite: 25]
        if (number <= 0) {
            throw new IllegalArgumentException("Room number must be positive.");
        }
        this.number = number;
        this.type = type;
    }

    public void createGuest() {
        // Guest create karne ka logic 
        System.out.println("Guest creation logic for Room: " + number);
    }
    
    public int getNumber() {
        return number;
    }
}