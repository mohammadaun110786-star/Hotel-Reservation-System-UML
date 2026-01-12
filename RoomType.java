public class RoomType {
    private String kind; // RoomKind
    private double cost; // Money

    public RoomType(String kind, double cost) {
        // Defensive Check: Cost negative nahi ho sakti [cite: 25, 28]
        if (cost < 0) {
            throw new IllegalArgumentException("Cost cannot be negative.");
        }
        this.kind = kind;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}