package Pegas;

import java.util.List;

public interface Model {
    List<Table> loadTables();
    int reservationTable(String reservationDate, int tableNo, String name);
}
