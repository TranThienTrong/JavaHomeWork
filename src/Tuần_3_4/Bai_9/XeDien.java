package Tuần_3_4.Bai_9;

public class XeDien extends Xe {
    public XeDien(int speed,int numberOfWheel,boolean engine, int soCho ) {
        this.speed=speed;
        this.numberOfWheel=numberOfWheel;
        this.engine=engine;
        this.soCho=soCho;
    }

    double tax(Xe xe) {
        return 0.1;
    }
}
