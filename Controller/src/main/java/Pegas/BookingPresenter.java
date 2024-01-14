package Pegas;

import java.time.LocalDateTime;
import java.util.List;

public class BookingPresenter implements Observer{
    private final Model model;
    private final View view;
    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.setObserver(this);
    }
    public List<Table> loadTables(){
        return model.loadTables();
    }
    public void updateTablesUI(){
        view.showTables(loadTables());
    }

    @Override
    public void onReservationTable(String reserve, int tableNo, String name) {
       int reservationNo = model.reservationTable(reserve,tableNo,name);
       updReservationResultUI(reservationNo);
    }

    @Override
    public void onRemoveReservationTable(String reserveDate, int tableNo, String name) {
        int removeReservationNo = model.removeReservationTable(reserveDate,tableNo,name);
        updRemoveReservationResultUI(removeReservationNo);
    }

    public void updReservationResultUI(int reservationNo){
        view.showReservationResultUI(reservationNo);
    }
    public void updRemoveReservationResultUI(int result){
    view.showRemoveReservationResultUI(result);
    }
}
