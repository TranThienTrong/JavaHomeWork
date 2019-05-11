package Tuần_3_4.Bai_2;

public class STK extends SGK {
    int tax;

    int thanhTien() {
        return soLuong * donGia + tax;
    }

    public STK(String maSach, String ngayNhap, int donGia, int soLuong, String nxb, boolean isNew, int tax) {
        super(maSach, ngayNhap, donGia, soLuong, nxb, isNew);
        this.tax = tax;
    }

    public STK() {

    }
}
