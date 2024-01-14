package Pegas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TableModel implements Model{
    private List<Table> tables;
    public List<Table> loadTables(){
        if(tables == null){
            tables = new ArrayList<>();
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }
    public int reservationTable(String reservationDate, int tableNo, String name){
        for(Table i: tables){
            if(i.getNo()==tableNo){
                Reservation reservation1 = new Reservation(name, reservationDate);
                i.getReservations().add(reservation1);
                return reservation1.getReserveNo();
            }
        }
        return -1;
    }

    @Override
    public int removeReservationTable(String reserveDate, int tableNo, String name) {
        for(Table i: tables){
            if(i.getNo()==tableNo){
                if(!i.getReservations().isEmpty()){
                    List<Reservation> reservations = i.getReservations().stream().filter(j->j.getName().equals(name)&&j.data().equals(reserveDate)).toList();
                    i.getReservations().removeAll(reservations);
                    return 1;
                }
            }
        }
        return -1;
    }
}
