package Tuần_3_4.Bai_1;

import java.util.Scanner;

class NoiThanh extends ChuyenXe

{

    private double SoKm;

    private String SoTuyen;

    Scanner in = new Scanner(System.in);

    public NoiThanh()

    {

        super();

        this.SoTuyen="";

        this.SoKm=0;

    }

    public NoiThanh(String ma, String name, String sx, double dt, String st, double skm)

    {

        super(ma, name, sx, dt);

        this.SoTuyen=st;

        this.SoKm=skm;

    }

    public void setSoKm(double soKm) {

        SoKm = soKm;

    }

    public double getSoKm() {

        return SoKm;

    }

    public void setSoTuyen(String soTuyen) {

        SoTuyen = soTuyen;

    }

    public String getSoTuyen() {

        return SoTuyen;

    }

    public void nhap()

    {

        super.nhap();

        System.out.println("Nhap So Tuyen: ");

        this.SoTuyen=in.nextLine();

        System.out.println("So Km: ");

        this.SoKm=in.nextDouble();
    }

    public String toString()

    {

        return "Chuyen Xe Noi Thanh " + super.toString()

                + "\n So Tuyen: " + this.SoTuyen + "\nSo Km: " + this.SoKm + "\nDoanh Thu: " + this.DoanhThu;

    }

}
