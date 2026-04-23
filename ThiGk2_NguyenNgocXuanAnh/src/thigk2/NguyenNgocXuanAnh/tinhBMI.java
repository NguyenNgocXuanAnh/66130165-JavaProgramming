package thigk2.NguyenNgocXuanAnh;
import java.util.Scanner; 
public class tinhBMI {
		public static void main(String[] args) {
	        // BMI = cân nặng (kg) / (chiều cao (m) * chiều cao (m))
	        Scanner bp = new Scanner (System.in);
	        double height;    // m
	        System.out.println("Nhập chiều cao, cân nặng: ");
	        //nhâp cân nặng
			System.out.println("Nhập cân nặng: ");
			double weight = bp.nextDouble(); //nhâp cân nặng
	        double bmi = weight1 / (height * height);
	        
	        System.out.println("Cân nặng: " + weight1 + " kg");
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
