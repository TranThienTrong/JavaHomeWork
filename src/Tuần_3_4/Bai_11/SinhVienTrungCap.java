package Tuần_3_4.Bai_11;

public class SinhVienTrungCap extends SinhVien{
    public SinhVienTrungCap(){
        if (age<18) age=18;
        yearStudying=2;
        this.abroad=false;
    }
}
