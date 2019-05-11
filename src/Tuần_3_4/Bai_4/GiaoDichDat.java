package Tuần_3_4.Bai_4;

import java.util.Date;

public class GiaoDichDat {
String maGD;
Date ngayGD;
int donGia;
String loaiDat;
float dienTich;

    public GiaoDichDat(String maGD, Date ngayGD, int donGia, String loaiDat, float dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.loaiDat = loaiDat;
        this.dienTich = dienTich;
    }

    public GiaoDichDat() {
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public Date getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(Date ngayGD) {
        this.ngayGD = ngayGD;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    int thanhTien(){
    if(loaiDat=="B"||loaiDat=="C"){
        return (int)(dienTich *donGia);
    }
    else
        return (int)(dienTich*donGia*1.5);
    
}
}
