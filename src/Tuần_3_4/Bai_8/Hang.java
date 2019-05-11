package Tuần_3_4.Bai_8;

abstract class Hang {
    String maHang;
    String tenHang;
    int soLuongHang;
    double donGia;

    double VAT(){
        return donGia;
    }

    public String getMaHanng() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getSoLuongHang() {
        return soLuongHang;
    }

    public void setSoLuongHang(int soLuongHang) {
        this.soLuongHang = soLuongHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Hang(String maHang,String tenHang, int soLuongHang,double donGia){
        if (this.tenHang==null||this.tenHang.equals(null)){
            tenHang="";
        }
        if(this.soLuongHang<0) soLuongHang=0;
        if (this.donGia<=0) donGia =1;
    }
}
