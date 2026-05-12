package strategies;
import java.util.List;

import classes.reserve.Reserve;

public abstract class Reservation_Strategy {
    protected List<Reserve> reserves;

    public Reservation_Strategy(List<Reserve> reserves) {
        this.reserves = reserves;
    }

    public abstract void addReserve(Reserve reserve);
    
    public List<Reserve> getReserves() {
        return this.reserves;
    }

    public void setReserves(List<Reserve> reserves) {
        this.reserves = reserves;
    }
}
