package Tuần_3_4.Bai_7;

abstract class Person {
String hoTen, diaChi;

    @Override
    public String toString() {
        return super.toString();
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
