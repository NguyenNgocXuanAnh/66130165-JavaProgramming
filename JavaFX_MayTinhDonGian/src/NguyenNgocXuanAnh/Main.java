package NguyenNgocXuanAnh;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		VBox vb = new VBox(10);
		Label lb1 = new Label("Số 1:");
		TextField txt1 = new TextField();
		Label lb2 = new Label("Số 2:");
		TextField txt2 = new TextField();
		Label lb3 = new Label("Kết quả:");
		TextField txt3 = new TextField();
		
		HBox hb = new HBox(10);
		
		Button btn1 = new Button("Cộng");
		Button btn2 = new Button("Trừ");
		Button btn3 = new Button("Nhân");
		Button btn4 = new Button("Chia");
		hb.getChildren().addAll(btn1,btn2,btn3,btn4);
		GridPane gr = new GridPane();
		
		gr.add(lb1, 0, 0);
		gr.add(txt1, 1, 0);
		gr.add(lb2, 0, 1);
		gr.add(txt2, 1, 1);
		gr.add(lb3, 0, 2);
		gr.add(txt3, 1, 2);
		
		vb.getChildren().addAll(gr,hb);
		btn1.setOnAction(e->{
			if (txt1.getText().trim().isEmpty() || txt2.getText().trim().isEmpty()){
				Alert a1 = new Alert(Alert.AlertType.ERROR);
				a1.setContentText("Không hợp lệ!");
				a1.showAndWait();
			}
			double s1 = Double.parseDouble(txt1.getText());
			double s2 = Double.parseDouble(txt2.getText());
			double kq = s1 + s2;
			txt3.setText(String.valueOf(kq));
			
		});
		btn2.setOnAction(e->{
			if (txt1.getText().trim().isEmpty() || txt2.getText().trim().isEmpty()){
				Alert a1 = new Alert(Alert.AlertType.ERROR);
				a1.setContentText("Không hợp lệ!");
				a1.showAndWait();
			}
			double s1 = Double.parseDouble(txt1.getText());
			double s2 = Double.parseDouble(txt2.getText());
			double kq = s1 - s2;
			txt3.setText(String.valueOf(kq));
			
		});
		btn3.setOnAction(e->{
			if (txt1.getText().trim().isEmpty() || txt2.getText().trim().isEmpty()){
				Alert a1 = new Alert(Alert.AlertType.ERROR);
				a1.setContentText("Không hợp lệ!");
				a1.showAndWait();
			}
			double s1 = Double.parseDouble(txt1.getText());
			double s2 = Double.parseDouble(txt2.getText());
			double kq = s1 * s2;
			txt3.setText(String.valueOf(kq));
			
		});
		btn4.setOnAction(e->{
			if (txt1.getText().trim().isEmpty() || txt2.getText().trim().isEmpty()){
				Alert a1 = new Alert(Alert.AlertType.ERROR);
				a1.setContentText("Không hợp lệ!");
				a1.showAndWait();
			}
			double s1 = Double.parseDouble(txt1.getText());
			double s2 = Double.parseDouble(txt2.getText());
			if (s2 == 0){
				Alert a2 = new Alert(Alert.AlertType.ERROR);
				a2.setContentText("Lỗi chia cho không!");
				a2.showAndWait();
			}
			else {
				double kq = s1 / s2;
				txt3.setText(String.valueOf(kq));
			}
			
		});
		gr.setVgap(10);
		gr.setHgap(10);
		gr.setAlignment(Pos.CENTER);
		vb.setPadding(new Insets(10));
		btn1.setStyle("-fx-font-weight: bold; -fx-background-color: green; -fx-text-fill: white");
		btn2.setStyle("-fx-font-weight: bold; -fx-background-color: green; -fx-text-fill: white");
		btn3.setStyle("-fx-font-weight: bold; -fx-background-color: green; -fx-text-fill: white");
		btn4.setStyle("-fx-font-weight: bold; -fx-background-color: green; -fx-text-fill: white");
		hb.setAlignment(Pos.CENTER);
		btn1.setPrefWidth(100);
		btn2.setPrefWidth(100);
		btn3.setPrefWidth(100);
		btn4.setPrefWidth(100);
		lb3.setStyle("-fx-font-weight: bold");
		Scene scn = new Scene(vb, 450, 350);
		primaryStage.setTitle("Máy tính đơn giản");
		primaryStage.setScene(scn);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
