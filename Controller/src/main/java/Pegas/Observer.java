package Pegas;

import java.time.LocalDateTime;

public interface Observer {
    void onReservationTable(String reserveDate, int tableNo, String name);
    void onRemoveReservationTable(String reserveDate,int tableNo,String name);
}
