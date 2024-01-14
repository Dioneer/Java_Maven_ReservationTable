package Pegas;

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

    @Override
    public void showRemoveReservationResultUI(int result) {
        if(result>0){
            System.out.println("Yours reserve was removed");
        }else{
            System.out.println("Yours reserve wasn't found");
        }
    }

    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);
        bookingPresenter.updateTablesUI();
        view.reservationTable("2024-04-08T12:30:30", 2, "Ira");
        view.reservationTable("2024-05-08T12:30:30", 2, "Mira");
        bookingPresenter.updateTablesUI();
        view.removeReservationTable("2024-04-08T12:30:30", 2, "Ira");
        bookingPresenter.updateTablesUI();
    }
    public void showTables(List<Table> tableList){
        for(Table i: tableList){
            System.out.println(i);
        }
    }
    public void reservationTable(String reserveDate, int tableNo, String name){
        if(observer !=null){
            observer.onReservationTable(reserveDate,tableNo,name);
        }
    }
    public void removeReservationTable(String reserveDate, int tableNo, String name){
        if(observer !=null){
            observer.onRemoveReservationTable(reserveDate,tableNo,name);
        }
    }

}
