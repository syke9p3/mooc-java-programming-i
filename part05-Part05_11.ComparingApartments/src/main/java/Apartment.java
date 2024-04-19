
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    

    public boolean largerThan(Apartment compared) {
        return this.getSquares() > compared.getSquares();
    }

    public int getTotalPrice() {
        return this.squares * this.pricePerSquare;
    }

    public int priceDifference(Apartment compared) {
       int a = this.getTotalPrice();
       int b = compared.getTotalPrice();

       if (a - b < 0) return -1 * (a-b);

       return a - b;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return this.getTotalPrice() > compared.getTotalPrice();
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public int getPricePerSquare() {
        return pricePerSquare;
    }


}
