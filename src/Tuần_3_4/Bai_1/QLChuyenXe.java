package Tuần_3_4.Bai_1;

import java.util.Scanner;

public class QLChuyenXe {

    public static void main(String[] args) {

        int x;

        Scanner a = new Scanner(System.in);

        ListChuyenXe dscx = new ListChuyenXe();

        do {
            System.out.println("\n\t-----------------------------------");
            System.out.println("\t0. Exit");
            System.out.println("\t1. Them Chuyen Xe Noi Thanh");
            System.out.println("\t2. Them Chuyen Xe Ngoai Thanh");
            System.out.println("\t3. Hien thi danh muc Chuyen Xe");
            System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            x = a.nextInt();
            System.out.println("------>>");
            switch (x) {
                case 1:
                    dscx.listcx(1);
                    break;
                case 2:
                    dscx.listcx(2);
                    break;
                case 3:
                    dscx.xuattt();
                    break;
            }
        } while (x != 0);
        System.out.println("");
    }
}
