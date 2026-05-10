import java.util.List;
import java.util.ArrayList;

abstract class Reservation_Strategy {
    protected List<Reserve> reserves;

    public Reservation_Strategy() {
        this.reserves = new ArrayList<>();
    }

    abstract void addReserve(Reserve reserve);
    
    public List<Reserve> getReserves() {
        return this.reserves;
    }
}
