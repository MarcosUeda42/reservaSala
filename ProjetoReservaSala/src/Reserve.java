import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import Rooms.*;

public class Reserve {
    private User user;
    private LocalDateTime start_schedule, end_schedule;
    private Room room;

    public Reserve(User user, String start_schedule, String end_schedule, Room room) {
        this.user = user;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.start_schedule = LocalDateTime.parse(start_schedule, formatter);
        this.end_schedule = LocalDateTime.parse(end_schedule, formatter);
        this.room = room;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getStart_schedule() {
        return start_schedule;
    }

    public LocalDateTime getEnd_schedule() {
        return end_schedule;
    }

    public Room getRoom() {
        return room;
    }
}
