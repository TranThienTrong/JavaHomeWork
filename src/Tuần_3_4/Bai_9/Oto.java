package Tuần_3_4.Bai_9;

public class Oto extends Xe {
    public Oto(int speed, int numberOfWheel, boolean engine, int soCho) {
        this.speed = speed;
        this.numberOfWheel = numberOfWheel;
        this.engine = engine;
        this.soCho = soCho;
    }

    double tax(Xe xe) {
        if (xe.numberOfWheel >= 5)
            return 0.3;
        else
            return 0.5;

    }
}
