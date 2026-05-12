package proxys;

import classes.reserve.Reservation;
import classes.reserve.Reserve;
import classes.rooms.Special_Room;
import classes.user.User;

public class Rooms_Proxy implements Protection_Proxy {
    private Special_Room room;
    private String startSchedule;
    private String endSchedule;

    public Rooms_Proxy(Special_Room room, String startSchedule, String endSchedule) {
        this.room = room;
        this.startSchedule = startSchedule;
        this.endSchedule = endSchedule;
    }

    @Override
    public void reserve(User user) {
        if ("Professor".equals(user.getRole())) {
            Reservation reservation = Reservation.getInstance();
            if (reservation.roomAvailability(room, startSchedule, endSchedule)) {
                reservation.addReserve(new Reserve(user, startSchedule, endSchedule, room));
                System.out.println("Reserva realizada com sucesso para " + user.getName());
            } else {
                System.out.println("Sala indisponível no período solicitado");
            }
        } else {
            System.out.println("Acesso Negado, sem autorização");
        }
    }
}
