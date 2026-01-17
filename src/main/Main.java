package src.main;

public class Main {
    public static void main(String[] args) {
        
        // Simple info: Name aur Balance
        ReserverPayer payer = new ReserverPayer("Muhammad Aun", 15000.0);
        RoomType roomType = new RoomType("Executive Suite", 2500.0);
        Room myRoom = new Room(786);

        System.out.println("---------------------------");
        System.out.println("Hotel Name: Aun Hotel");
        System.out.println("Reserver Name: " + payer.getPayerName());
        System.out.println("Room Number: " + myRoom.getNumber());
        System.out.println("Room Type: " + roomType.getKind());
        System.out.println("Total Cost: " + roomType.getCost());
        System.out.println("---------------------------");
    }
}