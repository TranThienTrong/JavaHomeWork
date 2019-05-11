package Tuần_3_4.Bai_10;

public class NhanVien extends ThongTinConNguoi {
    double heSoLuong;

    public NhanVien(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    double tinhLuong() {
        return heSoLuong;
    }

    public NhanVien() {
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    String danhGia() {
        return "Tot";
    }

    @Override
    public String toString() {
        return "Ten " + hoTen + "dia chi " + diaChi + "tien luong " + tinhLuong();
    }

}
