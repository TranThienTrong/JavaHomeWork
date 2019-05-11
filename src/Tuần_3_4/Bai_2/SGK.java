package Tuần_3_4.Bai_2;

public class SGK {
String maSach;
String ngayNhap;
int donGia;
int soLuong;
String nxb;
boolean isNew=false;

    public SGK(String maSach, String ngayNhap, int donGia, int soLuong, String nxb, boolean isNew) {
        this.maSach = maSach;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.nxb = nxb;
        this.isNew = isNew;
    }

    public SGK() {
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    int thanhTien(){
    if(isNew==true) return soLuong*donGia;
    else return soLuong*(donGia/2);
}

}
