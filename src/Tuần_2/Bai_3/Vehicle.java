package Tuần_2.Bai_3;

public class Vehicle {
int giaTriXe;
int dungTich;
double tax(){
    if (dungTich<100)return giaTriXe*=0.1;
    else if (100<dungTich&& dungTich<200) return giaTriXe*=0.3;
    else return giaTriXe*=0.5;
}

    public Vehicle(int giaTriXe, int dungTich) {
        this.giaTriXe = giaTriXe;
        this.dungTich = dungTich;
    }

    public int getGiaTriXe() {
        return giaTriXe;
    }

    public void setGiaTriXe(int giaTriXe) {
        this.giaTriXe = giaTriXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public Vehicle() {
    }

    public static void main(String[] args) {
        Vehicle xe1=new Vehicle();
        Vehicle xe2=new Vehicle();
        Vehicle xe3=new Vehicle();
    }
}
