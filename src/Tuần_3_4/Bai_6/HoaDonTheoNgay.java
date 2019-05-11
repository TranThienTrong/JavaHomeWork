package Tuần_3_4.Bai_6;

public class HoaDonTheoNgay {
    String maHoaDon, tenKH, maPhong;
    int donGia, soNgayThue;

    int thanhTien() {
        if (soNgayThue > 7)
            return (int) (soNgayThue * donGia * 0.2);
        else
            return soNgayThue * donGia;
    }
}
