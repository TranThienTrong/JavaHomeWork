package Tuần_2.Bai_8;

import java.util.ArrayList;
import java.util.List;


public class CD{
    int maCD;
    String tuaCD;
    String caSy;
    int soBaiHat;
    float giaThanh;

    public CD(int maCD, String tuaCD, String caSy, int soBaiHat, float giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    @Override
    public String toString() {
        return "CD{" +
                "maCD=" + maCD +
                ", tuaCD='" + tuaCD + '\'' +
                ", caSy='" + caSy + '\'' +
                ", soBaiHat=" + soBaiHat +
                ", giaThanh=" + giaThanh +
                '}';
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }



}
