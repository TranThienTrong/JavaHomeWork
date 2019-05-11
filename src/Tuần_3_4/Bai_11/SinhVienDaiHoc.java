package Tuần_3_4.Bai_11;

public class SinhVienDaiHoc extends SinhVien {
    public SinhVienDaiHoc(){
        if (age<18) age=18;
        this.abroad=false;
        yearStudying=4;
    }

}
