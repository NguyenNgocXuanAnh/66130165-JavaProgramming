package NguyenNgocXuanAnh;

import java.time.LocalDate;
import java.util.Scanner;
public class XeVinfast extends XeHoi implements Phi {
	private String noiDK;

	public XeVinfast() {
		super();
		// TODO Auto-generated constructor stub
	}

	public XeVinfast(String dongxe, int sochongoi, LocalDate ngaysanXuat, double giasan, String noiDK) {
		super(dongxe, sochongoi, ngaysanXuat, giasan);
		this.noiDK = noiDK;
		// TODO Auto-generated constructor stub
	}

	public XeVinfast(String noiDK) {
		super();
		this.noiDK = noiDK;
	}
	
	public String getNoiDK() {
		return noiDK;
	}

	public void setNoiDK(String noiDK) {
		this.noiDK = noiDK;
	}

	public void Nhap() {
		super.Nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap noi DK: ");
		setNoiDK(sc.nextLine());
	}
	public void Xuat() {
		super.Xuat();
		System.out.println("NOI DANG KY: "+getNoiDK());
	}

	@Override
	public String toString() {
		return "XeVinfast [noiDK=" + noiDK + "," + super.toString() + "]";
	}
	
	public double tinhphitruocba() {
		return PHI_TRUOC_BA * TinhGiaBan();
	}
	
	public double PhiDK () {
		if (noiDK.equals("Ha Noi")) {
			return 0.12;
		}
		else {
			return 0.1;
		}
	}
	public double TinhlanBanh () {
		return TinhGiaBan()+tinhphitruocba()+PhiDK();
	}
	
}
