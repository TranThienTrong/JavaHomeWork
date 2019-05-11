package Tuần_3_4.Bai_1;

import java.util.Scanner;

class NgoaiThanh extends ChuyenXe

{

    private String NoiDen;

    private int SoNgay;

    Scanner in = new Scanner(System.in);

    public void setNoiDen(String noiDen) {

        NoiDen = noiDen;

    }

    public String getNoiDen() {

        return NoiDen;

    }

    public void setSoNgay(int soNgay) {

        SoNgay = soNgay;

    }

    public int getSoNgay() {

        return SoNgay;

    }

    public NgoaiThanh()

    {

        super();

        this.SoNgay=0;

        this.NoiDen="";

    }

    public NgoaiThanh(String ma, String name, String sx, double dt, String nd, int sn)

    {

        super(ma, name, sx, dt);

        this.SoNgay=sn;

        this.NoiDen=nd;

    }

    public void nhap()

    {

        super.nhap();

        System.out.println("Noi Den: ");

        this.NoiDen=in.nextLine();

        System.out.println("So Ngay: ");

        this.SoNgay=in.nextInt();

    }

    public String toString(){

        return "Chuyen Xe Ngoai Thanh" + super.toString()

                + "\nNoi Den: " + this.NoiDen + "\nSo Ngay: " + this.SoNgay + "\nDoanh Thu: " + this.DoanhThu;

    }

}
