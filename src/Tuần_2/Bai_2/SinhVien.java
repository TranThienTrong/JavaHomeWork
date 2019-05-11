package Tuần_2.Bai_2;

public class SinhVien {
int id;
String Hoten;
float diemLT, diemTH;

    public SinhVien(int id, String hoten, float diemLT, float diemTH) {
        this.id = id;
        Hoten = hoten;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public SinhVien() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    float diemTB(){
        return (diemLT+diemTH)/2;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", Hoten='" + Hoten + '\'' +
                ", diemLT=" + diemLT +
                ", diemTH=" + diemTH +
                '}';
    }
}
