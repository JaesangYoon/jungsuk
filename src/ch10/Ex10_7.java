package ch10;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Ex10_7 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###,##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            // 형식화: 숫자, 날짜 -> 특정 형식의 문자열
            Number num = df.parse("1,234,567.89"); // 형식 문자열 -> 숫자
            System.out.print("1,234,567,89" + " -> ");

            double d = num.doubleValue();
            System.out.print(d + " -> ");

            System.out.println(df2.format(num)); // 숫자 -> 형식 문자열
        } catch (Exception e) {}
    }
}
