package Tuần_3_4.Bai_4;

import java.util.Date;

public class GiaoDichNha extends GiaoDichDat{
    String loaiNha,diaChi;

    public GiaoDichNha() {
    }

    public GiaoDichNha(String loaiNha, String diaChi) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    int thanhTien() {
        if(loaiNha=="cao cap")
            return (int)dienTich*donGia;
        else
            return (int)(dienTich*donGia*0.9);
    }
}
