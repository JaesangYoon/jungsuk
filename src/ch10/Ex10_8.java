package ch10;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_8 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

        System.out.println(sdf1.format(today));
        System.out.println(sdf3.format(today));


    }
}
