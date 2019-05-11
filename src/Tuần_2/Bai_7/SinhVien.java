package Tuần_2.Bai_7;


public class SinhVien{
    int id;
    String hoTen;
    String diaChi;
    int sdt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public SinhVien(int id, String hoTen, String diaChi, int sdt) {
        this.id = id;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public SinhVien() {
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", hoTen='" + hoTen + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", sdt=" + sdt +
                '}';
    }
}
