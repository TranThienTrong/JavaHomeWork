package Tuần_2.Bai_6;

import java.util.Date;

public class HangThucPham {
private String maHang;
String tenHang;
int donGia;
static Date nxs=new Date();
Date hsd= new Date();

    public String getMaHang() {
        return maHang;
    }



    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public static Date getNxs() {
        return nxs;
    }

    public static void setNxs(Date nxs) {
        HangThucPham.nxs = nxs;
    }

    public Date getHscd() {
        return hsd;
    }

    public void setHsc(Date hsc) {
        this.hsd = hsc;
    }


    public HangThucPham(String maHang, String tenHang, int donGia,Date nxs, Date hsd) {
        this.maHang = maHang;
        if (maHang==null)maHang="";
        this.tenHang = tenHang;
        if (donGia<=0) donGia=1;
        this.donGia = donGia;
        if (nxs.before(hsd)) {
            this.nxs = nxs;
            this.hsd = hsd;
        }
    }
}
