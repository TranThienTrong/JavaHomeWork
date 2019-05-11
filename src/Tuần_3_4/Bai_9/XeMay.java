package Tuần_3_4.Bai_9;

public class XeMay extends Xe {
    public XeMay(int speed,int numberOfWheel,boolean engine, int soCho ) {
        this.speed=speed;
        this.numberOfWheel=numberOfWheel;
        this.engine=engine;
        this.soCho=soCho;
    }

    double tax(Xe xe) {
        return 10;
    }
}
