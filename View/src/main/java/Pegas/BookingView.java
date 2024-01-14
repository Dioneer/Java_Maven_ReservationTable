package Pegas;

import java.time.LocalDateTime;
import java.util.List;

public class BookingView implements View{
    private Observer observer;

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void showReservationResultUI(int reservationNo) {
        System.out.println(reservationNo);
    }

    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);
        bookingPresenter.updateTablesUI();
        view.reservationTable("2024-04-08T12:30:30", 2, "Ira");
    }
    public void showTables(List<Table> tableList){
        for(Table i: tableList){
            System.out.println(i);
        }
    }
    public void reservationTable(String reserve, int tableNo, String name){
        if(observer !=null){
            observer.onReservationTable(reserve,tableNo,name);
        }
    }

}
