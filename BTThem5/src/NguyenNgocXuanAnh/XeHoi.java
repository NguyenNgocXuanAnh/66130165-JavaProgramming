package NguyenNgocXuanAnh;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class XeHoi {
	private String dongxe;
	private int sochongoi;
	private LocalDate ngaysanXuat = LocalDate.of(2019, 6, 11);
	private double giasan = 400000;
	public XeHoi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public XeHoi(String dongxe, int sochongoi, LocalDate ngaysanXuat, double giasan) {
		super();
		this.dongxe = dongxe;
		this.sochongoi = sochongoi;
		this.ngaysanXuat = ngaysanXuat;
		this.giasan = giasan;
	}
	
	public String getDongxe() {
		return dongxe;
	}

	public void setDongxe(String dongxe) {
		this.dongxe = dongxe;
	}

	public int getSochongoi() {
		return sochongoi;
	}

	public void setSochongoi(int sochongoi) {
		this.sochongoi = sochongoi;
	}

	public LocalDate getNgaysanXuat() {
		return ngaysanXuat;
	}

	public void setNgaysanXuat(LocalDate ngaysanXuat) {
		this.ngaysanXuat = ngaysanXuat;
	}

	public double getGiasan() {
		return giasan;
	}

	public void setGiasan(double giasan) {
		this.giasan = giasan;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap dong xe: ");
		setDongxe(sc.nextLine());
		System.out.println("Nhap so cho ngoi: ");
		setSochongoi(sc.nextInt());
		sc.nextLine();
		System.out.print("Nhap ngay san xuat: ");
		setNgaysanXuat(LocalDate.parse(sc.nextLine()));
		System.out.println("Nhap gia san: ");
		setGiasan(sc.nextDouble());
	}
	public void Xuat() {
		System.out.println("DONG XE: "+getDongxe());
		System.out.println("SO CHO NGOI: "+getSochongoi());
		System.out.println("NGAY SAN XUAT: "+getNgaysanXuat());
		System.out.println("GIA BAN: "+getGiasan());
	}
	public double TinhGiaBan () {
		int soNam = Period.between(ngaysanXuat, LocalDate.now()).getYears();

	    if (soNam > 2) {
	        return giasan * 1.15;
	    } else if (soNam <=2 && soNam > 1) {
	        return giasan * 1.3;
	    } else {
	        return giasan * 1.5;
	    }
	 
	}

	@Override
	public String toString() {
		return "XeHoi [dongxe=" + dongxe + ", sochongoi=" + sochongoi + ", ngaysanXuat=" + ngaysanXuat + ", giasan="
				+ giasan + "]";
	}
	
}
