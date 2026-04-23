package thigk2.NguyenNgocXuanAnh;
import java.util.Scanner; 
public class tinhBMI {
		public static void main(String[] args) {
			//hỏi user nhập vào
	        Scanner bp = new Scanner (System.in);
	        System.out.println("Nhập chiều cao, cân nặng: ");
	        
	        //nhâp cân nặng
	        System.out.println("Nhập cân nặng: ");
			double weight = bp.nextDouble(); //nhâp cân nặng
			
			//nhập chiều cao
			System.out.println("Nhập chiều cao: ");
			double height = bp.nextDouble(); //nhâp chiều cao
			if (height <= 0 || weight <= 0) {
			    System.out.println("Dữ liệu không hợp lệ!");
			    return;
			}
	        // BMI = cân nặng (kg) / (chiều cao (m) * chiều cao (m))
	        double bmi = weight / (height * height);
	        
	        System.out.println("Cân nặng: " + weight + " kg");
	        System.out.println("Chiều cao: " + height + " m");
	        System.out.println("Chỉ số BMI: " + bmi);
	        
	        // Phân loại BMI
	        if (bmi < 18.5) {
	            System.out.println("Phân loại: Thiếu cân");
	        } else if (bmi < 25) {
	            System.out.println("Phân loại: Bình thường");
	        } else if (bmi < 30) {
	            System.out.println("Phân loại: Thừa cân");
	        } else {
	            System.out.println("Phân loại: Béo phì");
	        }
	    }
}
