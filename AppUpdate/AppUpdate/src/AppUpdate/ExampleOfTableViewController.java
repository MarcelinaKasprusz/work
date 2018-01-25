package AppUpdate;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.util.Date;


public class ExampleOfTableViewController implements Initializable {

	 @FXML private TableView<ApplicationUpdate> tableView;
	 @FXML private TableColumn<ApplicationUpdate, String> updateColumn;
	 @FXML private TableColumn<ApplicationUpdate, Date> releasedColumn;
	 @FXML private TableColumn<ApplicationUpdate, String> urlColumn;
    
    
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //set up the columns in the table
        updateColumn.setCellValueFactory(new PropertyValueFactory<ApplicationUpdate, String>("version"));
        releasedColumn.setCellValueFactory(new PropertyValueFactory<ApplicationUpdate, Date>("released"));
        urlColumn.setCellValueFactory(new PropertyValueFactory<ApplicationUpdate, String>("url"));
        
       
        tableView.setItems(getUpdate());
       
        //Wielokrotne zazanczanie
        tableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
      
    }    
   

    
    public ObservableList<ApplicationUpdate>  getUpdate()
    {
        ObservableList<ApplicationUpdate> versions = FXCollections.observableArrayList();
        versions.add(new ApplicationUpdate("1.2", Date(2008, Month.JULY, 12), "url.url.ul"));
        versions.add(new ApplicationUpdate("1.3",Date(2009, Month.JULY, "url.url.ul")));
        versions.add(new ApplicationUpdate("1.4",Date(2019, Month.MAY, "url.url.ul")));
        
        return versions;
    }
}
