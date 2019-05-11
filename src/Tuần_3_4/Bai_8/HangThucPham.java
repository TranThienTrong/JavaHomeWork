package Tuần_3_4.Bai_8;

import java.util.Date;

public class HangThucPham extends Hang {
    Date nxs;
    Date hsd;
    String nhaCungCap;

    public Date getNxs() {
        return nxs;
    }

    public void setNxs(Date nxs) {
        this.nxs = nxs;
    }

    public HangThucPham(String maHang, String tenHang, int soLuongHang, double donGia) {
        super(maHang, tenHang, soLuongHang, donGia);
    }
    @Override
    double VAT() {
        return donGia*0.05;
    }

    public Date getHsd() {
        return hsd;
    }

    public void setHsd(Date hsd) {
        this.hsd = hsd;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public HangThucPham(String maHang, String tenHang, int soLuongHang, double donGia, Date nxs, Date hsd){
        super(maHang,tenHang,soLuongHang,donGia);
        if(nxs.after(hsd)){
            System.out.printf("NSX undefined");
        }
    }
}
