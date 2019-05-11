package Tuần_3_4.Bai_1;

import java.util.Scanner;

public class ChuyenXe {

    protected String Macx, NameTX, SoX;

    protected double DoanhThu;

    Scanner in = new Scanner(System.in);

    protected void setMacx(String macx) {

        Macx = macx;

    }

    protected String getMacx() {

        return Macx;

    }

    protected void setNameTX(String nameTX) {

        NameTX = nameTX;

    }

    protected String getNameTX() {

        return NameTX;

    }

    protected void setSoX(String soX) {

        SoX = soX;

    }

    protected String getSoX() {

        return SoX;

    }

    protected void setDoanhThu(double doanhThu) {

        DoanhThu = doanhThu;

    }

    protected double getDoanhThu() {

        return DoanhThu;

    }

    protected ChuyenXe() {

        this.Macx = "";

        this.NameTX = "";

        this.SoX = "";

        this.DoanhThu = 0;

    }

    protected ChuyenXe(String ma, String name, String sx, double dt) {

        this.Macx = ma;

        this.NameTX = name;

        this.SoX = sx;

        this.DoanhThu = dt;

    }

    protected void nhap() {

        System.out.println("Nhap MaSo Chuyen: ");

        this.Macx = in.nextLine();

        System.out.println("Ho Ten Tai Xe: ");

        this.NameTX = in.nextLine();

        System.out.println("So Xe: ");

        this.SoX = in.nextLine();

        System.out.println("Doanh Thu: ");

        this.DoanhThu = in.nextDouble();

    }

    public String toString() {


        return "\nMS chuyen: " + this.Macx + "\nName Tai Xe: " + this.NameTX

                + "\nSo Xe: " + this.SoX;

    }

}
