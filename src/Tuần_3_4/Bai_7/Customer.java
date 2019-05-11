package Tuần_3_4.Bai_7;

public class Customer extends Person {
double luong;
String chucVu;

    public Customer(double luong, String chucVu) {
        this.luong = luong;
        this.chucVu = chucVu;
    }

    public Customer() {
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
}
