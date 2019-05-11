package Tuần_2.Bai_1;

public class HinhChuNhat {
float cd,cr;

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "cd=" + cd +
                ", cr=" + cr +
                '}';
    }

    public float getCd() {
        return cd;
    }

    public void setCd(float cd) {
        this.cd = cd;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }

    public HinhChuNhat(float cd, float cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public HinhChuNhat() {
    }

    float chuVi(){
        return cd+cr;
    }

    float dienTich(){
        return cd*cr;
    }

    public static void main(String[] args) {

    }
}
