package Pegas;

import java.time.LocalDateTime;
import java.util.List;

public interface View{
    void showTables(List<Table> tableList);
    void setObserver(Observer observer);
    void showReservationResultUI(int reservationNo);
}
