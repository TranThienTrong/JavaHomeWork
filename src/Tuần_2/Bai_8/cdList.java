package Tuần_2.Bai_8;

import java.util.ArrayList;
import java.util.List;

public class cdList implements Comparable<CD> {

    public int compareGiaThanh(CD first, CD second) {
        return Integer.compare((int)first.getGiaThanh(), (int)second.getGiaThanh());
    }

    public static void main(String[] args) {
        List<CD> cdL=new ArrayList<CD>();
        CD cd=new CD(123, "Hello", "Word", 1, 100);
        cdL.add(cd);

    }


    @Override
    public int compareTo(CD o) {
        return 0;
    }
    public int compareTuaCD(CD first, CD second) {
        return CharSequence.compare(first.getTuaCD(), second.getTuaCD());
    }


}
