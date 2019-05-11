package Tuần_3_4.Bai_7;

public class Student extends Person {
    double diemMH1, diemMH2;

    double tinhDiemTB() {
        return (diemMH1 + diemMH2) / 2;
    }

    String danhGia(){
        if(tinhDiemTB()<5)
            return "TB";
        else if(tinhDiemTB()<8)
            return "Kha";
        else
            return "Gioi";
    }

    public Student(double diemMH1, double diemMH2) {
        this.diemMH1 = diemMH1;
        this.diemMH2 = diemMH2;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Ten "+hoTen+"dia chi "+diaChi+"diem trung binh "+tinhDiemTB();
    }
}
