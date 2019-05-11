package Tuần_3_4.Bai_8;

public class HangDienMay extends Hang {
    int thoiGianBaoHanh = 1;
    int congSuat;

    public HangDienMay(String maHang, String tenHang, int soLuongHang, double donGia, int thoiGianBaoHanh, int congSuat) {
        super(maHang, tenHang, soLuongHang, donGia);
        if(thoiGianBaoHanh<0)thoiGianBaoHanh=thoiGianBaoHanh;
        else
            this.thoiGianBaoHanh = thoiGianBaoHanh;
        if (congSuat<=0) this.congSuat=1;
        else
            this.congSuat = congSuat;
    }

    @Override
    double VAT() {
        return donGia*0.1;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public HangDienMay(String maHang, String tenHang, int soLuongHang, double donGia) {
        super(maHang, tenHang, soLuongHang, donGia);
    }
}
