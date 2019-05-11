package Tuần_3_4.Bai_8;

import java.util.Calendar;
import java.util.Date;

public class HangSanhSu extends Hang {
    String nhaSanXuat;
    Date ngayNhapKho=new Date();



    public HangSanhSu(String maHang, String tenHang, int soLuongHang, double donGia, String nhaSanXuat, Date ngayNhapKho) {
        super(maHang, tenHang, soLuongHang, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    @Override
    double VAT() {
        return donGia*0.1;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

    public HangSanhSu(String maHang, String tenHang, int soLuongHang, double donGia) {
        super(maHang, tenHang, soLuongHang, donGia);
    }
}
