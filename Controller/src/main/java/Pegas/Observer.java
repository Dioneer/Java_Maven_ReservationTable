package Pegas;

import java.time.LocalDateTime;

public interface Observer {
    void onReservationTable(String reserve, int tableNo, String name);
}
