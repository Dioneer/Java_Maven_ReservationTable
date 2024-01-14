package Pegas;

import java.util.ArrayList;
import java.util.List;


public class Table {
    private static int counter;
    private final int no;
    private final List<Reservation> reservations = new ArrayList<>();
    {
        no=++counter;
    }

    @Override
    public String toString() {
        return "Table{" +
                "no=" + no +
                ", reservations=" + reservations +
                '}';
    }

    public int getNo() {
        return no;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }
}
