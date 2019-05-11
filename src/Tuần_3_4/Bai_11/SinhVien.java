package Tuần_3_4.Bai_11;

public class SinhVien {
int age;
boolean abroad;
int yearStudying;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAbroad() {
        return abroad;
    }

    public void setAbroad(boolean abroad) {
        this.abroad = abroad;
    }

    public int getYearStudying() {
        return yearStudying;
    }

    public void setYearStudying(int yearStudying) {
        this.yearStudying = yearStudying;
    }

    public SinhVien(int age, boolean abroad, int yearStudying) {
        this.age = age;
        this.abroad = abroad;
        this.yearStudying = yearStudying;
    }

    public SinhVien() {
    }
}
