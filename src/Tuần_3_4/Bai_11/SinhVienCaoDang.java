package Tuần_3_4.Bai_11;

public class SinhVienCaoDang extends SinhVien {
    public SinhVienCaoDang(){
        if (age<18) age=18;
        this.abroad=false;
        yearStudying=2;
    }
}
