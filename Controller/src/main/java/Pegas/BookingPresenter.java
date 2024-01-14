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
    public void updReservationResultUI(int reservationNo){
        view.showReservationResultUI(reservationNo);
    }
}
