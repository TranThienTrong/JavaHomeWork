package Tuần_3_4.Bai_6;

public class HoaDonTheoGio extends HoaDonTheoNgay{
    int soGioThue;
    int thanhTien() {
        if (soGioThue > 24 && soGioThue < 30)
            soGioThue = 24;
        return soGioThue * donGia;

    }


}
