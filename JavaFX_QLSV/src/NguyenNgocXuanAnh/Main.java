package NguyenNgocXuanAnh;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		VBox vb = new VBox(10);		
		Label lb1 = new Label("Mã SV");
		TextField txt1 = new TextField();
		Label lb2 = new Label("Tên SV");
		TextField txt2 = new TextField();
		
		GridPane gr = new GridPane();
		gr.add(lb1, 0, 0);
		gr.add(txt1, 1, 0);
		gr.add(lb2, 0, 1);
		gr.add(txt2, 1, 1);
		
		HBox hb = new HBox(10);
		Button btn1 = new Button("Thêm");
		Button btn2 = new Button("Xóa");
		hb.getChildren().addAll(btn1,btn2);
		
		Label lb3 = new Label("Danh sách sinh viên");
		ListView<String> lv1 = new ListView<>();
		
		vb.getChildren().addAll(gr,hb,lb3,lv1);
		
		btn1.setOnAction(e->{
			if (txt1.getText().trim().isEmpty() || txt2.getText().trim().isEmpty()){
				Alert a1 = new Alert(Alert.AlertType.ERROR);
				a1.setContentText("Không hợp lệ!");
				a1.showAndWait();
			}
			String ma = txt1.getText();
			String ten = txt2.getText();
			String s = ma+" - "+ten;
			lv1.getItems().add(s);
			txt1.clear();
			txt2.clear();
		});
		btn2.setOnAction(e->{
			String s = lv1.getSelectionModel().getSelectedItem();
			lv1.getItems().remove(s);
		});
		
		gr.setVgap(10);
		gr.setHgap(10);
		vb.setPadding(new Insets(10));
		btn1.setStyle("-fx-font-weight: bold; -fx-background-color: green");
		btn2.setStyle("-fx-font-weight: bold; -fx-background-color: red");
		hb.setAlignment(Pos.CENTER);
		btn1.setPrefWidth(100);
		btn2.setPrefWidth(100);
		lb3.setStyle("-fx-font-weight: bold");
		Scene scn = new Scene(vb, 450, 350);
		primaryStage.setTitle("Quản lý sinh viên");
		primaryStage.setScene(scn);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
