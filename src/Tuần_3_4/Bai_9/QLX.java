package Tuần_3_4.Bai_9;

public class QLX {


    public static void main(String[] args) {
        Xe xeDap = new XeDap(5, 2, false, 2);
        xeDap.tax(xeDap);
        Xe xeDien = new XeDien(10, 2, true, 2);
        xeDien.tax(xeDien);
        Xe xeMay = new XeMay(125, 2, true, 2);
        xeMay.tax(xeMay);
        Xe xeDapDiaHinh = new XeDapDiaHinh(30, 2, false, 1);
        xeDapDiaHinh.tax(xeDapDiaHinh);
        Xe xeTai = new XeTai(125, 4, true, 4);
        xeTai.tax(xeTai);
        Xe oto = new Oto(250, 4, true, 4);
        oto.tax(oto);
    }
}
