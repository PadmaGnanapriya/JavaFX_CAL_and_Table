import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableFormController {

    public TableView tbl;
    public TableColumn colName;
    public TableColumn colId;
    public TableColumn colAddress;
    public TableColumn colSalary;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtSalary;


    public void initialize(){  ///This run with UI
        //FXML anotation is not use here.
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        loadAllData();
    }

    private void loadAllData() {
        System.out.println(DataBase.customerList);
        ObservableList<CustomerDTO> list= FXCollections.observableArrayList(DataBase.customerList);
        tbl.setItems(list); // No for loops
    }
}
