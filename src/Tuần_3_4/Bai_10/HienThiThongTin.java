package Tuần_3_4.Bai_10;

import Tuần_3_4.Bai_7.Employee;
import Tuần_3_4.Bai_7.QuanLy;
import Tuần_3_4.Bai_7.Student;

import java.util.Scanner;

public class HienThiThongTin {
    public static void main(String[] args) {
        KhachHang khachHang = new KhachHang();
        SinhVien sinhVien = new SinhVien();
        NhanVien nhanVien = new NhanVien();
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int i = in.nextInt();
        switch (i) {
            case 1:
                sinhVien.setHoTen(name);
            case 2:
                nhanVien.setHoTen(name);
            case 3:
                khachHang.setHoTen(name);
        }
    }
}
