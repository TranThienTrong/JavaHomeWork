package Tuần_3_4.Bai_7;

public class Employee extends Person {
    double heSoLuong;

    public Employee(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    double tinhLuong() {
        return heSoLuong;
    }

    public Employee() {
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
