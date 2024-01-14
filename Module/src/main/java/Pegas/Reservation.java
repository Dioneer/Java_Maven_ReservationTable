package Pegas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reservation {
    private static int counter = 100;
    private final int reserveNo = ++counter;
    private String name;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
    private LocalDateTime dateTime;

    public Reservation(String name, String dateTime) {
        this.name = name;
        this.dateTime = LocalDateTime.parse(dateTime);
    }

    public int getReserveNo() {
        return reserveNo;
    }

    public String data() {
        return dateTime.format(dtf);
    }
}
