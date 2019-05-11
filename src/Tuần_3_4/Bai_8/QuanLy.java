package Tuần_3_4.Bai_8;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class QuanLy {
    static Date date = new Date();

    public static void main(String[] args) {
        HangDienMay hangDienMay = new HangDienMay("123", "abc", 10, 10, 5, 5);
        HangThucPham hangThucPham = new HangThucPham("123", "abc", 10, 10);
        HangSanhSu hangSanhSu = new HangSanhSu("123", "abc", 10, 10);

        Calendar cal = Calendar.getInstance();
        cal.setTime(hangSanhSu.ngayNhapKho);
        int month = cal.get(Calendar.MONTH);

        if (hangDienMay.soLuongHang < 3) System.out.println("Ban dc");
        if (hangThucPham.soLuongHang > 0 && hangThucPham.hsd.before(date)) System.out.println("Ban dc");
        if (hangSanhSu.soLuongHang > 50 && month > 10) System.out.println("Cham");


    }
}
